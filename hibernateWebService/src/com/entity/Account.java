package com.entity;
// Generated Apr 3, 2017 10:24:05 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name="account"
    ,catalog="helloworlddb"
    , uniqueConstraints = @UniqueConstraint(columnNames="user_name") 
)
public class Account  implements java.io.Serializable {


     private Integer id;
     private String userName;
     private String address;
     private String phone;
     private Date birthday;
     private String fullName;
     private String password;
     private byte[] image;

    public Account() {
    }

	
    public Account(String userName, String fullName, String password, byte[] image) {
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.image = image;
    }
    public Account(String userName, String address, String phone, Date birthday, String fullName, String password, byte[] image) {
       this.userName = userName;
       this.address = address;
       this.phone = phone;
       this.birthday = birthday;
       this.fullName = fullName;
       this.password = password;
       this.image = image;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="user_name", unique=true, nullable=false, length=30)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="address", length=70)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="phone", length=20)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="birthday", length=0)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    
    @Column(name="full_name", nullable=false, length=70)
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
    @Column(name="password", nullable=false, length=30)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="image", nullable=false)
    public byte[] getImage() {
        return this.image;
    }
    
    public void setImage(byte[] image) {
        this.image = image;
    }




}


