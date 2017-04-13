/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import operations.dbOperations;

/**
 *
 * @author shibo
 */
public class search extends HttpServlet {

    @Override
    public void init() throws ServletException {

        new dbOperations().init();
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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        dbOperations db = new dbOperations();
        ResultSet rs = db.search(request.getParameter("username"));
        PrintWriter out = response.getWriter();
        out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n" +
"\n" +
"  <link rel='stylesheet prefetch' href='https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css'>\n" +
"\n" +
"      <link rel=\"stylesheet\" href=\"css/style_1.css\">");
        out.print("<form  action=\"search\">\n" +
"  <div class=\"search-wrapper\">\n" +
"    <input class=\"search-input\" type=\"text\" placeholder=\"Search\" name=\"username\"/><i class=\"ion ion-search\"></i>\n" +
"    <input type=\"submit\" value=\"search\">\n" +
"  </div>\n" +
"</form>\n" +
"  \n" +
"    <script src=\"js/index_1.js\"></script>");
    int rowCount = 0;
out.println("<P ALIGN='center'><TABLE BORDER=1>");
 ResultSetMetaData rsmd = rs.getMetaData();
 int columnCount = rsmd.getColumnCount();
 // table header
 out.println("<TR>");
 for (int i = 0; i < columnCount; i++) {
   out.println("<TH>" + rsmd.getColumnLabel(i + 1) + "</TH>");
   }
 out.println("</TR>");
 // the data
 while (rs.next()) {
  rowCount++;
  out.println("<TR>");
  for (int i = 0; i < columnCount; i++) {
    out.println("<TD>" + rs.getString(i + 1) + "</TD>");
    }
  out.println("</TR>");
  }
 out.println("</TABLE></P>");
 
   
        while(rs.next()){
        
        }
        
        out.print( "</table>");

        /* try (PrintWriter out = response.getWriter()) {
            
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<title>Servlet search</title>");            
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>Servlet search at " + request.getContextPath() + "</h1>");
         out.println("</body>");
         out.println("</html>");
         }*/
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
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

}
