/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control;

import com.entity.getSession;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author shibo
 */
@ManagedBean
@SessionScoped
public class Person {

    private int id;
    private String email;
    private String password;
    private String errorMessage;

    private String greeting;

    public String getGreeting() {
        if (email!=null&&email.length() == 0) {
            return "";
        } else {
            return "Welcome to JSF2 + Ajax, " + email + "!";
        }
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Person() {
    }

    public Person(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String loginUser() {

        getSession P = new getSession();
        boolean flag = P.loginUser(this);
        if (flag) {
            errorMessage = "";
            return "Welcome.xhtml";
        } else {
            errorMessage = "you have not any creditaals";
            return "index.xhtml";
        }

    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
