package hibernate1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.util.Date;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author shibo
 */


public class Hibernate1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        SessionFactory fac = new Configuration()
                .configure().buildSessionFactory();
        Session session = fac.openSession();
        String photoFilePathToRead = "/home/shibo/Desktop/Tarabyon.com_Tamer_Ashour-Khaialy.rar";

        session.beginTransaction();
        Account account = new Account();
        // account.setId(2);
        account.setUserName("hhghكمكبكبمي");
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
        session.save(account);
        session.getTransaction().commit();
        session.close();
        System.out.println("insetion done");
    }

}
