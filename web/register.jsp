<%-- 
    Document   : register
    Created on : Aug 3, 2023, 12:00:22 PM
    Author     : shach
--%>
<%@page import="classes.MD5"%>
<%@page import="classes.DBConnector"%>
<%@page import="classes.User"%>
<%
    String role = request.getParameter("role");
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
    String contactNo =request.getParameter("contactNo");
    String address = request.getParameter("address");
    String shop_address = request.getParameter("shop_address");
    String acc_number = request.getParameter("acc_number");
    String acc_type = request.getParameter("acc_type");
    String acc_bank_name = request.getParameter("acc_bank_name");
    String acc_bank_branch = request.getParameter("acc_bank_branch");
    String username = request.getParameter("username");
    String password = MD5.getMd5(request.getParameter("password"));

    User user = new User();
    user.setRole(role);
    user.setFirstName(firstname);
    user.setLastName(lastname);
    user.setEmail(email);
    user.setConatcNumber(contactNo);
    user.setUsername(username);
    user.setPassword(password);
    
    if("buyer".equals(role)){
        user.setAddress(address);
    }
    else if("seller".equals(role)){
        user.setShopAddress(shop_address);
        user.setAccountNumber(acc_number);
        user.setAccountType(acc_type);
        user.setBankName(acc_bank_name);
        user.setBranchName(acc_bank_branch);
    }
    
    if (user.register(DBConnector.getConnection())) {
        response.sendRedirect("loginForm.jsp?status=1");
    } else {
        response.sendRedirect("registerForm.jsp?status=0");
    }
%>

<%
   /* String role = request.getParameter("role");
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
   int contactNo = Integer.parseInt(request.getParameter("contactNo"));
    String address = request.getParameter("address");
    String shop_address = request.getParameter("shop_address");
    String acc_number = request.getParameter("acc_number");
    String acc_type = request.getParameter("acc_type");
    String acc_bank_name = request.getParameter("acc_bank_name");
    String acc_bank_branch = request.getParameter("acc_bank_branch");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    User user = new User();
    user.setRole(role);
    user.setFirstName(firstname);
    user.setLastName(lastname);
    user.setEmail(email);
    user.setConatcNumber(contactNo);
    user.setUsername(username);
    user.setPassword(password);
    
    if("buyer".equals(role)){
        user.setAddress(address);
    }
    else if("seller".equals(role)){
        user.setShopAddress(shop_address);
        user.setAccountNumber(acc_number);
        user.setAccountType(acc_type);
        user.setBankName(acc_bank_name);
        user.setBranchName(acc_bank_branch);
    }
    
    if(user.register(DBConnector.getConnection())){
        response.sendRedirect("registerForm.jsp?status=1");
    }
    else{
        response.sendRedirect("registerForm.jsp?status=0");
    }*/
    %>
