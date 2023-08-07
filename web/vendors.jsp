<%-- 
    Document   : vendors
    Created on : Aug 7, 2023, 1:13:06 PM
    Author     : USER
--%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vendors List</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
     <link rel="stylesheet" href="css/product-card.css">
</head>
<body>
    <%@include file="commen_comp/navbar.jsp" %>
    <div class="container mt-5">
        <h1>Vendors List</h1>
        <div class="row mt-3">
            <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/propertyhub", "testuser", "testuser");

                String query = "SELECT * FROM seller";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    int sellerId = resultSet.getInt("seller_id");
                    String firstName = resultSet.getString("firstName");
                    String lastName = resultSet.getString("lastName");
                    String email = resultSet.getString("email");
                    String contactNo = resultSet.getString("contactNo");
                    String shopAddress = resultSet.getString("shop_address");
            %>
            <div class="col-md-4 mb-4">
                <div class="product">
                    <div class="card-body">
                        <h2 ><%= firstName %> <%= lastName %></h2>
                        <p class="card-text"><strong>Email:</strong> <%= email %></p>
                        <p class="card-text"><strong>Contact:</strong> <%= contactNo %></p>
                        <p class="card-text"><strong>Shop Address:</strong> <%= shopAddress %></p>
                        <a href="propertyList.jsp?sellerId=<%= sellerId %>" class="btn btn-primary">Property List</a>
                    </div>
                </div>
            </div>
            <%
                }
                resultSet.close();
                preparedStatement.close();
                con.close();
            %>
        </div>
    </div>
                                    <%@include file="commen_comp/footer.jsp" %>


    <!-- Include Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

