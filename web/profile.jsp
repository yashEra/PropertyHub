<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Buyer Profile</title>
</head>
<body>
    <h1>Edit Buyer Profile</h1>
    
    <%
        String update = request.getParameter("update");
        if (update != null && update.equals("update")) {
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String number = request.getParameter("number");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String uname = request.getParameter("username");
            
            Part profilePicture = request.getPart("profilePicture");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
                
                String query = "UPDATE buyer SET fname=?, lname=?, number=?, address=?, email=? WHERE username=?";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, fname);
                preparedStatement.setString(2, lname);
                preparedStatement.setString(3, number);
                preparedStatement.setString(4, address);
                preparedStatement.setString(5, email);
                preparedStatement.setString(6, uname);
                
                int rowsAffected = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                System.out.println("Rows updated: " + rowsAffected);
                
                out.println("Buyer information updated successfully!");
            } catch (Exception e) {
                e.printStackTrace();
                out.println("Error: " + e.getMessage());
            }
        }
        
        // Retrieve Buyer Information from the Database
        String buyer_id = "";
        String fname = "";
        String lname = "";
        String number = "";
        String address = "";
        String email = "";
        String uname = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
            
            Object username = session.getAttribute("loggedInUser");
            System.out.println(username);

            if (username != null) {
                String query = "SELECT buyer_id, fname, lname, number, address, email, username FROM buyer WHERE username = ?";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, username.toString());

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    buyer_id = resultSet.getString("buyer_id");
                    fname = resultSet.getString("fname");
                    lname = resultSet.getString("lname");
                    number = resultSet.getString("number");
                    address = resultSet.getString("address");
                    email = resultSet.getString("email");
                    uname = resultSet.getString("username");
                }

                preparedStatement.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
    


    <div class="container mt-5">
        <h1 class="mb-4">Edit Buyer Profile</h1>
        
        <%
            // ... (same code as before)
        %>
        
        <div class="row">
            <div class="col-md-6">
                <h2 class="mb-3">Buyer Profile Details</h2>
                <form action="buyerProfile.jsp" method="POST" enctype="multipart/form-data">
                    <input type="hidden" name="update" value="update">
                    <div class="mb-3">
                        <label class="form-label">First Name</label>
                        <input type="text" class="form-control" name="fname" value="<%= fname %>">
                    </div>
                    <!-- Repeat similar div blocks for other fields -->
                    <div class="mb-3">
                        <label class="form-label">Profile Picture</label>
                        <input type="file" class="form-control" name="profilePicture">
                    </div>
                    <button type="submit" class="btn btn-primary">Update Profile</button>
                </form>
            </div>
            <div class="col-md-6">
                <h2 class="mb-3">Profile Picture</h2>
                <img src="path_to_profile_pictures/<%= buyer_id %>.jpg" alt="Profile Picture" class="img-fluid">
            </div>
        </div>
    </div>

    <!-- Include Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

    
</body>
</html>
