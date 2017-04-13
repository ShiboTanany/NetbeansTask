/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monannotation1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shibo
 */
public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext appContext = new FileSystemXmlApplicationContext("beans.xml");
        Bank bank = (Bank) appContext.getBean("bank");
        System.out.println(""+bank);
        appContext.registerShutdownHook();;
    }

}
