<%-- 
    Document   : navbar
    Created on : Aug 7, 2023, 3:31:40 AM
    Author     : USER
--%>

<!DOCTYPE html>
<html>
<head>
    <title>Real Estate Management</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS link -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <!-- Custom CSS styles -->
    <style>
        /* Custom styles for the navigation bar */
        .navbar {
            background-color: #007bff; /* Change to your desired background color */
        }

        .navbar-brand {
            color: #fff; /* Change to your desired text color */
        }

        .navbar-brand:hover {
            color: #f0f0f0; /* Change to your desired text color on hover */
        }

        .navbar-nav .nav-link {
            color: #fff; /* Change to your desired text color */
            margin: 0 10px; /* Add some space between the links */
        }

        .navbar-nav .nav-link:hover {
            color: #f0f0f0; /* Change to your desired text color on hover */
        }
    </style>
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-dark">
        <div class="container">
            <!-- Logo (replace "Your Logo" with your site logo or name) -->
            <a class="navbar-brand" href="#">PorpertyHub</a>

            <!-- Hamburger button for small screens -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- Navigation Links -->
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Properties</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Vendors</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contact</a>
                    </li>
                    <!-- Add more navigation links as needed -->
                </ul>
            </div>
        </div>
    </nav>

    <!-- Your site content goes here -->

    <!-- Bootstrap JS scripts -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
