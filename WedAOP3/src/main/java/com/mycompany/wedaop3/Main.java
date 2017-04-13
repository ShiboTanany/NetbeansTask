/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shibo
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext app=new FileSystemXmlApplicationContext("src/resources/beans.xml");
       UserDao  user=  (UserDao) app.getBean("dao");
       //user.deleteUser(new User(1, "slkdsk", 12));
       user.sayHiUser(65);
    }
}
