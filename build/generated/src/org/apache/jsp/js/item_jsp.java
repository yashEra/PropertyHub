package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import classes.DBConnector;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   // Your database connection settings
//   String dbURL = "jdbc:mysql://localhost:3306/your_database_name";
//   String dbUser = "your_mysql_username";
//   String dbPassword = "your_mysql_password";

   Connection conn = null;
   PreparedStatement pstmt = null;
   ResultSet rs = null;

   try {
       // Connect to the database
//       Class.forName("com.mysql.jdbc.Driver");
//       conn = DriverManager.getConnection(DRIVER, DB_USER, DB_PASSWORD);

       // Get the property ID from the URL parameter
       String propertyId = request.getParameter("id");

       // Prepare the SQL query to retrieve property details
       String sql = "SELECT * FROM properties WHERE id = ?";
       pstmt = conn.prepareStatement(sql);
       pstmt.setString(1, propertyId);

       // Execute the query
       rs = pstmt.executeQuery();

       // Check if a property with the given ID exists
       if (rs.next()) {
           // Extract property details from the ResultSet
           String propertyName = rs.getString("property_name");
           String description = rs.getString("description");
           double price = rs.getDouble("price");
           String location = rs.getString("location");
           // Add other relevant fields as needed

           // Display the property details using Bootstrap

      out.write("\n");
      out.write("           <!-- Property Details Section -->\n");
      out.write("           <div class=\"container\">\n");
      out.write("               <h1>");
      out.print( propertyName );
      out.write("</h1>\n");
      out.write("               <p>");
      out.print( description );
      out.write("</p>\n");
      out.write("               <p>Price: ");
      out.print( price );
      out.write("</p>\n");
      out.write("               <p>Location: ");
      out.print( location );
      out.write("</p>\n");
      out.write("               <!-- Add other property details here -->\n");
      out.write("           </div>\n");

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

      out.write('\n');
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
