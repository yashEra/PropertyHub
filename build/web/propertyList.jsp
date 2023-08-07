<%-- 
    Document   : propertyList.jsp
    Created on : Aug 7, 2023, 1:13:40 PM
    Author     : USER
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<head>
    <title>Properties List</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/product-card.css">
    <style>
    .card-boder {
        border: 10px solid skyblue;
        padding: 15px;
    }
</style>
</head>
<body>
    <%@include file="commen_comp/navbar.jsp" %>
    <div class="container mt-5">
        <h1>Properties List</h1>
        <%
            int sellerId = Integer.parseInt(request.getParameter("sellerId"));

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/propertyhub", "testuser", "testuser");

            String query = "SELECT * FROM property WHERE seller_id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, sellerId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int propertyId = resultSet.getInt("pro_id");
                String propertyName = resultSet.getString("pro_name");
                String propertyType = resultSet.getString("pro_type");
                int price = resultSet.getInt("price");
                String imageUrl = resultSet.getString("pro_img_url");
        %>
        <div class="card mb-3 custom-card card-boder">
    <div class="row g-0">
        <div class="col-md-4 d-flex align-items-center">
            <img src="<%= imageUrl %>" alt="Property Image" class="img-fluid">
        </div>
        <div class="col-md-8">
            <div class="product">
                <h5 class="card-title"><%= propertyName %></h5>
                <p class="card-text"><strong>Type:</strong> <%= propertyType %></p>
                <p class="card-text"><strong>Price:</strong> <%= price %></p>
                <a href="item.jsp?pro_id=<%= propertyId %>" class="btn btn-primary">Buy Now</a>
            </div>
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
    <%@include file="commen_comp/footer.jsp" %>


    <!-- Include Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
