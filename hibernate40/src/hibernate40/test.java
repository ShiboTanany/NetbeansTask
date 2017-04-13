/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate40;

import com.entity.BuyerBidProduct;
import com.entity.BuyerBuyProduct;
import com.entity.Category;
import com.entity.Product;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.DoubleType;
import org.hibernate.type.Type;

/**
 *
 * @author shibo
 */
public class test {

    public static void main(String[] args) {
//        Session session = new Configuration().configure().buildSessionFactory().openSession();
//        session.beginTransaction();
//
//        Category we = (Category) session.load(Category.class, 3);
//
//        Query we1 = session.createQuery(" from Product p  where :x member of p.categories");
//we1 = we1.setEntity("x", we);
//        List x=  we1.list();
////       List x=  (List<Product>) we1.setEntity("x", we);
//        for (Object product : x) {
//            System.out.println(""+product);
//        }
//
//        session.getTransaction().commit();
//        session.close();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Session session = new Configuration().configure().buildSessionFactory().openSession();
//        session.beginTransaction();
//
//        Product we = (Product) session.load(Product.class, 2);
//        System.out.println(""+we.getDescription());
//        Query w = session.createQuery("from BuyerBidProduct p where  p.product.id=2");
//        w = w.setEntity("x", we);
//        List<BuyerBidProduct> x = w.list();
////       List x=  (List<Product>) we1.setEntity("x", we);
//        for (BuyerBidProduct product : x) {
//            System.out.println("" + product.getQuantity());
//        }
//
//        session.getTransaction().commit();
//        session.close();
        //////////////////////////////////////////////////////////////////////////////////////
//       
// Session session = new Configuration().configure().buildSessionFactory().openSession();
//        session.beginTransaction();
//
//        Product we = (Product) session.load(Product.class, 2);
//        System.out.println(""+we.getDescription());
//        Query w = session.createQuery(" select sum(p.amount * p.quantity) from BuyerBuyProduct p where  p.product.id=2 ");
//        //w = w.setEntity("x", we);
//        List x = w.list();
//        System.out.println(""+x.get(0));
//        
////       List x=  (List<Product>) we1.setEntity("x", we);
//       
//
//        session.getTransaction().commit();
//        session.close();
// Session session = new Configuration().configure().buildSessionFactory().openSession();
//        session.beginTransaction();
//
//        Criteria cr=  session.createCriteria(Category.class);
//       cr.add(Restrictions.eq("id", 3));
//        List<Category> results = cr.list();
//        
//        
//        for (Category result : results) {
//            System.out.println(""+result.getProducts());
//        }
//        session.getTransaction().commit();
//        session.close();
//        Session session = new Configuration().configure().buildSessionFactory().openSession();
//        session.beginTransaction();
//
//        Criteria cr = session.createCriteria(Product.class);
//        Criteria cr1 = cr.createCriteria("categories");
//        cr1 = cr1.add(Restrictions.eq("id", 3));
//        List<Product> result = cr1.list();
//        for (Product product : result) {
//            System.out.println(""+product);
//        }
//        
//        session.getTransaction().commit();
//        session.close();
 Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.beginTransaction();

        Criteria cr = session.createCriteria(BuyerBidProduct.class);
        Criteria cr1 = cr.createCriteria("product");
        cr1 = cr1.add(Restrictions.eq("id", 2));
        List<BuyerBidProduct> result = cr1.list();
        for (BuyerBidProduct product : result) {
            System.out.println(""+product);
        }
        
        session.getTransaction().commit();
        session.close();
//        Session session = new Configuration().configure().buildSessionFactory().openSession();
//        session.beginTransaction();
//       
//        Criteria cr = session.createCriteria(BuyerBuyProduct.class, "p")
//                .setProjection(Projections.sqlProjection(
//                        "sum( (amount)* (quantity1) )  as total ",
//                        new String[]{"total"},
//                        new Type[]{new DoubleType()}
//                ));
//        Criteria cr1 = cr.createCriteria("product");
//        cr1 = cr1.add(Restrictions.eq("id", 2));
//
//        List<Double> result = cr1.list();
//        for (Double product : result) {
//            System.out.println("" + product);
//        }
//
//        session.getTransaction().commit();
//        session.close();

    }
}
