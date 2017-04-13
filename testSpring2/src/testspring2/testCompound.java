/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import testCompound.class1;

/**
 *
 * @author shibo
 */
public class testCompound {
    public static void main(String[] args) {
             ApplicationContext app = new FileSystemXmlApplicationContext("beans.xml");
             class1 class1=(class1) app.getBean("class1");
             System.out.println(""+class1.getClass2().getClass3().getName());
             
    }
}
