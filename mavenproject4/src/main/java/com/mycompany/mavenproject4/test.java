/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shibo
 */
public class test implements test8,Cloneable {
int id;
    static {

        System.out.println("sldksldks");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int y() {

        System.out.println("lkdlskdlks");
        return 8;
    }
    public static void main(String[] args) {
      test t=new test();
      t.id=5;
    try {
        test t2=(test)    t.clone();
        System.out.println(""+t2.id);
    } catch (CloneNotSupportedException ex) {
        Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
    }
              
    }

}
