/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tln.hibernatedemo;

import com.tln.reponsitory.impl.CategoryReponsitoryImpl;
import com.tln.reponsitory.impl.ProductReponsitoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        //chay statsRepository
        CategoryReponsitoryImpl cates = new CategoryReponsitoryImpl();
        cates.getCates().forEach(c -> System.out.println(c.getName()));
        
        ProductReponsitoryImpl prods = new ProductReponsitoryImpl();
        Map<String,String> params = new HashMap<>();
        
        //params.put("kw", "iphone");
        params.put("fromPrice","2500000");
        prods.getProducts(params).forEach(p->System.out.printf("%d - %s - %d\n", p.getId(),p.getName(),p.getPrice()));
        
    }
}
