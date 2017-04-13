/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author shibo
 */
public class Person {

    
    public Person(String email, String username, String password) {
        
        this.username=username;
        this.password=password;
        this.email=email;
               
        }

    @Override
    public String toString() {
        return "Person{" + "email=" + email + ", username=" + username + ", password=" + password + ", confrimPassword=" + confrimPassword + '}';
    }
 
    private String email;
    private String username;
    private String password;
    private String confrimPassword;

    public Person(String parameter, String parameter0, String parameter1, String parameter2) {
    email=parameter;
    username=parameter0;
    password=parameter1;
    confrimPassword=parameter2;
    
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

    public String getConfrimPassword() {
        return confrimPassword;
    }

    public void setConfrimPassword(String confrimPassword) {
        this.confrimPassword = confrimPassword;
    }

}
