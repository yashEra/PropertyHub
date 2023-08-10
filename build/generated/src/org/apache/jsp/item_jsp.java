package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class item_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/commen_comp/navbar.jsp");
    _jspx_dependants.add("/commen_comp/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Item Description</title>\n");
      out.write("        <!-- Bootstrap CSS link -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .item__header {\n");
      out.write("                position: relative;\n");
      out.write("                height: 100vh;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background: linear-gradient(0deg, rgba(135, 206, 235, 0.54), rgba(0, 21, 47, 0.69)), url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro_img_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\") rgba(0, 0, 0, 0.4) center/cover no-repeat;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                            ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Real Estate Management</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS link -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS styles -->\n");
      out.write("    <style>\n");
      out.write("        /* Custom styles for the navigation bar */\n");
      out.write("        .navbar {\n");
      out.write("            background-color: #007bff; /* Change to your desired background color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-brand {\n");
      out.write("            color: #fff; /* Change to your desired text color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-brand:hover {\n");
      out.write("            color: #f0f0f0; /* Change to your desired text color on hover */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-nav .nav-link {\n");
      out.write("            color: #fff; /* Change to your desired text color */\n");
      out.write("            margin: 0 10px; /* Add some space between the links */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-nav .nav-link:hover {\n");
      out.write("            color: #f0f0f0; /* Change to your desired text color on hover */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Navigation Bar -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Logo (replace \"Your Logo\" with your site logo or name) -->\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">PorpertyHub</a>\n");
      out.write("\n");
      out.write("            <!-- Hamburger button for small screens -->\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\"\n");
      out.write("                    aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <!-- Navigation Links -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Properties</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Vendors</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- Add more navigation links as needed -->\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Your site content goes here -->\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS scripts -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            // Database connection settings
            String dbURL = "jdbc:mysql://localhost:3306/propertyhub";
            String dbUser = "testuser";
            String dbPassword = "testuser";

            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            try {
                // Connect to the database
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

                // Get the property ID from the URL parameter
                String propertyId = request.getParameter("pro_id");

                // Prepare the SQL query to retrieve property details
                String sql = "SELECT * FROM property WHERE pro_id = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, propertyId);

                // Execute the query
                rs = pstmt.executeQuery();

                // Check if a property with the given ID exists
                if (rs.next()) {
                    // Extract property details from the ResultSet
                    String propertyName = rs.getString("pro_name");
                    String description = rs.getString("description");
                    double price = rs.getDouble("price");
                    String pro_img_url = rs.getString("pro_img_url");
                    // Add other relevant fields as needed
        
      out.write("\n");
      out.write("        <!-- Property Details Section -->\n");
      out.write("        <div class=\"\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <img src=\"");
      out.print( pro_img_url);
      out.write("\" class=\"img-fluid\" alt=\"Property Image\" width=\"100%\">\n");
      out.write("            <h1>");
      out.print( propertyName);
      out.write("</h1>\n");
      out.write("            <p>");
      out.print( description);
      out.write("</p>\n");
      out.write("            <p>Price: ");
      out.print( price);
      out.write("</p>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <!-- Add other property details here -->\n");
      out.write("            <!-- Buy Now Button -->\n");
      out.write("            <form action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" target=\"_top\">\n");
      out.write("                <input type=\"hidden\" name=\"cmd\" value=\"_xclick\">\n");
      out.write("                <input type=\"hidden\" name=\"business\" value=\"ya794120@gmail.com\">\n");
      out.write("                <input type=\"hidden\" name=\"item_name\" value=\"");
      out.print( propertyName);
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"amount\" value=\"");
      out.print( price);
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"currency_code\" value=\"USD\">\n");
      out.write("                <input type=\"hidden\" name=\"return\" value=\"http://your_website.com/success\">\n");
      out.write("                <input type=\"hidden\" name=\"cancel_return\" value=\"http://your_website.com/cancel\">\n");
      out.write("                <input type=\"submit\" value=\"Buy Now\" class=\"btn btn-primary\">\n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("                            ");
      out.write("\n");
      out.write("\n");
      out.write("<html data-bs-theme=\"light\" lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>Untitled</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    <style>\n");
      out.write("        /* Custom CSS to remove text underline */\n");
      out.write("        footer a.link-secondary {\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container py-4 py-lg-5\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-sm-4 col-md-3 text-center text-lg-start d-flex flex-column item\">\n");
      out.write("                    <h3 class=\"fs-6\">Popular Categories</h3>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">House</a></li>\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">Building</a></li>\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">Land</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 col-md-3 text-center text-lg-start d-flex flex-column item\">\n");
      out.write("                    <h3 class=\"fs-6\">Quick Links</h3>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">About us</a></li>\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">Contact</a></li>\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">FAQ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 col-md-3 text-center text-lg-start d-flex flex-column item\">\n");
      out.write("                    <h3 class=\"fs-6\">Contact</h3>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">info@mail.com</a></li>\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">0752245147</a></li>\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">Sri Lanka</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 text-center text-lg-start d-flex flex-column align-items-center order-first align-items-lg-start order-lg-last item social\">\n");
      out.write("                    <div class=\"fw-bold d-flex align-items-center mb-2\"></div>\n");
      out.write("                    <p class=\"text-muted\">\n");
      out.write("                        Sem eleifend donec molestie, integer quisque orci aliquam.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"d-flex justify-content-between align-items-center pt-3\">\n");
      out.write("                <p class=\"text-muted mb-0\">\n");
      out.write("                    &copy; 2023 PropertyHub.com\n");
      out.write("                </p>\n");
      out.write("                <ul class=\"list-inline mb-0\">\n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("        ");

                } else {
                    // Property with the given ID not found
                    // Handle the error case (e.g., redirect to an error page)
                    response.sendRedirect("error.jsp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close resources (ResultSet, PreparedStatement, and Connection)
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap JS link -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
