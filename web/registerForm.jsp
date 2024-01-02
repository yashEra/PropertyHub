<%-- 
    Document   : register
    Created on : Aug 3, 2023, 10:39:00 AM
    Author     : shach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%
    String message = "";
    if (request.getParameter("status") != null) {
        int status = Integer.parseInt(request.getParameter("status"));
        if (status == 1) {
            message = "<h6 class='text-success'>You have successfully registered.</h6>";
        } else {
            message = "<h6 class='text-danger'>Oops! There was an error during sign-up. Please try again.</h6>";
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

    <title>Register</title>
</head>

<body>
    <div class="container-fluid" >
        <div class="row" style=" box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;">
            <div class="col-lg-6 hero-form">
                <form action="register.jsp" id="registrationForm" method="POST">
                    <h3 class="text-center"><b>Sign up to <span style="color:#146C94" class="h2">PropertyHub</span></b></h3>
                    <p class="mt-4 mb-4" style="color:rgba(0,0,0,0.6)">Welcome to PropertyHub, your ultimate destination for seamless real estate
                        transactions. Join us today and experience a hassle-free and efficient way to buy or sell
                        properties.</p>
                    <%= message %>
                    <div class="form-group mb-3">
                        <label for="role">Select Role:</label>
                        <select id="role" name="role">
                            <option value="buyer">Buyer</option>
                            <option value="seller">Seller</option>
                        </select>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail1">First Name</label>
                                <input type="text" class="form-control" name="firstname" id="exampleInputEmail1"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail1">Last Name</label>
                                <input type="text" class="form-control" name="lastname" id="exampleInputEmail1"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail1">Email</label>
                                <input type="email" class="form-control" name="email" id="exampleInputEmail1"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail1">Contact Number</label>
                                <input type="text" class="form-control" name="contactNo" id="exampleInputEmail1"
                                    aria-describedby="emailHelp">
                            </div>
                        </div>
                    </div>
                    <!-- input fields specific to buyer or seller -->
                        <!-- Buyer  -->
                    <div id="buyerFields" class="form-group hidden mb-3">
                        <label for="buyerAttribute">Address:</label>
                        <input type="text" class="form-control" id="buyerAttribute" name="address">
                    </div>
                    
                        <!-- Seller -->
                    <div id="sellerFields" class="form-group hidden mb-3">
                        <label for="sellerAttribute">Shop Address:</label>
                        <input type="text" id="sellerAttribute" name="shop_address" class="form-control">     
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div id="sellerFields2" class="form-group hidden mb-3">
                                <label for="sellerAttribute2">Account Number:</label>
                                <input type="text" id="sellerAttribute2" name="acc_number" class="form-control">
                            </div> 
                        </div>
                        <div class="col-lg-6">
                            <div id="sellerFields3" class="form-group hidden mb-3">
                                <label for="sellerAttribute3">Account Type:</label>
                                <input type="text" id="sellerAttribute3" name="acc_type" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div id="sellerFields4" class="form-group hidden mb-3">
                                <label for="sellerAttribute4">Bank Name:</label>
                                <input type="text" id="sellerAttribute4" name="acc_bank_name" class="form-control">
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div id="sellerFields5" class="form-group hidden mb-3">
                                <label for="sellerAttribute5">Bank Branch:</label>
                                <input type="text" id="sellerAttribute5" name="acc_bank_branch" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group mb-3">
                        <label for="exampleInputEmail1">Username</label>
                        <input type="text" class="form-control" name="username" id="exampleInputEmail1"
                            aria-describedby="emailHelp">
                    </div>
                    <div class="form-group mb-3">
                        <label for="exampleInputEmail1">Password</label>
                        <input type="text" class="form-control" name="password" id="exampleInputEmail1"
                            aria-describedby="emailHelp">
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>

            </div>
            <div class="col-lg-6 hero-image" >
                <img src="./images/register1.jpg" class="img-fluid hero-img" alt="...">
            </div>

        </div>
    </div>

    <script src="./js/register.js"></script>

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
</body>

</html>

