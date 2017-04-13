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
public class Customer {

    private int id;
    private String name;
    private int age;
    private String professinName;

    public Customer(int id, String name, int age, String professinName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.professinName = professinName;
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

    public String getProfessinName() {
        return professinName;
    }

    public void setProfessinName(String professinName) {
        this.professinName = professinName;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", age=" + age + ", professinName=" + professinName + '}';
    }

}
