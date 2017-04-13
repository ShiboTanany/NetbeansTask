/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shibo
 */
@WebServlet(urlPatterns = {"/DeleteProduct2"})
public class DeleteProduct2 extends HttpServlet {

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
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     boolean x=   deleteProduct(Integer.parseInt(request.getParameter("u")));
     if(x){
     
     response.sendRedirect("newjsp.jsp");}
       
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
public boolean deleteProduct(int id) {
init();
        int flag = 0;
        try {
            PreparedStatement pst = con.prepareStatement("delete from product where productId=? ");
            pst.setInt(1, id);
            flag = pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }

        if (flag > 0) {
            return true;
        }
        return false;
    }
}
