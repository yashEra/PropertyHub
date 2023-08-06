<%-- 
    Document   : item
    Created on : Aug 6, 2023, 10:11:51 PM
    Author     : USER
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Item Description</title>
    <!-- Bootstrap CSS link -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <%@ page import="java.sql.*" %>
    <%--<%@page import="classes.DBConnector"%>--%>
    <%
        // Database connection settings
        String dbURL = "jdbc:mysql://localhost:3306/propertyhub";
        String dbUser = "testuser";
        String dbPassword = "testuser";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            // Get the property ID from the URL parameter
            String propertyId = request.getParameter("pro_id");

            // Prepare the SQL query to retrieve property details
            String sql = "SELECT * FROM property WHERE pro_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, propertyId);

            // Execute the query
            rs = pstmt.executeQuery();

            // Check if a property with the given ID exists
            if (rs.next()) {
                // Extract property details from the ResultSet
                String propertyName = rs.getString("pro_name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                String pro_img_url = rs.getString("pro_img_url");
                // Add other relevant fields as needed
    %>
    <!-- Property Details Section -->
    <div class="container">
        <h1><%= propertyName %></h1>
        <p><%= description %></p>
        <p>Price: <%= price %></p>
        <img src="<%= pro_img_url %>" class="img-fluid" alt="Property Image">
        <!-- Add other property details here -->
    </div>
    <% 
            } else {
                // Property with the given ID not found
                // Handle the error case (e.g., redirect to an error page)
                response.sendRedirect("error.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources (ResultSet, PreparedStatement, and Connection)
            if (rs != null) {
                try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
            if (pstmt != null) {
                try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
            if (conn != null) {
                try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
        }
    %>

    <!-- Bootstrap JS link -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

