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
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/product-card.css">
    </head>
    <body>
        <%@include file="commen_comp/navbar.jsp" %>

        <!-- Hero Section -->
        <section>
            <div class="header__image-1">
                <h1>Welcome to Property Hub</h1>

                <!--<h2>Find your dream property here!</h2><br/>-->
                <div>
                    <a href="loginForm.jsp" class="singup__singin"><button type="button" class="header__button"><span class="header__button__bg"></span><h3>Join Us!</h3></button></a>
                    <!--<a href="html/singin.jsp" class="singup__singin"><button type="button" class="header__button"><span class="header__button__bg"></span><h3>Singin</h3></button></a>-->
                </div>

        </section>
        <section>
            <h2 class="titles">WELCOME TO Property Hub</h2>
            <div class="welcome">

                <img src="images/welcome.jpg" alt="welcome">
                <p>
                    Western University is a friendly community of fascinating and driven learners, professors, and innovative thinkers located in one of the world's most interesting capital cities.We offer a variety of courses, ranging from undergraduate and postgraduate degrees to short courses and professional credentials, many of which may be completed full-time or part-time to fit your requirements and lifestyle.<br><br>

                    We are completely dedicated to assisting our students in achieving their objectives and achieving success in their jobs. Many of our undergraduate courses are approved by professional organisations and feature some type of job-related learning, such as a placement, client project, or on-campus work experience.
                </p>

            </div>
        </section>
        <section class="faculty__home">
            <div>
                <h2>CATOGORIES</h2>

                <div class="faculty__on__home__page">
                    <div class="faculty__on__fac"><a href="home.jsp"><img src="images/welcome.jpg" alt="Faculty of Management" width="100%"></a><a href="home.jsp" class="faculty__link"><h3>House</h3></a></div>
                    <div class="faculty__on__fac"><a href="building.jsp"><img src="images/welcome.jpg" alt="Faculty of Science" width="100%"></a><a href="building.jsp" class="faculty__link"><h3>Building</h3></a></div>
                    <div class="faculty__on__fac"><a href="apartment.jsp"><img src="images/welcome.jpg" alt="Faculty of Technology" width="100%"></a><a href="apartment.jsp" class="faculty__link"><h3>Apartment</h3></a></div>
                    <div class="faculty__on__fac"><a href="land.jsp"><img src="images/welcome.jpg" alt="Faculty of Engineering" width="100%"></a><a href="land.jsp" class="faculty__link"><h3>Land</h3></a></div>
                    <div class="faculty__on__fac"><a href="industrial.jsp"><img src="images/welcome.jpg" alt="Faculty of Information Technology" width="100%"></a><a href="industrial.jsp" class="faculty__link"><h3>Industrial property</h3></a></div>

                </div>
            </div>
        </section>
        <!--        <div class="jumbotron jumbotron-fluid">
                    <div class="container__header">
                        <h1>Welcome to Property Hub</h1>
                        <p>Find your dream property here!</p>
                    </div>
                </div>-->

        <!-- Property Listing Section -->
        <div class="container mt-4">
            <h2>Buildings</h2>
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
                            String type = rs.getString("pro_type");
                            // Add other relevant fields as needed
                            if (type.equals("building")) {

                %>
                <div class="col-md-4 mb-4">
                    <div class="product">
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
                            }
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

        <!--Houses-->
        <!--/-->
        <!--/-->
        <!--/-->


        <div class="container mt-4">
            <h2>Houses</h2>
            <div class="row">
                <%@ page import="java.sql.*" %>
                <%--<%@page import="classes.DBConnector"%>--%>
                <%
                    // Database connection settings
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
                            String type = rs.getString("pro_type");
                            // Add other relevant fields as needed
                            if (type.equals("house")) {

                %>
                <div class="col-md-4 mb-4">
                    <div class="product">
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
                            }
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

        <!--building-->
        <!--/-->
        <!--/-->
        <!--/-->

        <div class="container mt-4">
            <h2>Lands</h2>
            <div class="row">
                <%@ page import="java.sql.*" %>
                <%
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
                            String type = rs.getString("pro_type");
                            // Add other relevant fields as needed
                            if (type.equals("land")) {

                %>
                <div class="col-md-4 mb-4">
                    <div class="product">
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
                            }

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
