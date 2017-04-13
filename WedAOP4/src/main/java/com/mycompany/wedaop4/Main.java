/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shibo
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext app = new FileSystemXmlApplicationContext("src/main/java/com/mycompany/wedaop4/beans.xml");
        Calculator a = (Calculator) app.getBean("x");

        Max maxCalc = (Max) a;
        Min minCalc = (Min) a;
        System.out.println(""+minCalc.findMin(6, 8));

    }
}
