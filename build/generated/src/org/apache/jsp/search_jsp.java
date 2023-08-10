package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Property Search and Filtering</title>\n");
      out.write("    <!-- Include Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <h1>Property Search and Filtering</h1>\n");
      out.write("        \n");
      out.write("        <!-- Filter Form -->\n");
      out.write("        <form action=\"search.jsp\" method=\"GET\" class=\"mb-3\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"filterName\" placeholder=\"Property Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"filterType\" placeholder=\"Property Type\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"filterPrice\" placeholder=\"Max Price\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Apply Filter</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <!-- Property Listing Table -->\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Type</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Image</th>\n");
      out.write("                    <th>Description</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Seller ID</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <!-- Property data will be loaded here -->\n");
      out.write("                ");
 
                    String jdbcUrl = "jdbc:mysql://localhost:3306/propertyhub";
                    String dbUser = "testuser";
                    String dbPassword = "testuser";
                    
                    Connection connection = null;
                    PreparedStatement preparedStatement = null;
                    ResultSet resultSet = null;
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
                        
                        String filterName = request.getParameter("filterName");
                        String filterType = request.getParameter("filterType");
                        int filterPrice = Integer.parseInt(request.getParameter("filterPrice"));
                        
                        String query = "SELECT * FROM property WHERE pro_name LIKE ? AND pro_type LIKE ? AND price <= ?";
                        preparedStatement = connection.prepareStatement(query);
                        preparedStatement.setString(1, "%" + filterName + "%");
                        preparedStatement.setString(2, "%" + filterType + "%");
                        preparedStatement.setInt(3, filterPrice);
                        
                        resultSet = preparedStatement.executeQuery();
                        
                        while (resultSet.next()) {
                            out.println("<tr>");
                            out.println("<td>" + resultSet.getInt("pro_id") + "</td>");
                            out.println("<td>" + resultSet.getString("pro_name") + "</td>");
                            out.println("<td>" + resultSet.getString("pro_type") + "</td>");
                            out.println("<td>" + resultSet.getInt("price") + "</td>");
                            out.println("<td><img src='" + resultSet.getString("pro_img_url") + "' alt='Property Image' height='50'></td>");
                            out.println("<td>" + resultSet.getString("description") + "</td>");
                            out.println("<td>" + resultSet.getInt("pro_quantity") + "</td>");
                            out.println("<td>" + resultSet.getInt("seller_id") + "</td>");
                            out.println("</tr>");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        if (resultSet != null) {
                            try {
                                resultSet.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (preparedStatement != null) {
                            try {
                                preparedStatement.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (connection != null) {
                            try {
                                connection.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Include Bootstrap JS and jQuery -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
