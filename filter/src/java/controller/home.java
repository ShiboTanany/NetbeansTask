/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shibo
 */
public class home extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
		//out.print("hello");
             String username=request.getParameter("username");  
             String password=request.getParameter("password");
 	     String remember=request.getParameter("choice");
		boolean flag=false;
        if(username.equals("s")&&password.equals("root")){

		
	HttpSession session=request.getSession();  
        session.setAttribute("username",username); 
	session.setAttribute("password",password); 
             out.println("<html>");
             out.println("<head>");
             out.println("<title>The POST method</TITLE>");
             out.println("</head>");
             out.println("<body>dksjdksjdksjkdjksjk");
	     out.print(username);
	     out.print(password);
             out.println("The servlet has received a POST request"+remember+
               "Thank you.");
out.println("<a href='Logout'>Log out</a>");
response.sendRedirect("homee");
             out.println("</body>");
              out.println("</html>");}
else{
	     
	      
        /*RequestDispatcher rd=request.getRequestDispatcher("index.html");
 	out.print("<center><div ><b>Sorry username or password error<b></div><center>");   
       rd.include(request,response); */
	response.sendRedirect("Test?error=fail");
	

 }
}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  


