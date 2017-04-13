/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shibo
 */
public class Main {

    public Main() {
        System.out.println(""+this);
    }
    
    
    public static void main(String[] args) throws Exception {
        ApplicationContext app=new FileSystemXmlApplicationContext("beans.xml");
       UserDao  user=  (UserDao) app.getBean("dao");
   //    user.newz();
       DAOImp s=new DAOImp();
       //Main use=new Main();
       //user.deleteUser(new User(1, "slkdsk", 12));
//       user.sayHiUser(65);
       
    }
}
