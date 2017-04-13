package com.entity;
// Generated Mar 23, 2017 9:31:59 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BuyerBidProduct generated by hbm2java
 */
@Entity
@Table(name="buyer_bid_product"
    ,catalog="biddingschema"
)
public class BuyerBidProduct  implements java.io.Serializable {


     private BuyerBidProductId id;
     private Buyer buyer;
     private Product product;
     private Date date;
     private float amount;
     private int quantity;

    public BuyerBidProduct() {
    }

    public BuyerBidProduct(BuyerBidProductId id, Buyer buyer, Product product, Date date, float amount, int quantity) {
       this.id = id;
       this.buyer = buyer;
       this.product = product;
       this.date = date;
       this.amount = amount;
       this.quantity = quantity;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="buyerId", column=@Column(name="buyer_id", nullable=false) ), 
        @AttributeOverride(name="productId", column=@Column(name="product_id", nullable=false) ) } )
    public BuyerBidProductId getId() {
        return this.id;
    }
    
    public void setId(BuyerBidProductId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="buyer_id", nullable=false, insertable=false, updatable=false)
    public Buyer getBuyer() {
        return this.buyer;
    }
    
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", nullable=false, insertable=false, updatable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date", nullable=false, length=0)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="amount", nullable=false, precision=12, scale=0)
    public float getAmount() {
        return this.amount;
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }

    
    @Column(name="quantity", nullable=false)
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BuyerBidProduct{" + "id=" + id + ", buyer=" + buyer + ", product=" + product + ", date=" + date + ", amount=" + amount + ", quantity=" + quantity + '}';
    }




}


