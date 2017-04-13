/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springtestsun1.main;

import com.mycompany.springtestsun1.crud.PersonDAO;
import com.mycompany.springtestsun1.entity.Person;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

/**
 *
 * @author shibo
 */
public class Main {

    public static void main(String[] args) {
//        try {
            ApplicationContext context = new FileSystemXmlApplicationContext("beanConn.xml");
            PersonDAO test = (PersonDAO) context.getBean("test");
            test.delete(1);
            
            Person p;
            p = new Person( "dsds", "dsdjksj", "dksldks");
            //test.add(p);
            for(int i=0;i<1000000;i++){
                System.out.println(""+i);
            }
//            List<Person> list = test.getPerson();
//            
//            for (Person list1 : list) {
//                System.out.println("" + list1);
//            }
//        } catch (CannotGetJdbcConnectionException e) {
//
//            System.out.println("can not geJdbc template connection" + e.getMessage());
//        } catch (DataAccessException e) {
//
//            System.out.println("data access object b2a");
//        }
    }
}
