<%@page import="classes.MD5"%>
<%@page import="java.sql.*"%>
<%@page import="classes.DBConnector"%>
<%@page import="classes.User"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int buyerId = (Integer)session.getAttribute("userId");
    String message = "";
    String firstName ="";
    String lastName = "";
    String email ="";
    String contactNo ="";
    String address="" ;
    try{
        Connection con = DBConnector.getConnection();
        String query = "SELECT * FROM  buyer WHERE buyer_id=?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1,buyerId);
        ResultSet rs = pstmt.executeQuery();
        
        if(rs.next()){
            User user = new User();
            user.setFirstName(rs.getString("firstName"));
            user.setLastName(rs.getString("lastName"));
            user.setEmail(rs.getString("email"));
            user.setConatcNumber(rs.getString("contactNo"));
            user.setAddress(rs.getString("address"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            
            request.setAttribute("user", user);
            firstName = user.getFirstName();
            lastName = user.getLastName();
            email = user.getEmail();
            contactNo = user.getConatcNumber();
            address = user.getAddress();
        }
        
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String newPassword = request.getParameter("newPassword");
            String confirmPassword = request.getParameter("confirmPassword");
            
            if(newPassword.equals(confirmPassword)){
                String hashed_password = MD5.getMd5(newPassword);
                
                String update_query = "UPDATE buyer SET password = ? WHERE buyer_id = ?";
                pstmt = con.prepareStatement(update_query);
                pstmt.setString(1, hashed_password);
                pstmt.setInt(2,buyerId);
                int a = pstmt.executeUpdate();
                
                if (a > 0) {
                    message = "<h6 class='text-success'>You have successfully saved your password.</h6>";
                } else {
                    message = "<h6 class='text-danger'>Oops! Error Occurred. Please try again.</h6>";
                }
            }
        }
        
    }catch(Exception e){
        e.printStackTrace();
    }
    
    
    
%>


<!DOCTYPE html>
<html lang="en">
    <html>
        <head>
            <meta charset="UTF-8">
            <title>Profile</title>
            <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
            <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

            <link rel="stylesheet" type="text/css" href="./css/profile.css">
        </head>




        <body>
            <section class="py-5 my-5">
                <div class="container">
                    <h1 class="mb-5">Buyer Profile</h1>
                    <div class="bg-white shadow rounded-lg d-block d-sm-flex">

                        <div class="profile-tab-nav border-right">

                            <div class="p-4">
                                <div class="img-circle text-center mb-3">
                                    <img src="./images/images/user2.jpg" alt="Image" class="shadow"> 
                                </div>
                                <h4 class="text-center">Sahan Chamikara</h4>
                                <div class="text-center">
                                    <button class="btn btn-secondary mt-2" data-toggle="modal" data-target="#uploadImageModal">Upload Image</button>
                                </div>
                            </div>

                            <!-- Modal for Upload Image -->
                            <div class="modal fade" id="uploadImageModal" tabindex="-1" role="dialog" aria-labelledby="uploadImageModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="uploadImageModalLabel">Upload Profile Image</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">


                                            <form enctype="multipart/form-data" action="upload_image.php" method="POST">
                                                <div class="form-group">
                                                    <label for="imageUpload">Choose an image:</label>
                                                    <input type="file" class="form-control-file" id="imageUpload" name="imageUpload">
                                                </div>
                                                <button type="submit" class="btn btn-primary">Upload</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>



                            <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                                <a class="nav-link active" id="account-tab" data-toggle="pill" href="#account" role="tab" aria-controls="account" aria-selected="true">
                                    <i class="fa fa-user text-center mr-1"></i> 
                                    Account
                                </a>

                                <a class="nav-link" id="password-tab" data-toggle="pill" href="#password" role="tab" aria-controls="password" aria-selected="false">
                                    <i class="fa fa-key text-center mr-1"></i> 
                                    Password
                                </a>
                            </div>
                        </div>



                        <div class="tab-content p-4 p-md-5" id="v-pills-tabContent">
                            <div class="tab-pane fade show active" id="account" role="tabpanel" aria-labelledby="account-tab">
                                <h3 class="mb-4">Account Settings</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label>First Name</label>
                                            <input type="text" class="form-control" value="<%= firstName %>">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label>Last Name</label>
                                            <input type="text" class="form-control" value="<%= lastName %>">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label>Email</label>
                                            <input type="text" class="form-control" value="<%= email %>">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label>Phone number</label>
                                            <input type="text" class="form-control" value="<%= contactNo %>">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label>Address</label>
                                            <input type="text" class="form-control" value="<%= address %>">
                                        </div>
                                    </div>
                                </div>
                                <div>
                                    <button type="button" class="btn btn-primary" id="editProfileBtn" onclick="redirectToEditPage()">Edit Profile</button>
                                    <button class="btn btn-light" onclick="goToLoginPage()">Back</button>
                                </div>
                            </div>

                            <div class="tab-pane fade" id="password" role="tabpanel" aria-labelledby="password-tab">
                                <h3 class="mb-4">Password Settings</h3>
                               <%=  message %>
                                <form action="" method="POST">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>New password</label>
                                                <input type="password" name="newPassword" class="form-control">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Confirm new password</label>
                                                <input type="password" name="confirmPassword" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    <div>
                                        <button class="btn btn-primary" type="submit">Save</button>
                                        <button class="btn btn-light">Back</button>
                                    </div>
                                    
                                </form>
                               
                            </div>
                        </div>
                        </section>


                        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
                        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
                        <script>
                            function redirectToEditPage() {
                                window.location.href = 'edit_buyerProfile.jsp';
                            }
                            function goToLoginPage() {
                                window.location.href = "loginForm.jsp";
                            }
                        </script>

        
        
        </body>
</html>



