<%-- 
    Document   : index
    Created on : Aug 7, 2023, 12:06:08 AM
    Author     : USER
--%>

<!-- Property Listing Section -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Property Hub</title>
        <!-- Bootstrap CSS link -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        
        <style>
            .jumbotron {
                position: relative;
                height: 100vh;
                overflow: hidden;
            }

            .jumbotron::before {
                content: "";
                position: absolute;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                background: linear-gradient(0deg, rgba(135 206 235 / 54%), rgba(00 21 47 / 69%)),url('./images/main-banner.jpg') rgba(0, 0, 0, 0.4) center/cover no-repeat;
                background-color: rgba(0, 0, 0, 0.4);
            }

            .jumbotron .container__header {
                position: relative;
                z-index: 1;
                text-align: center;
                color: #fff; /* Set the text color to white */
                align-items: center;
            }
            .container__header{
                
                align-items: center;
                display: block;
                margin-top: 15%;
                font-size: 140%
            }
            .container__header h1{
                
                font-size: 200%;


                font-weight: 700;

            }
        </style>
    </head>
    <body>
                    <%@include file="commen_comp/navbar.jsp" %>

        <!-- Hero Section -->
        <div class="jumbotron jumbotron-fluid">
            <div class="container__header">
                <h1>Welcome to Property Hub</h1>
                <p>Find your dream property here!</p>
            </div>
        </div>

        <!-- Property Listing Section -->
        <div class="container mt-4">
            <h2>All Properties</h2>
            <div class="row">
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

                        // Prepare the SQL query to retrieve all property details
                        String sql = "SELECT * FROM property";
                        pstmt = conn.prepareStatement(sql);

                        // Execute the query
                        rs = pstmt.executeQuery();

                        // Iterate over the result set and display property details
                        while (rs.next()) {
                            String propertyId = rs.getString("pro_id"); // Get the property ID
                            String propertyName = rs.getString("pro_name");
                            String description = rs.getString("description");
                            double price = rs.getDouble("price");
                            String pro_img_url = rs.getString("pro_img_url");
                            // Add other relevant fields as needed

                %>
                <div class="col-md-4 mb-4">
                    <div class="card">
                        <img src="<%= pro_img_url%>" class="card-img-top" alt="Property Image">
                        <div class="card-body">
                            <h5 class="card-title"><%= propertyName%></h5>
                            <p class="card-text">Price: <%= price%></p>
                            <!--<p class="card-text"><%= description%></p>-->
                            <a href="item.jsp?pro_id=<%= propertyId%>" class="btn btn-primary">Buy Now</a>
                            <!-- Add other property details here -->
                        </div>
                    </div>
                </div>
                <%
                        } // End of while loop
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // Close resources (ResultSet, PreparedStatement, and Connection)
                        if (rs != null) {
                            try {
                                rs.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                        if (pstmt != null) {
                            try {
                                pstmt.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                        if (conn != null) {
                            try {
                                conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                %>
            </div>
        </div>
            <%@include file="commen_comp/footer.jsp" %>

        <!-- Bootstrap JS link -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
