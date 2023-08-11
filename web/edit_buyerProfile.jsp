<%-- 
    Document   : register
    Created on : Aug 3, 2023, 10:39:00 AM
    Author     : shach
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="classes.DBConnector"%>
<%@page session="true" %>
<%
    String message = "";
    if (request.getMethod().equalsIgnoreCase("POST")) {
        
        int buyerId = (Integer)session.getAttribute("userId");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String contactNo =request.getParameter("contactNo");
        String address = request.getParameter("address");
    
        try{
            Connection con = DBConnector.getConnection();
            String query = "UPDATE buyer SET firstName=?, lastName=?, email=?, contactNo=?, address=? WHERE buyer_id =?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, firstname);
            pstmt.setString(2, lastname);
            pstmt.setString(3, email);
            pstmt.setString(4, contactNo);
            pstmt.setString(5, address);
            pstmt.setInt(6,buyerId);
            int a = pstmt.executeUpdate();
            
            if(a>0){
                 message = "<h6 class='text-success'>You have successfully saved your changes.</h6>";
            }
            else{
               message = "<h6 class='text-danger'>Oops! Error Occurred. Please try again.</h6>"; 
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
      
          
    }
%>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!--external css-->
    <link href="./css/register.css" rel="stylesheet">

    <title>Edit Profile</title>
</head>

<body>
    <div class="container-fluid" >
        <div class="row" style=" box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;">
            <div class="col-lg-6 hero-form">
                <form action="" id="registrationForm" method="POST">
                    <h3 style="color:#146C94" class="h2"><b>Edit Your Profile</b></h3>
                    <%= message %>
                    <div class="row mt-3">
                        
                        <div class="col-lg-9">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail1">First Name</label>
                                <input type="text" class="form-control" name="firstname" id="exampleInputEmail1"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                        <div class="col-lg-9">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail2">Last Name</label>
                                <input type="text" class="form-control" name="lastname" id="exampleInputEmail2"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                        <div class="col-lg-9">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail3">Email</label>
                                <input type="email" class="form-control" name="email" id="exampleInputEmail3"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                        <div class="col-lg-9">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail4">Contact Number</label>
                                <input type="text" class="form-control" name="contactNo" id="exampleInputEmail4"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                        <div class="col-lg-9">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail5">Address</label>
                                <input type="text" class="form-control" name="address" id="exampleInputEmail5"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                    
                    </div>

                    <button type="submit" class="btn btn-primary">Save</button>
                    <button type="button" class="btn btn-primary" onclick="goBack()">Back</button>
                </form>

            </div>
            <div class="col-lg-6 hero-image" >
                <img src="./images/profile.jpg" class="img-fluid hero-img" alt="...">
            </div>

        </div>
    </div>
                        

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
    <script>
    function goBack() {
        window.history.back();
    }
</script>

</body>

</html>


