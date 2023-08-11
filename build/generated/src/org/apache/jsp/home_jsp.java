package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/commen_comp/navbar.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/product-card.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Real Estate Management</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS link -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS styles -->\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Custom styles for the navigation bar */\r\n");
      out.write("        .navbar {\r\n");
      out.write("            background-color: #007bff; /* Change to your desired background color */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-brand {\r\n");
      out.write("            color: #fff; /* Change to your desired text color */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-brand:hover {\r\n");
      out.write("            color: #f0f0f0; /* Change to your desired text color on hover */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-nav .nav-link {\r\n");
      out.write("            color: #fff; /* Change to your desired text color */\r\n");
      out.write("            margin: 0 10px; /* Add some space between the links */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-nav .nav-link:hover {\r\n");
      out.write("            color: #f0f0f0; /* Change to your desired text color on hover */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Navigation Bar -->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- Logo (replace \"Your Logo\" with your site logo or name) -->\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">PorpertyHub</a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Hamburger button for small screens -->\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\"\r\n");
      out.write("                    aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <!-- Navigation Links -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Properties</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Vendors</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Contact</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- Add more navigation links as needed -->\r\n");
      out.write("                    <!--Search and Filter Form -->\r\n");
      out.write("                    <form class=\"form-inline ml-auto\" action=\"../search_Filter.jsp\" method=\"POST\">\r\n");
      out.write("                        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search Properties\" name=\"propertyName\">\r\n");
      out.write("                        <select class=\"custom-select mr-sm-2\" name=\"propertyType\">\r\n");
      out.write("                            <option value=\"\" style=\"color:#007bff\">All Types</option>\r\n");
      out.write("                            <option value=\"building\" style=\"color:#007bff\">Building</option>\r\n");
      out.write("                            <option value=\"house\" style=\"color:#007bff\">House</option>\r\n");
      out.write("                            <option value=\"vehicle\" style=\"color:#007bff\">Vehicles</option>\r\n");
      out.write("                            <option value=\"electronic\" style=\"color:#007bff\">Electronics</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("                        <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Your site content goes here -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap JS scripts -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container mt-4\">\r\n");
      out.write("            <h2>Houses</h2>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                \r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");

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

                        // Prepare the SQL query to retrieve all property details
                        String sql = "SELECT * FROM property";
                        pstmt = conn.prepareStatement(sql);

                        // Execute the query
                        rs = pstmt.executeQuery();

                        // Iterate over the result set and display property details
                        while (rs.next()) {
                            String propertyId = rs.getString("pro_id"); // Get the property ID
                            String propertyName = rs.getString("pro_name");
                            String description = rs.getString("description");
                            double price = rs.getDouble("price");
                            String pro_img_url = rs.getString("pro_img_url");
                            String type = rs.getString("pro_type");
                            // Add other relevant fields as needed
                            if (type.equals("house")) {

                
      out.write("\r\n");
      out.write("                <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                    <div class=\"product\">\r\n");
      out.write("                        <img src=\"");
      out.print( pro_img_url);
      out.write("\" class=\"card-img-top\" alt=\"Property Image\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">");
      out.print( propertyName);
      out.write("</h5>\r\n");
      out.write("                            <p class=\"card-text\">Price: ");
      out.print( price);
      out.write("</p>\r\n");
      out.write("                            <!--<p class=\"card-text\">");
      out.print( description);
      out.write("</p>-->\r\n");
      out.write("                            <a href=\"item.jsp?pro_id=");
      out.print( propertyId);
      out.write("\" class=\"btn btn-primary\">Buy Now</a>\r\n");
      out.write("                            <!-- Add other property details here -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                            }
                        } // End of while loop
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
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
