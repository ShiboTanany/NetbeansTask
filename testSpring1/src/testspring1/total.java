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
public class total {
    private product product;
    
    private product product1;
    private Customer customer;
    
    
    private parent parent;

    
    
    
    public parent getParent() {
        return parent;
    }

    public void setParent(parent parent) {
        this.parent = parent;
    }

//    public total(product product) {
//         System.out.println("acheived in  product");
//        this.product = product;
//    }

    public total(parent parent) {
        System.out.println("acheived in  parent");
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "total{" + "product=" + product + ", product1=" + product1 + ", customer=" + customer + ", parent=" + parent + '}';
    }
    
    
    
    
    
    
    
    

    public product getProduct1() {
        return product1;
    }

    public void setProduct1(product product1) {
        this.product1 = product1;
    }

    
    
    
    
    public product getProduct() {
        return product;
    }

    public void setProduct(product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public total(product product, parent parent) {
        System.out.println("product +parent");
        this.product = product;
        this.parent = parent;
    }
    
     public total( parent parent,product product) {
         System.out.println("parent +product");
        this.product = product;
        this.parent = parent;
    }
    
    
}
