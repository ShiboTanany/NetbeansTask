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
public class Product {

    private int id;
    private String name;
    private int price;

    private Customer customer;

    public void init() {
        System.out.println("init method in product");
    }
     public void init2() {
        System.out.println("init beans  method in product");
    }
    public void close() {
        System.out.println("close method in product");
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product() {
        System.out.println("product access ");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
