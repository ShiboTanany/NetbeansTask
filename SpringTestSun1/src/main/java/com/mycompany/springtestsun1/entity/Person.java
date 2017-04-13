/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springtestsun1.entity;

import java.io.Serializable;

/**
 *
 * @author shibo
 */
public class Person implements Serializable{

    private int id;
    private String email;
    private String username;
    private String password;

    public Person(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Person(int id, String email, String username, String password) {
        
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Person() {
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", email=" + email + ", username=" + username + ", password=" + password + '}';
    }

}
