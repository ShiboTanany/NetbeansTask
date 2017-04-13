/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance34;

import com.shibo.models.Person;
import com.shibo.models.Student;
import com.shibo.models.Teacher;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author shibo
 */
public class Inheritance34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Teacher teacher = new Teacher(new Date(2017, 6, 30));
        teacher.setFirstName("dsds");
        teacher.setLastName("dlskdls");
        Student student = new Student("dsds");
        student.setFirstName("dskd;slk");
        student.setLastName("dlskldsldks");
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.getTransaction().begin();
        Object person=new Person("dsldks", "Dsdsl");
         session.save(person);
        session.save(student);
//        session.save(teacher);
        session.getTransaction().commit();
        System.out.println("success");
    }
    
}
