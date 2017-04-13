/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import com.control.Person;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author shibo
 */
public class getSession {

    static Session session;

    public static Session getSess() {
        SessionFactory fac = new Configuration()
                .configure().buildSessionFactory();
        Session session = fac.openSession();
        System.out.println("success");
        return session;

    }
     public boolean loginUser(Person p) {

        com.entity.PersonHibernate Person = new com.entity.PersonHibernate();
        Session session = getSession.getSess();
        String sql = "from PersonHibernate  p where p.email=:name and p.password=:pass";
        Query query = session.createQuery(sql);
        query.setParameter("name",p.getEmail());
        query.setParameter("pass", p.getPassword());
        List<com.entity.PersonHibernate> list = query.list();
        if (query.list().size() >0) {
            session.close();
            return true;
        } else {
            return false;
        }

}  public static void main(String[] args) {
        
    
    Person p=new Person(1, "shibo", "root");
         getSession P=new getSession();
//        Session s=P.getSession();
       boolean flag= P.loginUser(p);
        System.out.println(""+flag);
    }

}
