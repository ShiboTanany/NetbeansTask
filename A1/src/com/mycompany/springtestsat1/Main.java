/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springtestsat1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shibo
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        Product s = (Product) context.getBean("Product2");
        System.out.println(""+s.getName()+s.getId());
//        s.setId(121);
//        Product s2 = (Product) context.getBean("Product");
////        System.out.println("0" + s2.getId());
//        System.out.println("s1 is "+s);
//        System.out.println("s1 is "+s.getCustomer());
//        System.out.println("s2 is "+s2.getCustomer());
  //    context.
              
    }
}
