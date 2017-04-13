/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspring1;

import java.util.Date;

/**
 *
 * @author shibo
 */
public class product extends parent {
    
    private int id;
    private String name;
    private double price;
    private Date productionDate;
    private String manfName;

    public product(int id, String name, double price, Date productionDate, String manfName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productionDate = productionDate;
        this.manfName = manfName;
    }

    public product(String name, double price, String manfName) {
        this.name = name;
        this.price = price;
        this.manfName = manfName;
    }

    public product() {
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", price=" + price + ", productionDate=" + productionDate + ", manfName=" + manfName + '}';
    }

    public product(int id, String name, double price, Date productionDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productionDate = productionDate;
    }

    public product(String name, double price, Date productionDate, String manfName) {
        this.name = name;
        this.price = price;
        this.productionDate = productionDate;
        this.manfName = manfName;
    }

    public product(int id, String manfName) {
        this.id = id;
        this.manfName = manfName;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public String getManfName() {
        return manfName;
    }

    public void setManfName(String manfName) {
        this.manfName = manfName;
    }
    
    
    
    
    
    
    
}
