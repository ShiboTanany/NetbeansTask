
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shibo
 */
public class NewClass implements ServletContextListener {

    //
    Statement st;
    ResultSet rs;
    String drivermanager;
    String url;
    String usr, psw;

   
   


    @Override
    public void contextInitialized(ServletContextEvent sce) {
     
        try {
            Connection   con=null;
            usr = "root";
            psw = "root";
            drivermanager = "com.mysql.jdbc.Driver";
            url = "jdbc:mysql://localhost:3306/mobiland";
            
            
            Class.forName(drivermanager);
            con = DriverManager.getConnection(url, usr, psw);
            st = con.createStatement();
            
         //   sce.getServletContext().setAttribute(url, sce);
            sce.getServletContext().setAttribute("connection", con);
//            ArrayList<Product> list = getAllProduct();
//            sce.getServletContext().setAttribute("product", list);
//            ArrayList<Product> list2 = new ArrayList<>();
//            sce.getServletContext().setAttribute("customer", list2);
            System.out.println("creaeeeeeeeeeeeeeeeeeeeeeeetes"+con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("deleted");
         }
  
}
