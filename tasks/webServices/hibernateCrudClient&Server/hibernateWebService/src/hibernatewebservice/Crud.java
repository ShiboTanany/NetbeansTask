/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatewebservice;

import com.entity.Account;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author shibo
 */
class Crud {
    
    static Session session;

    public static Session getSess() {
        SessionFactory fac = new Configuration()
                .configure().buildSessionFactory();
        Session session = fac.openSession();
        //session.beginTransaction();
        System.out.println("success");
        return session;

    }

  // public boolean loginUser(Account p) {
//
//        Session session = Crud.getSess();
//        String sql = "from Person2  p where p.email=:name and p.password=:pass";
//        Query query = session.createQuery(sql);
//        query.setParameter("name", p.getEmail());
//        query.setParameter("pass", p.getPassword());
//        List<Person2> list = query.list();
//        if (query.list().size() > 0) {
//
//            session.close();
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public PersonControl loginUserByObject(PersonControl p) {
//        PersonControl person = new PersonControl();
//
//        Session session = getSession.getSess();
//        String sql = "from Person2  p where p.email=:name and p.password=:pass";
//        Query query = session.createQuery(sql);
//        query.setParameter("name", p.getEmail());
//        query.setParameter("pass", p.getPassword());
//        List<Person2> list = query.list();
//        person.setId(list.get(0).getId());
//        person.setBirthdate(list.get(0).getBirthdate());
//        person.setEmail(list.get(0).getEmail());
//        person.setLogin(true);
//        if (query.list().size() > 0) {
//            person.setLogin(true);
//            session.close();
//            return person;
//        } else {
//            return null;
//        }
//    }

//}  
    public void saveAccount(Account aThis) {
        Session session = getSess();
        session.getTransaction().begin();
//        A person = new Person2();
//        person.setId(aThis.getId());
//        person.setName(aThis.getName());
//        person.setEmail(aThis.getEmail());
//        person.setPassword(aThis.getPassword());
//        person.setCredit(aThis.getCredit().toString());
//        person.setBirthdate(aThis.getBirthdate());
//        System.out.println("" + person);

        session.persist(aThis);
        session.getTransaction().commit();
        System.out.println("success");

    }
    
    public List<Account> getAll(){
        String sql = "from Account ";
         Session session = getSess();
         Query query = session.createQuery(sql);
         
         return (List<Account>)query.list();
    
    }
      public void delete(Account aThis) {
        Session session = getSess();
        session.getTransaction().begin();
//        A person = new Person2();
//        person.setId(aThis.getId());
//        person.setName(aThis.getName());
//        person.setEmail(aThis.getEmail());
//        person.setPassword(aThis.getPassword());
//        person.setCredit(aThis.getCredit().toString());
//        person.setBirthdate(aThis.getBirthdate());
//        System.out.println("" + person);

        session.delete(aThis);
        session.getTransaction().commit();
        System.out.println("success");

    }
    
    
}
