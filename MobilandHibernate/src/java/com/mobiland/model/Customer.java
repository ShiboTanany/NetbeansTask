/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobiland.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author shibo
 */
@Entity
@Table(name = "customer", catalog = "mobiland", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findById", query = "SELECT c FROM Customer c WHERE c.customerPK.id = :id")
    , @NamedQuery(name = "Customer.findByFName", query = "SELECT c FROM Customer c WHERE c.fName = :fName")
    , @NamedQuery(name = "Customer.findByLName", query = "SELECT c FROM Customer c WHERE c.lName = :lName")
    , @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.customerPK.email = :email")
    , @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone")
    , @NamedQuery(name = "Customer.findByPassword", query = "SELECT c FROM Customer c WHERE c.password = :password")
    , @NamedQuery(name = "Customer.findByCash", query = "SELECT c FROM Customer c WHERE c.cash = :cash")
    , @NamedQuery(name = "Customer.findByBirthdate", query = "SELECT c FROM Customer c WHERE c.birthdate = :birthdate")
    , @NamedQuery(name = "Customer.findByJob", query = "SELECT c FROM Customer c WHERE c.job = :job")
    , @NamedQuery(name = "Customer.findByAddress", query = "SELECT c FROM Customer c WHERE c.address = :address")
    , @NamedQuery(name = "Customer.findByInterest", query = "SELECT c FROM Customer c WHERE c.interest = :interest")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustomerPK customerPK;
    @Basic(optional = false)
    @Column(name = "fName")
    private String fName;
    @Basic(optional = false)
    @Column(name = "lName")
    private String lName;
    @Basic(optional = false)
    @Lob
    @Column(name = "image")
    private byte[] image;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "cash")
    private double cash;
    @Basic(optional = false)
    @Column(name = "birthdate")
    private String birthdate;
    @Basic(optional = false)
    @Column(name = "job")
    private String job;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "interest")
    private String interest;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private Collection<Cart> cartCollection;

    public Customer() {
    }

    public Customer(CustomerPK customerPK) {
        this.customerPK = customerPK;
    }

    public Customer(CustomerPK customerPK, String fName, String lName, byte[] image, String phone, String password, double cash, String birthdate, String job, String address, String interest) {
        this.customerPK = customerPK;
        this.fName = fName;
        this.lName = lName;
        this.image = image;
        this.phone = phone;
        this.password = password;
        this.cash = cash;
        this.birthdate = birthdate;
        this.job = job;
        this.address = address;
        this.interest = interest;
    }

    public Customer(int id, String email) {
        this.customerPK = new CustomerPK(id, email);
    }

    public CustomerPK getCustomerPK() {
        return customerPK;
    }

    public void setCustomerPK(CustomerPK customerPK) {
        this.customerPK = customerPK;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @XmlTransient
    public Collection<Cart> getCartCollection() {
        return cartCollection;
    }

    public void setCartCollection(Collection<Cart> cartCollection) {
        this.cartCollection = cartCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerPK != null ? customerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerPK == null && other.customerPK != null) || (this.customerPK != null && !this.customerPK.equals(other.customerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mobiland.model.Customer[ customerPK=" + customerPK + " ]";
    }
    
}
