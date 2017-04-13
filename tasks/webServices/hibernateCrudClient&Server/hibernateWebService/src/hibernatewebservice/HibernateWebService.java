/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatewebservice;

import com.entity.Account;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author shibo
 */
@WebService
public class HibernateWebService {
 Crud crud=new Crud();
    
    public void insertNew(Account c){
    
   
    crud.saveAccount(c);
    
    
    
    }
     public void delete(Account c){
    
   
    crud.delete(c);

    
    }
     
     public List<Account> get(){
     return crud.getAll();
     
     }
     public static void main(String[] args) {
         Crud x=new Crud();
        List<Account> list=x.getAll();
         for (Account account : list) {
             System.out.println(""+account.getAddress());
         }
    }
//     public static void main(String[] args) throws FileNotFoundException, IOException {
//         Account account=new Account();
//        account.setUserName("hhdsdsghgdshgh");
//        account.setPhone("01142803256");
//        account.setPassword("root");
//        account.setAddress("Damanhour");
//        account.setBirthday(new Date());
//        account.setFullName("shaaban ebrahim altanany");
//        String photoFilePathToRead ="/home/shibo/Documents/doaa/testNetbeans/hibernate1/src/hibernate1/Account.java";
//        File inputFile = new File(photoFilePathToRead);
//        FileInputStream inputStream = new FileInputStream(inputFile);
//
//        byte[] fileBytes = new byte[(int) inputFile.length()];
//        inputStream.read(fileBytes);
//        inputStream.close();
//        
////        File file = new File(photoFilePathToRead);
////        FileInputStream inputStream = new FileInputStream(file);
////        Blob blob = Hibernate.getLobCreator(session)
////                .createBlob(inputStream, file.length());
//        account.setImage(fileBytes);
//     
//     HibernateWebService h1=new HibernateWebService();
//     h1.insertNew(account);
//     }
     
}


