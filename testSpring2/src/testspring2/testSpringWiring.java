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
import testWiring.*;

/**
 *
 * @author shibo
 */
public class testSpringWiring {

    public static void main(String[] args) {
        ApplicationContext app = new FileSystemXmlApplicationContext("beans_1.xml");

        Account account = (Account) app.getBean("accountLast");
        System.out.println("" + account.getCustomer2());
        //System.out.println("accessed"+object);
//        List<testPackage.Account> list = bank.getList();
//        for (testPackage.Account list1 : list) {
//            System.out.println("" + list1);
//        }
//           Map<String, testPackage.Account> x =bank.getMaps();
//        for (Map.Entry<String, testPackage.Account> entrySet : x.entrySet()) {
//            String key = entrySet.getKey();
//            testPackage.Account value = entrySet.getValue();
//            System.out.println(""+key+"/t"+value);
//            
//        }
//        
//        Properties  prop=     bank.getPros();
//        System.out.println(""+prop.getProperty("email"));
//         System.out.println(""+prop.getProperty("fax"));
//        
//        
//         
//        Set<testPackage.Account> u=    bank.getSets();
//        for (testPackage.Account u1 : u) {
//            System.out.println(""+u1);
//        }
    }
}
