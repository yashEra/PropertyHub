<%-- 
    Document   : contactProcess
    Created on : Aug 4, 2023, 2:26:11 PM
    Author     : shach
--%>
<%@page import="classes.DBConnector" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String contactNo = request.getParameter("contactNo");
    String message = request.getParameter("message");

    Connection con = DBConnector.getConnection();
    String query = "INSERT INTO contactus(name,email,conactNo,message) VALUES(?,?,?,?)";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setString(1, name);
    pstmt.setString(2, email);
    pstmt.setString(3, contactNo);
    pstmt.setString(4, message);
    int a = pstmt.executeUpdate();

    if (a > 0) {
       response.sendRedirect("contact-us.jsp?status=1");
    }else {
       response.sendRedirect("contact-us.jsp?status=0");
   }
   

    
%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <%
            if (a > 0) {
        %>
        <p>Successfully Saved</p>
        <%
        } else {
        %>
        <p>Error Occurred</p>;
        <%
            }
        %>
    </body>
</html>-->
