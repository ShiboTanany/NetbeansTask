
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shibo
 */
public class operations {
     Connection con;
    Statement st;
    ResultSet rs;
    String drivermanager;
    String url;
    String usr, psw;

    public void init() {
        usr = "root";
        psw = "root";
        drivermanager = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/mobiland";

        try {
            Class.forName(drivermanager);
            con = DriverManager.getConnection(url, usr, psw);
            st = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public operations() {
        init();
    }

       public ArrayList<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement("select * from product");
            // InputStream is = productImage.getInputStream();;

            rs = pst.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getString(5), rs.getDouble(6), rs.getInt(7));
                System.out.println("" + product);
                
            }
            System.out.println(""+rs.getRow());
        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }
        return list;

    }
         public static void main(String[] args) {
        operations dp = new operations();
        //System.out.println("" + dp.deleteProduct(14));
        dp.getAllProduct();

    }
}
