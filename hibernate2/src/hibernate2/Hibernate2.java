/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate2;

import com.model.Buyer;
import com.model.BuyerBidProduct;
import com.model.BuyerBidProductId;
import com.model.BuyerBuyProduct;
import com.model.BuyerBuyProductId;
import com.model.Category;
import com.model.Product;
import com.model.Seller;
import com.model.User;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author shibo
 */
public class Hibernate2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory fac = new Configuration()
                .configure().buildSessionFactory();
        Session session = fac.openSession();
        session.beginTransaction();
//        User user = new User();
//        user.setAddress("dsdsds");
//        user.setDateOfBirth(new Date(1994, 5, 5));
//        user.setRegistrationDate(new Date());
//        user.setMobile("01142803256");
//        user.setId(10);
//        user.setPhone("0112ds12d2s1d");
//        user.setFullName("shaaban ebrahim altanany");
//        user.setUserName("dsds");
//        user.setEmail("dsldklskdls");
//        user.setPassword("dksldks");
//        User user1 = new User();
//        user1.setAddress("dsdsds");
//        user1.setDateOfBirth(new Date(1994, 5, 5));
//        user1.setRegistrationDate(new Date());
//        user1.setMobile("01142803256");
//        user1.setId(10);
//        user1.setPhone("0112ds12d2s1d");
//        user1.setFullName("shaaban ebrahim altanany");
//        user1.setUserName("dsds");
//        user1.setEmail("dsldklskdls");
//        user1.setPassword("dksldks");
//        
        Seller seller = new Seller((User) session.get(User.class, 3), "15");

        Seller seller1 = new Seller((User) session.get(User.class, 4), "1");

        Buyer buyer = new Buyer((User) session.get(User.class, 3), "22");

//        Product product = new Product();
//        product.setDescription("dsdsds");
//        product.setExpirationDate(new Date(2017, 5, 20));
//        product.setFinishDate(new Date(2017, 5, 30));
//        product.setId(25);
//        product.setManufacturingDate(new Date(2017, 4, 20));
//        product.setName("dkjskjds");
//        product.setOfferedDate(new Date(2017, 3, 20));
//        product.setQuantity(25);
//        product.setSeller(seller);
//        
//        Product product1 = new Product();
//        product1.setDescription("dsdsds");
//        product1.setExpirationDate(new Date(2017, 5, 20));
//        product1.setFinishDate(new Date(2017, 5, 30));
//        product1.setId(6);
//        product1.setManufacturingDate(new Date(2017, 4, 20));
//        product1.setName("dkjskjds");
//        product1.setOfferedDate(new Date(2017, 3, 20));
//        product1.setQuantity(25);
//        product1.setSeller(seller1);
//        product1.setManufacturingName("sasa");
        //session.save(user1);
        Set<Product> set = new HashSet<>();
        set.add((Product) session.load(Product.class, 2));
        set.add((Product) session.load(Product.class, 4));
        Category categeory = new Category("2", "dsdslk", set);
        // session.save(seller1);
        //session.save(buyer);
        // session.save(product1);
        // session.save(categeory);
        Product p=(Product) session.load(Product.class, 2);
        Buyer buy=(Buyer)session.load(Buyer.class, 2);
        BuyerBidProduct bid = new BuyerBidProduct();
        BuyerBidProductId bid2 = new BuyerBidProductId(buy.getId(), p.getId());
        bid.setId(bid2);
        bid.setBuyer(buyer);
        bid.setDate(new Date());
        bid.setProduct((Product) session.load(Product.class, 4));
        bid.setQuantity(5);
            
        BuyerBuyProductId bidforBuy = new BuyerBuyProductId(buy.getId(), p.getId());
        BuyerBuyProduct buid=new BuyerBuyProduct();
        buid.setId(bidforBuy);
        buid.setAmount((float) 22.55);
        buid.setBuyer(buyer);
        buid.setPaymentDate(new Date(1994, 5, 5));
        buid.setProduct(p);
        buid.setQuantity(256);
                
        
        session.save(buid);

        //BuyerBuyProduct
        session.getTransaction().commit();
        System.out.println("sucess");
    }

}
