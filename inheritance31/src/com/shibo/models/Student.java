package com.shibo.models;
// Generated Mar 22, 2017 9:43:59 AM by Hibernate Tools 4.3.1



/**
 * Student generated by hbm2java
 */
public class Student extends Person implements java.io.Serializable {


 
     private String department;

    public Student() {
    }

    public Student( String department) {
       
       this.department = department;
    }
   
   
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }




}


