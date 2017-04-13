/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monannotation1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author shibo
 */
@Component
public class Customer {

    private int id;
    private String name;
    private int age;
    
    private Product product;

    @Autowired
    public Customer(@Value("#{454}") int id, @Value("SHIBO") String name, @Value("#{23}") int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", age=" + age + ", product=" + product + '}';
    }

    public Product getProduct() {
        return product;
    }

    @Autowired
    @Required
    public void setProduct(Product product) {
        this.product = product;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
