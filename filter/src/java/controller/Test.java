/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.IOException;  
import java.io.PrintWriter;  
 import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;    
     
      
public class Test  extends HttpServlet {
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

	     PrintWriter out = response.getWriter();
	     response.setContentType("text/html");
           String error=request.getParameter("error");
 /* HttpSession session=request.getSession(false);  
        if(session!=null){  
        String name=(String)session.getAttribute("username");  
          
        out.print("Hello, "+name+" Welcome to Profile");

request.getRequestDispatcher("Home").include(request, response);  }
 

else{*/
           //out.println("<a href='Test'>Log out</a>");
	out.print("<html>"+
 "<head>"+
"<link rel='stylesheet' type='text/css' href='css/test.css'>"+

"</head>"+
"<body>"+
"<div class='login-page'>"+
"  <div class='form'>");
if(error!=null&&error.equals("fail")){
	
   
out.print(" <div>u have errors in login 3al feka </div>");}
out.print("  <form  action='Test' method='post' class=login-form'>"
      +"<input type='text' placeholder='username' name='username'/>"+
      "<input type='password' placeholder='password' name='password'/>"+
      "<button>login</button>"+
      "<p class='message'>Not registered? <a href='#'>Create an account</a></p>"+
    "</form>"+
 " </div>"+
"</div>"+
"</body>"+
"</html>");}


 
	  

@Override
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
  PrintWriter out = response.getWriter();
	     response.setContentType("text/html");
		//out.print("hello");
             String username=request.getParameter("username");  
             String password=request.getParameter("password");
 	     String remember=request.getParameter("choice");
		boolean flag=false;
/*   Cookie ck[]=request.getCookies();
//String x=ck[0].getValue();  
	for(int i=0;i<ck.length;i++){
	if(ck[i].getValue().equals("test")){
	flag=true;
	}*/
//	}
    //out.print("Hello "+ck[0].getValue());  
		

		
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
response.sendRedirect("Home");
             out.println("</body>");
              out.println("</html>");}
else{
	     
	      
        /*RequestDispatcher rd=request.getRequestDispatcher("index.html");
 	out.print("<center><div ><b>Sorry username or password error<b></div><center>");   
       rd.include(request,response); */
	response.sendRedirect("Test?error=fail");
	

 }
}}
