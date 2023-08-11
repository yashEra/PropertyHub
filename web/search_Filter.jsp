<%-- 
    Document   : search_Filter
    Created on : Aug 11, 2023, 12:53:20 AM
    Author     : shach
--%>

<%@page import="java.sql.*"%>
<%@page import="classes.DBConnector"%>
<%@page import="classes.property"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search and Filter</title>
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
        <%@include file="commen_comp/navbar.jsp" %> <!-- included navbar -->
        
        <div class="container mt-5">
            <h1 class="text-center">Search Results</h1>
            <div class="all-products">
                <%
                    String propertyName = request.getParameter("propertyName");
                    String propertyType = request.getParameter("propertyType");
            
                    List<property> properties = new ArrayList<property>();
            
                    try {
                        Connection con= DBConnector.getConnection();
                        String query = "SELECT * FROM property WHERE pro_name LIKE ? AND pro_type LIKE ?";
                        PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setString(1, "%" + propertyName + "%");
                        pstmt.setString(2, "%" + propertyType + "%");
                        ResultSet rs = pstmt.executeQuery();

                        while (rs.next()) {
                            property property = new property(
                                rs.getInt("pro_id"),
                                rs.getString("pro_name"),
                                rs.getString("pro_type"),
                                rs.getInt("price"),
                                rs.getString("pro_img_url"),
                                rs.getString("description"),
                                rs.getInt("pro_quantity"),
                                rs.getInt("seller_id")
                        );
                        properties.add(property);
                    }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < properties.size(); i++) {
                        property property = properties.get(i);
                 %>
                 <div class="product">
                    <img src="<%= property.getProImgUrl()%>" alt="Property Image" class="img-fluid"> 
                    <h5 class="product-title"><%= property.getProName()%></h5>
                    <p class="product-price"><strong>Type:</strong> <%= property.getProType()%></p>
                    <p class="product-price"><strong>Price:</strong> <%= property.getPrice()%></p>
                    <a href="item.jsp?pro_id=<%= property.getProId()%>" class="btn btn-primary">View Details</a>
                 </div>
                <%
                    }
                %>
            </div>
        </div>
                
        <%@include file="commen_comp/footer.jsp" %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
