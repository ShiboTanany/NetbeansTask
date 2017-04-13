/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shibo
 */
@Entity
@Table(name = "person2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Person2.findAll", query = "SELECT p FROM Person2 p")
    , @NamedQuery(name = "Person2.findById", query = "SELECT p FROM Person2 p WHERE p.id = :id")
    , @NamedQuery(name = "Person2.findByEmail", query = "SELECT p FROM Person2 p WHERE p.email = :email")
    , @NamedQuery(name = "Person2.findByName", query = "SELECT p FROM Person2 p WHERE p.name = :name")
    , @NamedQuery(name = "Person2.findByPassword", query = "SELECT p FROM Person2 p WHERE p.password = :password")
    , @NamedQuery(name = "Person2.findByBirthdate", query = "SELECT p FROM Person2 p WHERE p.birthdate = :birthdate")
    , @NamedQuery(name = "Person2.findByCredit", query = "SELECT p FROM Person2 p WHERE p.credit = :credit")})
public class Person2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Basic(optional = false)
    @Column(name = "credit")
    private String credit;

    public Person2() {
    }

    public Person2(Integer id) {
        this.id = id;
    }

    public Person2(Integer id, String email, String name, String password, Date birthdate, String credit) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.birthdate = birthdate;
        this.credit = credit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person2)) {
            return false;
        }
        Person2 other = (Person2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Person2[ id=" + id + " ]";
    }
    
}
