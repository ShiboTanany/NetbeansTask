/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springtestsat1;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shibo
 */

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        Customer customer = (Customer) context.getBean("Customer");
        System.out.println(""+customer.getId());

//        Product s = (Product) context.getBean("Product2");
//        System.out.println(""+s.getName()+s.getId());
//        
//        Customer customer=(Customer)context.getBean("p22");
//        
//        Properties x=       customer.getPros();
//        System.out.println(""+x.getProperty("admin"));
//        System.out.println(""+x.getProperty("user"));
//        System.out.println(""+x.getProperty("support"));
//        context.registerShutdownHook();
//        s.setId(121);
//        Product s2 = (Product) context.getBean("Product");
////        System.out.println("0" + s2.getId());
//        System.out.println("s1 is "+s);
//        System.out.println("s1 is "+s.getCustomer());
//        System.out.println("s2 is "+s2.getCustomer());
        //    context.
    }
}
