/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop2;

/**
 *
 * @author shibo
 */
public class CloneTest  implements Cloneable{
   int id;
   Main main;
   
    
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest test=new CloneTest();
        test.id=3;
        Main n=new Main();
        test.main=n;
        CloneTest test2=(CloneTest) test.clone();
        System.out.println(""+test2.id);
        System.out.println(""+test.main);
        System.out.println(""+test2.main);
        
    }
}
