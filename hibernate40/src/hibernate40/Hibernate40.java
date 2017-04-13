/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate40;

import com.entity.Category;
import com.entity.Product;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author shibo
 */
public class Hibernate40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Session session = new Configuration().configure().buildSessionFactory().openSession();
//        session.beginTransaction();
//        List<Product> p;
//        List<Category> cat;
//        Query q1 = session.createQuery("  from Category p where p.id=3 ");
//        cat = q1.list();
//        for (Category integer : cat) {
//           System.out.println("" + integer.getValue());
//            for (Product product : integer.getProducts()) {
//                System.out.println(""+product.getId());
//            }
//        }

        
        //List<Product> p;

//        Category q1 = (Category) session.load(Category.class,3);
//        System.out.println(""+q1.getProducts().toString());
//       
//        //.createQuery("from Product p where p.Categories member of ?");
//        p = we.list();
////                .setParameter(0, cat)
////                .list();
//
//        for (Product product : p) {
//            System.out.println("" + product);
//        }
//        Query q = session.createQuery("from Product p where p.id in (:sh)");
//        p = q.list();
//
//        p = session
//                .createQuery("from Product p where p.id member of (:list)")
//                .setParameterList("list",cat)
//                .list();
//        for (Product product : p) {
//            System.out.println("" + product.getName());
//        }
    }

}
