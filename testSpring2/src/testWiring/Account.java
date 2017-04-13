/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testWiring;

import testPackage.*;

/**
 *
 * @author shibo
 */
public class Account {

    private int id;
    private Customer customer;
     private Customer customer1;
      private Customer customer2;
      
    private double cash;

    public testWiring.Customer getCustomer1() {
        return customer1;
    }

    public void setCustomer1(testWiring.Customer customer1) {
        this.customer1 = customer1;
    }

    public testWiring.Customer getCustomer2() {
        return customer2;
    }

    public void setCustomer2(testWiring.Customer customer2) {
        this.customer2 = customer2;
    }

    public Account(testWiring.Customer customer, testWiring.Customer customer1, testWiring.Customer customer2) {
        this.customer = customer;
        this.customer1 = customer1;
        this.customer2 = customer2;
    }

  

//    public Account(int id, Customer customer, double cash) {
//        this.id = id;
//        this.customer = customer;
//        this.cash = cash;
//    }

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

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", customer=" + customer + ", cash=" + cash + '}';
    }

}
