/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspring1;

/**
 *
 * @author shibo
 */
public class Customer {

    private int id;
    private String name;
    private int age;
    private product product;

    public product getProduct() {
        return product;
    }

    public void setProduct(product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", age=" + age + ", product=" + product + '}';
    }

    
    
    
    public Customer(int id, String name, int age, product product) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.product = product;
    }

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Customer() {
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
