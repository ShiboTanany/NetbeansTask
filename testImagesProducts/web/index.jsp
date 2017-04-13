
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<html>
    
    
    <%int EmpId = 0;
        try {
            String EmpFirstName = null;
            String EmpSurname;

            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mobiland", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product");
            while (rs.next()) {

                EmpId = rs.getInt("productId");

    %> <%=EmpId%><div>
        <img src="GetImage?x=<%=EmpId%>" width="400px"/>
        
    </div>
    <%
            }

        } catch (Exception e) {
            out.print(e.getMessage());
            return;
        }
    %>
</html>