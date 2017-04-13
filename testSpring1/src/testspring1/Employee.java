/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspring1;

import java.util.Date;
 
public class Employee {
 
    private int empId;
    private String name;
    private String role;
    private Date doj;
     
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Date getDoj() {
        return doj;
    }
    public void setDoj(Date doj) {
        this.doj = doj;
    }
    public void testMe(){
        System.out.println("Employee: Doj: "+this.doj);
    }
     
}
//- See more at: http://www.java2novice.com/spring/inject-date-bean-property/#sthash.xL6jkbGh.dpuf