<%-- 
    Document   : login
    Created on : Aug 3, 2023, 10:31:31 AM
    Author     : shach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String message = "";
    if (request.getParameter("status") != null) {
        int status = Integer.parseInt(request.getParameter("status"));
        if (status == 0) {
            message = "<h7 class='text-danger'>Your username and password are incorrect.</h7>";
        }
        if (status == 1) {
            message = "<h7 class='text-info'>you have.</h7>";
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

     <!--icon css-->
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <!--external css-->
    <link rel="stylesheet" href="./css/login.css">

    <title>Log in</title>
  </head>
  <body>
    <div class="container-fluid">
        <form action="login.jsp" method="POST">
            <h4 class="text-center">Login</h4>
            <%= message %>
            <div class="form-group mb-3 mt-5">
              <label for="exampleInputEmail1">Username</label>
              <input type="text" class="form-control" name="username" id="exampleInputEmail1" aria-describedby="emailHelp">
            </div>
            <div class="form-group mb-3">
              <label for="exampleInputPassword1">Password</label>
              <div class="input-group">
                <input type="test" class="form-control" name="password" id="exampleInputPassword1">
                <div class="input-group-append">
                  <button class="btn eye-btn" type="button" id="toggleVisibility" >
                    <i class="fa-solid fa-eye-slash" id="eyeIcon"></i>
                  </button>
                </div>
              </div>
              <small id="emailHelp" class="form-text text-muted mt-3 centered-text">Don't have an account? <a href="register.jsp" style="color:#146C94;text-decoration: none;"><b> Sign up</b></a></small>
             
            </div>
            <button type="submit" class="btn btn-primary mt-4">Login </button>
          </form>
    </div>
    <script src="./js/login.js"></script>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>
