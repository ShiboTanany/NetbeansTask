/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monannotation1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author shibo
 */
@Component
//@Repository
public class Bank {

    private int id;

    private Customer customer;

    @Autowired
    public Bank(@Value("#{5+5}") int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    @PostConstruct
    public void init() {
        System.out.println("init method");
    }

    @PreDestroy
    public void close() {
        System.out.println("close method");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Bank{" + "id=" + id + ", customer=" + customer + '}';
    }

    public Bank() {
    }

}
