/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tuesaop1;

/**
 *
 * @author shibo
 */
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
       ApplicationContext app =new FileSystemXmlApplicationContext("beans_2.xml");
       Calculator cal=(Calculator)app.getBean("calculator2");
       double x=cal.divide(5,2);
        System.out.println(""+x);
    }
}
