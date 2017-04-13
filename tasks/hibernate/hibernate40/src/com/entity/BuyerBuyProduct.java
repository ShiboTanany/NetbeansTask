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
 * BuyerBuyProduct generated by hbm2java
 */
@Entity
@Table(name="buyer_buy_product"
    ,catalog="biddingschema"
)
public class BuyerBuyProduct  implements java.io.Serializable {

    @Override
    public String toString() {
        return "BuyerBuyProduct{" + "id=" + id + ", buyer=" + buyer + ", product=" + product + ", paymentDate=" + paymentDate + ", amount=" + amount + ", quantity=" + quantity1 + '}';
    }


     private BuyerBuyProductId id;
     private Buyer buyer;
     private Product product;
     private Date paymentDate;
     private float amount;
     private int quantity1;

    public BuyerBuyProduct() {
    }

    public BuyerBuyProduct(BuyerBuyProductId id, Buyer buyer, Product product, Date paymentDate, float amount, int quantity) {
       this.id = id;
       this.buyer = buyer;
       this.product = product;
       this.paymentDate = paymentDate;
       this.amount = amount;
       this.quantity1 = quantity;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="buyerId", column=@Column(name="buyer_id", nullable=false) ), 
        @AttributeOverride(name="productId", column=@Column(name="product_id", nullable=false) ) } )
    public BuyerBuyProductId getId() {
        return this.id;
    }
    
    public void setId(BuyerBuyProductId id) {
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
    @Column(name="payment_date", nullable=false, length=0)
    public Date getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    
    @Column(name="amount", nullable=false, precision=12, scale=0)
    public float getAmount() {
        return this.amount;
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }

    
    @Column(name="quantity1", nullable=false)
    public int getQuantity() {
        return this.quantity1;
    }
    
    public void setQuantity(int quantity) {
        this.quantity1 = quantity;
    }




}


