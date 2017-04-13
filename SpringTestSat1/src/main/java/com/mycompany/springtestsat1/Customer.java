/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springtestsat1;

import java.util.Map;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Value;
/**
 *
 * @author shibo
 */
enum s {

    winter, summer;
}

@Component("Customer")
public class Customer {

   
    private int id;
    private Properties pros;

    public Properties getPros() {
        return pros;
    }

    @Autowired
    public void setPros(Properties pros) {
        this.pros = pros;
    }

    public int getId() {
        return id;
    }
//T(Math).PI
    @Autowired
    public void setId(@Value("#{2 eq 2}")int id) {
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
