/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tln.repository.impl;

import com.tln.pojo.Category;
import com.tln.repository.CategoryRepository;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository{
    
    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<Category> getCates() {
       Session s = this.factory.getObject().getCurrentSession();
       Query q = s.createQuery("FROM category",Category.class);
       return q.getResultList();
    }
}
