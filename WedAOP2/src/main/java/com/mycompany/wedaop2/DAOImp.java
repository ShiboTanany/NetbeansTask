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
public class DAOImp implements UserDao{

    public DAOImp() {
        System.out.println("hello");
    }

    public void newz(){
        System.out.println("jdksjdkjskdjs");
}
    
    
    @Override
    public void addUser(User u) {
       
        System.out.println("user added");
    }

    @Override
    public String getName() {
       return "";   }

    @Override
    public void deleteUser(User u) throws Exception {
    
        System.out.println("user deleted");
    }

    @Override
    public void sayHiUser(int y) {
        System.out.println("dkslkdlsk");    
    }
    
}
