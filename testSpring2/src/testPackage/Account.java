/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

/**
 *
 * @author shibo
 */
public class Account {

    private int id;
    private Customer customer;
    private double cash;

    public Account() {
    }

    public Account(int id, Customer customer, double cash) {
        this.id = id;
        this.customer = customer;
        this.cash = cash;
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
