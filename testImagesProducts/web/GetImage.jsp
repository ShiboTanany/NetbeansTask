<%-- 
    Document   : GetImage
    Created on : Mar 4, 2017, 4:54:50 PM
    Author     : shibo
--%><%@page import="java.io.OutputStream"%>
<%@page import="java.sql.*"%>


    <%@ page import="java.io.*" %>

 <!--   <html>
 
 <%
String id =request.getParameter("x");

 
String connectionURL = "jdbc:mysql://localhost:3306/mobiland";
String user = "root";
String pass = "root";
 
Connection con = null;
 
try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(connectionURL, user, pass);
    
    PreparedStatement ps = con.prepareStatement("select * from product where productId=?");
    ps.setString(1, id);
    ResultSet rs = ps.executeQuery();
 
    if(rs.next()){
        
        Blob blob = rs.getBlob(4);
        byte byteArray[] = blob.getBytes(1, (int)blob.length());
 
        response.setContentType("image/jpg");
        out.print(blob);
        OutputStream os = response.getOutputStream();
        os.write(byteArray);
        os.flush();
        os.close();
    }
}
catch(Exception e){
    e.printStackTrace();
}   
finally{
    if(con != null){
        try{
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
%>
   