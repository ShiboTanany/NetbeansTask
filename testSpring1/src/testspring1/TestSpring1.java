/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shibo
 */
public class TestSpring1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext app = new FileSystemXmlApplicationContext("test1.xml");
        parent  x = (parent) app.getBean("parent");
        // System.out.println(""+x.getName());
        System.out.println("" + x.getProductionDate().toString());
    }

}
