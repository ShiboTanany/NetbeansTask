/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspring2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import testPackage.Account;
import testPackage.Bank;
import testPackage.Customer;

/**
 *
 * @author shibo
 */
public class TestSpring2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext app = new FileSystemXmlApplicationContext("beans.xml");

        Bank bank = (Bank) app.getBean("bank1");
        //System.out.println("accessed"+object);
        List<Account> list = bank.getList();
        for (Account list1 : list) {
            System.out.println("" + list1);
        }
        
        Map<String, Account> x =bank.getMaps();
        for (Map.Entry<String, Account> entrySet : x.entrySet()) {
            String key = entrySet.getKey();
            Account value = entrySet.getValue();
            System.out.println(""+key+"/t"+value);
            
        }
        
        Properties  prop=     bank.getPros();
        System.out.println(""+prop.getProperty("email"));
         System.out.println(""+prop.getProperty("fax"));
        
        
         
        Set<Account> u=    bank.getSets();
        for (Account u1 : u) {
            System.out.println(""+u1);
        }
    }

}
