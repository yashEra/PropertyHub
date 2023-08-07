<%-- 
    Document   : category
    Created on : Aug 5, 2023, 12:16:34 AM
    Author     : shach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Real estate category</title>
    <link rel="stylesheet" type="text/css" href="./css/category.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
            <%@include file="commen_comp/navbar.jsp" %>



    <div class="container">
        <h2>Real Estate Categories</h2>
        <div class="row">
          <div class="col-lg-4 pb-4">
            <div class="card h-100">
              <img src="./images/Capture-d’écran-2019-07-26-à-13.14.52.webp" alt="Residential Properties" class="card-img-top h-50 ">
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Houses</h5>
                <p class="card-text mb-auto">Single-family homes, apartments, condos, etc.</p>
                <a href="home.jsp" class="btn btn-primary mt-3">View Properties</a>
              </div>
            </div>
          </div>
         
          <div class="col-lg-4 pb-4">
            <div class="card h-100">
              <img src="./images/shutterstock_1088460305-1000x460.jpg" alt="Land and Lots" class="card-img-top h-50">
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Building</h5>
                <p class="card-text mb-auto">Vacant land for development or investmentetc..</p>
                <a href="building.jsp" class="btn btn-primary mt-3">View Properties</a>
              </div>
            </div>
          </div>
          <div class="col-lg-4 pb-4">
            <div class="card h-100">
              <img src="./images/commercial.jpg" alt="Industrial Properties" class="card-img-top h-50">
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Apartments</h5>
                <p class="card-text mb-auto">Manufacturing facilities, distribution centers, etc.</p>
                <a href="apartment.jsp" class="btn btn-primary mt-3">View Properties</a>
              </div>
            </div>
          </div>
    
          <div class="col-lg-4 pb-4">
            <div class="card h-100">
              <img src="./images/eyJidWNrZXQiOiJjb250ZW50Lmhzd3N0YXRpYy5jb20iLCJrZXkiOiJnaWZcL2J1eS12YWNhbnQtbG90LXVwZGF0ZTIuanBnIiwiZWRpdHMiOnsicmVzaXplIjp7IndpZHRoIjo4Mjh9fX0= (1).webp" alt="Luxury Properties" class="card-img-top h-50">
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Lands</h5>
                <p class="card-text mb-auto">High-end homes, estates, penthouses, etc.</p>
                <a href="land.jsp" class="btn btn-primary mt-3">View Properties</a>
              </div>
            </div>
          </div>
    
          <div class="col-lg-4 pb-4">
            <div class="card h-100">
              <img src="./images/nine-steps-to-turn-your-home-into-a-rental-property_hero.jpg" alt="Rental Properties" class="card-img-top h-50">
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Industrial</h5>
                <p class="card-text mb-auto">Properties available for lease or rent.</p>
                <a href="industrial.jsp" class="btn btn-primary mt-3">View Properties</a>
              </div>
            </div>
          </div>
    
          <div class="col-lg-4 pb-4">
            <div class="card h-100">
              <img src="./images/amazon-warehouse.jpg" alt="Commercial Properties" class="card-img-top h-50">
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Commercial Properties</h5>
                <p class="card-text mb-auto">Office buildings, retail spaces, warehouses, etc.</p>
                <a href="commercial.jsp" class="btn btn-primary mt-3">View Properties</a>
              </div>
            </div>
          </div>
        </div>
      </div>
</body>

</html>
