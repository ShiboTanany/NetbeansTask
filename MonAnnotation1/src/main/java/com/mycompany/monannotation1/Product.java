/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monannotation1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author shibo
 */
@Component 

public class Product {
    private int id;
    private String name;
    private String manfName;
@Autowired
    public Product(@Value("#{4}")int id, @Value("LABTOP")String name, @Value("HP")String manfName) {
        this.id = id;
        this.name = name;
        this.manfName = manfName;
    }

    public Product() {
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

    public String getManfName() {
        return manfName;
    }

    public void setManfName(String manfName) {
        this.manfName = manfName;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", manfName=" + manfName + '}';
    }
    
    
    
}
