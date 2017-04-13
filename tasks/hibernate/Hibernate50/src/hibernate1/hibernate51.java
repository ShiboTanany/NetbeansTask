/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionEventListener;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.event.internal.DefaultSaveOrUpdateEventListener;

/**
 *
 * @author shibo
 */
public class hibernate51 {

    private static SessionFactory factory;

    public static void main(String args[]) throws FileNotFoundException, IOException {
        Configuration cfg = new Configuration().configure();
        //  cfg.addEv
        cfg.setNamingStrategy(new  MyNamingStrategy());
        factory = cfg.buildSessionFactory();

         SessionBuilder builder = factory.withOptions().interceptor(new inter1());
        Session session = builder.openSession();

        //   Session session = fac.openSession();
        String photoFilePathToRead = "/home/shibo/Desktop/17327985_1492880167388685_857945835_n.jpg";
//        DefaultSaveOrUpdateEventListener[] listener = {(DefaultSaveOrUpdateEventListener)new listener1()};
//        session.addEventListeners((SessionEventListener[]) listener);
        session.beginTransaction();
        // Account account = new Account();
        Account account = (Account) session.get(Account.class, 2);
        // account.setId(2);
        account.setUserName("hhgddsehthtdh,dة;ةوةgh");
        account.setPhone("01142803256");
        account.setPassword("root");
        account.setAddress("Damanhour");
        account.setBirthday(new Date());
        account.setFullName("shaaban ebrahim altanany");
        File inputFile = new File(photoFilePathToRead);
        FileInputStream inputStream = new FileInputStream(inputFile);

        byte[] fileBytes = new byte[(int) inputFile.length()];
        inputStream.read(fileBytes);
        inputStream.close();

//        File file = new File(photoFilePathToRead);
//        FileInputStream inputStream = new FileInputStream(file);
//        Blob blob = Hibernate.getLobCreator(session)
//                .createBlob(inputStream, file.length());
        account.setImage(fileBytes);
        session.update(account);
//        System.out.println("the id is " + id);
        session.getTransaction().commit();
        session.close();

//        session = factory.openSession();
//        session.beginTransaction();
//
//        //account2.setAddress("dsldkslkdls");
//        session.getTransaction().commit();
//        session.close();
//        factory.close();
        System.out.println("insetion done");
    }

}
