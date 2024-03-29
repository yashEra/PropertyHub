package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class propertyList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Properties List</title>\r\n");
      out.write("    <!-- Include Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/product-card.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("    .card-boder {\r\n");
      out.write("        border: 10px solid skyblue;\r\n");
      out.write("        padding: 15px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
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
      out.write("    <div class=\"container mt-5\">\r\n");
      out.write("        <h1>Properties List</h1>\r\n");
      out.write("        ");

            int sellerId = Integer.parseInt(request.getParameter("sellerId"));

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/propertyhub", "testuser", "testuser");

            String query = "SELECT * FROM property WHERE seller_id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, sellerId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int propertyId = resultSet.getInt("pro_id");
                String propertyName = resultSet.getString("pro_name");
                String propertyType = resultSet.getString("pro_type");
                int price = resultSet.getInt("price");
                String imageUrl = resultSet.getString("pro_img_url");
        
      out.write("\r\n");
      out.write("        <div class=\"card mb-3 custom-card card-boder\">\r\n");
      out.write("    <div class=\"row g-0\">\r\n");
      out.write("        <div class=\"col-md-4 d-flex align-items-center\">\r\n");
      out.write("            <img src=\"");
      out.print( imageUrl );
      out.write("\" alt=\"Property Image\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-8\">\r\n");
      out.write("            <div class=\"product\">\r\n");
      out.write("                <h5 class=\"card-title\">");
      out.print( propertyName );
      out.write("</h5>\r\n");
      out.write("                <p class=\"card-text\"><strong>Type:</strong> ");
      out.print( propertyType );
      out.write("</p>\r\n");
      out.write("                <p class=\"card-text\"><strong>Price:</strong> ");
      out.print( price );
      out.write("</p>\r\n");
      out.write("                <a href=\"item.jsp?pro_id=");
      out.print( propertyId );
      out.write("\" class=\"btn btn-primary\">Buy Now</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            }
            resultSet.close();
            preparedStatement.close();
            con.close();
        
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html data-bs-theme=\"light\" lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("    <title>Untitled</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Custom CSS to remove text underline */\r\n");
      out.write("        footer a.link-secondary {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"container py-4 py-lg-5\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("                <div class=\"col-sm-4 col-md-3 text-center text-lg-start d-flex flex-column item\">\r\n");
      out.write("                    <h3 class=\"fs-6\">Popular Categories</h3>\r\n");
      out.write("                    <ul class=\"list-unstyled\">\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">House</a></li>\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">Building</a></li>\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">Land</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-md-3 text-center text-lg-start d-flex flex-column item\">\r\n");
      out.write("                    <h3 class=\"fs-6\">Quick Links</h3>\r\n");
      out.write("                    <ul class=\"list-unstyled\">\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">About us</a></li>\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">Contact</a></li>\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">FAQ</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-md-3 text-center text-lg-start d-flex flex-column item\">\r\n");
      out.write("                    <h3 class=\"fs-6\">Contact</h3>\r\n");
      out.write("                    <ul class=\"list-unstyled\">\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">info@mail.com</a></li>\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">0752245147</a></li>\r\n");
      out.write("                        <li><a class=\"link-secondary\" href=\"#\">Sri Lanka</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 text-center text-lg-start d-flex flex-column align-items-center order-first align-items-lg-start order-lg-last item social\">\r\n");
      out.write("                    <div class=\"fw-bold d-flex align-items-center mb-2\"></div>\r\n");
      out.write("                    <p class=\"text-muted\">\r\n");
      out.write("                        Sem eleifend donec molestie, integer quisque orci aliquam.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"d-flex justify-content-between align-items-center pt-3\">\r\n");
      out.write("                <p class=\"text-muted mb-0\">\r\n");
      out.write("                    &copy; 2023 PropertyHub.com\r\n");
      out.write("                </p>\r\n");
      out.write("                <ul class=\"list-inline mb-0\">\r\n");
      out.write("                  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Include Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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
