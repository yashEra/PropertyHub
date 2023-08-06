package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class item_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Item Description</title>\n");
      out.write("    <!-- Bootstrap CSS link -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

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
      out.write("    <!-- Property Details Section -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>");
      out.print( propertyName );
      out.write("</h1>\n");
      out.write("        <p>");
      out.print( description );
      out.write("</p>\n");
      out.write("        <p>Price: ");
      out.print( price );
      out.write("</p>\n");
      out.write("        <img src=\"");
      out.print( pro_img_url );
      out.write("\" class=\"img-fluid\" alt=\"Property Image\">\n");
      out.write("        <!-- Add other property details here -->\n");
      out.write("        <!-- Buy Now Button -->\n");
      out.write("        <form action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" target=\"_top\">\n");
      out.write("            <input type=\"hidden\" name=\"cmd\" value=\"_xclick\">\n");
      out.write("            <input type=\"hidden\" name=\"business\" value=\"your_paypal_business_email@example.com\">\n");
      out.write("            <input type=\"hidden\" name=\"item_name\" value=\"");
      out.print( propertyName );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"amount\" value=\"");
      out.print( price );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"currency_code\" value=\"USD\">\n");
      out.write("            <input type=\"hidden\" name=\"return\" value=\"http://your_website.com/success\">\n");
      out.write("            <input type=\"hidden\" name=\"cancel_return\" value=\"http://your_website.com/cancel\">\n");
      out.write("            <input type=\"submit\" value=\"Buy Now\" class=\"btn btn-primary\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    ");
 
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
                try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
            if (pstmt != null) {
                try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
            if (conn != null) {
                try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS link -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
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
