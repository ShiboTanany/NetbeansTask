package com.entity;
// Generated Mar 25, 2017 1:02:23 PM by Hibernate Tools 4.3.1


import com.control.Person;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name = "Person",
        catalog = "testShibo"
)
public class PersonHibernate implements java.io.Serializable {

   

    private int id;
    private String email;
    private String password;

    public PersonHibernate() {
    }

    public PersonHibernate(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    @Id

    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  

  
   
//    public static void main(String[] args) {
//        PersonHibernate P=new PersonHibernate();
//        Session s=P.getSession();
//        System.out.println("0"+s);
//    }
        
}