/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springtestsat1;

/**
 *
 * @author shibo
 */
enum s {

    winter, summer;
}

public class Customer {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void init() {

        System.out.println("init method");
    }

    public void close() {

        System.out.println("close method");
    }

    public Customer() {
        
        System.out.println("constructor accessed");
        
    }

}
