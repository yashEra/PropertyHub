<%-- 
    Document   : login
    Created on : Aug 4, 2023, 11:19:27 AM
    Author     : shach
--%>

<%@page import="classes.DBConnector"%>
<%@page import="classes.User"%>
<%@page session="true" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    User user = new User(username, password);
    if (user.login(DBConnector.getConnection())) {
        session.setAttribute("user", user);
        if("buyer".equals(user.getUserType())){
            response.sendRedirect("contact-us.jsp"); //link buyer profile
        }
        else if("seller".equals(user.getUserType())){
            response.sendRedirect("https://www.w3schools.com/"); //link seller profile
        }
    } else {
        response.sendRedirect("loginForm.jsp?status=0");
    }
%>