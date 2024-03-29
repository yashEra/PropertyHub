<%-- 
    Document   : contact-us
    Created on : Aug 3, 2023, 10:34:26 AM
    Author     : shach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String message = "";
    if(request.getParameter("status") != null){
        int status = Integer.parseInt(request.getParameter("status"));
        if(status == 1){
            message = "<h7 class='text-success'>Thank you for contacting us! Your inquiry has been received.</h7>";
        }
        else{
            message = "<h7 class='text-success'>Oops! Something went wrong while processing your request.Please try again later or contact our support team for assistance.</h7>";
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

  <!--boostrap icon-->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

  <!--external css-->
   <link rel="stylesheet" href="./css/contact-us.css">
  
  <title>Contact Us</title>
</head>

<body>
  <div class="container">
    <div class="row">
      <div class="col-md-5">
        <h4>Contact us</h4>
        <hr>
        <div class="mt-5">
          <div class="d-flex">
            <i class="bi bi-telephone-fill"></i>
            <p style="font-size: 14px">Contact: 0112222222</p>
          </div>
          <hr>
          <div class="d-flex">
            <i class="bi bi-envelope-fill"></i>
            <p style="font-size: 14px">Email: propertyhub@gmail.com</p>
          </div>
          <hr>
          <div class="d-flex">
            <i class="bi bi-facebook"></i>
            <p style="font-size: 14px">Facebook: PropertyHub</p>
          </div>
          <hr>
          <div class="d-flex">
            <i class="bi bi-instagram"></i>
            <p style="font-size: 14px">Instagram: @PropertyHubOfficial</p>
          </div>
          <hr>
        </div>

      </div>
      <div class="col-md-7">
            <form action="contactProcess.jsp" method="POST">
                <h4 class="pb-2">Send a Message</h4>
                <%= message %>
                <div class="mb-3 mt-2">
                    <label for="exampleFormControlInput1" class="form-label">Name</label>
                    <input type="text" class="form-control" name="name" id="exampleFormControlInput1" placeholder="John Perera">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Email</label>
                    <input type="email" class="form-control" name="email" id="exampleFormControlInput1" placeholder="perera@gmail.com">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Contact Number</label>
                    <input type="text" class="form-control" name="contactNo" id="exampleFormControlInput1" placeholder="0771234567">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">Message</label>
                    <textarea class="form-control" name="message" id="exampleFormControlTextarea1" rows="3"
                              placeholder="Your Message"></textarea>
                </div>
                <button type="submit" class="btn btn-primary" >Send</button>

            </form>
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
</body>

</html>

