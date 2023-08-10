package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Edit Buyer Profile</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Edit Buyer Profile</h1>\n");
      out.write("    \n");
      out.write("    ");

        String update = request.getParameter("update");
        if (update != null && update.equals("update")) {
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String number = request.getParameter("number");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String uname = request.getParameter("username");
            
            Part profilePicture = request.getPart("profilePicture");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
                
                String query = "UPDATE buyer SET fname=?, lname=?, number=?, address=?, email=? WHERE username=?";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, fname);
                preparedStatement.setString(2, lname);
                preparedStatement.setString(3, number);
                preparedStatement.setString(4, address);
                preparedStatement.setString(5, email);
                preparedStatement.setString(6, uname);
                
                int rowsAffected = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                System.out.println("Rows updated: " + rowsAffected);
                
                out.println("Buyer information updated successfully!");
            } catch (Exception e) {
                e.printStackTrace();
                out.println("Error: " + e.getMessage());
            }
        }
        
        // Retrieve Buyer Information from the Database
        String buyer_id = "";
        String fname = "";
        String lname = "";
        String number = "";
        String address = "";
        String email = "";
        String uname = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
            
            Object username = session.getAttribute("loggedInUser");
            System.out.println(username);

            if (username != null) {
                String query = "SELECT buyer_id, fname, lname, number, address, email, username FROM buyer WHERE username = ?";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, username.toString());

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    buyer_id = resultSet.getString("buyer_id");
                    fname = resultSet.getString("fname");
                    lname = resultSet.getString("lname");
                    number = resultSet.getString("number");
                    address = resultSet.getString("address");
                    email = resultSet.getString("email");
                    uname = resultSet.getString("username");
                }

                preparedStatement.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <h1 class=\"mb-4\">Edit Buyer Profile</h1>\n");
      out.write("        \n");
      out.write("        ");

            // ... (same code as before)
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <h2 class=\"mb-3\">Buyer Profile Details</h2>\n");
      out.write("                <form action=\"buyerProfile.jsp\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                    <input type=\"hidden\" name=\"update\" value=\"update\">\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label class=\"form-label\">First Name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"fname\" value=\"");
      out.print( fname );
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Repeat similar div blocks for other fields -->\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label class=\"form-label\">Profile Picture</label>\n");
      out.write("                        <input type=\"file\" class=\"form-control\" name=\"profilePicture\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Update Profile</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <h2 class=\"mb-3\">Profile Picture</h2>\n");
      out.write("                <img src=\"path_to_profile_pictures/");
      out.print( buyer_id );
      out.write(".jpg\" alt=\"Profile Picture\" class=\"img-fluid\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Include Bootstrap JS -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
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
