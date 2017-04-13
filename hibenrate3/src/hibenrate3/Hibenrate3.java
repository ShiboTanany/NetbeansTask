/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibenrate3;

import com.shibo.Person;
import com.shibo.Student;
import com.shibo.Teacher;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author shibo
 */
public class Hibenrate3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory fac = new Configuration()
                .configure().buildSessionFactory();
        Session session = fac.openSession();
        Person person=new Person("dskdskj", "dsdlskdls");
        Teacher teacher=new  Teacher("dskdsl", "sdlskl", new Date(2017, 6, 30));
        Student student=new Student("ds", "D", "dsds");
        session.beginTransaction();
        session.save(person);
        session.save(teacher);
        session.save(student);
        session.getTransaction().commit();
        System.out.println("success");
    }
    
}
