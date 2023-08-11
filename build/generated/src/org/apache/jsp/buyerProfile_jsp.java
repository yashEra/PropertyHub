package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import classes.DBConnector;
import classes.User;

public final class buyerProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    int buyerId = (Integer)session.getAttribute("userId");
    String firstName ="";
    String lastName = "";
    String email ="";
    String contactNo ="";
    String address="" ;
    try{
        Connection con = DBConnector.getConnection();
        String query = "SELECT * FROM  buyer WHERE buyer_id=?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1,buyerId);
        ResultSet rs = pstmt.executeQuery();
        
        if(rs.next()){
            User user = new User();
            user.setFirstName(rs.getString("firstName"));
            user.setLastName(rs.getString("lastName"));
            user.setEmail(rs.getString("email"));
            user.setConatcNumber(rs.getString("contactNo"));
            user.setAddress(rs.getString("address"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            
            request.setAttribute("user", user);
            firstName = user.getFirstName();
            lastName = user.getLastName();
            email = user.getEmail();
            contactNo = user.getConatcNumber();
            address = user.getAddress();
        }
        
    }catch(Exception e){
        e.printStackTrace();
    }
    
    
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <title>Profile</title>\n");
      out.write("            <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/profile\">\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <section class=\"py-5 my-5\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1 class=\"mb-5\">Buyer Profile</h1>\n");
      out.write("                    <div class=\"bg-white shadow rounded-lg d-block d-sm-flex\">\n");
      out.write("\n");
      out.write("                        <div class=\"profile-tab-nav border-right\">\n");
      out.write("\n");
      out.write("                            <div class=\"p-4\">\n");
      out.write("                                <div class=\"img-circle text-center mb-3\">\n");
      out.write("                                    <img src=\"./images/images/user2.jpg\" alt=\"Image\" class=\"shadow\"> \n");
      out.write("                                </div>\n");
      out.write("                                <h4 class=\"text-center\">Sahan Chamikara</h4>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button class=\"btn btn-secondary mt-2\" data-toggle=\"modal\" data-target=\"#uploadImageModal\">Upload Image</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Modal for Upload Image -->\n");
      out.write("                            <div class=\"modal fade\" id=\"uploadImageModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"uploadImageModalLabel\" aria-hidden=\"true\">\n");
      out.write("                                <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                                    <div class=\"modal-content\">\n");
      out.write("                                        <div class=\"modal-header\">\n");
      out.write("                                            <h5 class=\"modal-title\" id=\"uploadImageModalLabel\">Upload Profile Image</h5>\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <form enctype=\"multipart/form-data\" action=\"upload_image.php\" method=\"POST\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"imageUpload\">Choose an image:</label>\n");
      out.write("                                                    <input type=\"file\" class=\"form-control-file\" id=\"imageUpload\" name=\"imageUpload\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary\">Upload</button>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"nav flex-column nav-pills\" id=\"v-pills-tab\" role=\"tablist\" aria-orientation=\"vertical\">\n");
      out.write("                                <a class=\"nav-link active\" id=\"account-tab\" data-toggle=\"pill\" href=\"#account\" role=\"tab\" aria-controls=\"account\" aria-selected=\"true\">\n");
      out.write("                                    <i class=\"fa fa-user text-center mr-1\"></i> \n");
      out.write("                                    Account\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <a class=\"nav-link\" id=\"password-tab\" data-toggle=\"pill\" href=\"#password\" role=\"tab\" aria-controls=\"password\" aria-selected=\"false\">\n");
      out.write("                                    <i class=\"fa fa-key text-center mr-1\"></i> \n");
      out.write("                                    Password\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <a class=\"nav-link\" id=\"settings-tab\" data-toggle=\"pill\" href=\"#settings\" role=\"tab\" aria-controls=\"settings\" aria-selected=\"false\">\n");
      out.write("                                    <i class=\"fa fa-cog text-center mr-1\"></i> \n");
      out.write("                                    Settings\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"tab-content p-4 p-md-5\" id=\"v-pills-tabContent\">\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"account\" role=\"tabpanel\" aria-labelledby=\"account-tab\">\n");
      out.write("                                <h3 class=\"mb-4\">Account Settings</h3>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>First Name</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" value=\"");
      out.print( firstName );
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Last Name</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" value=\"");
      out.print( lastName );
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Email</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" value=\"");
      out.print( email );
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Phone number</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" value=\"");
      out.print( contactNo );
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Address</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" value=\"");
      out.print( address );
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <button class=\"btn btn-primary\">Save</button>\n");
      out.write("                                    <button class=\"btn btn-light\">Cancel</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"password\" role=\"tabpanel\" aria-labelledby=\"password-tab\">\n");
      out.write("                                <h3 class=\"mb-4\">Password Settings</h3>\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>New password</label>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Confirm new password</label>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <button class=\"btn btn-primary\">Save</button>\n");
      out.write("                                    <button class=\"btn btn-light\">Cancel</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"settings\" role=\"tabpanel\" aria-labelledby=\"settings-tab\">\n");
      out.write("                                <div class=\"Other Settings\">\n");
      out.write("                                    <h3 class=\"mb-4\">Other Settings</h3>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"languageSelect\">Select Language:</label>\n");
      out.write("                                        <select class=\"form-control\" id=\"languageSelect\">\n");
      out.write("                                            <option value=\"en\">English</option>\n");
      out.write("                                            <option value=\"es\">Sinhala</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <br>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"propertyAlertSelect\">Property Alert Settings:</label>\n");
      out.write("                                            <select class=\"form-control\" id=\"propertyAlertSelect\">\n");
      out.write("                                                <option value=\"none\">Do Not Receive Alerts</option>\n");
      out.write("                                                <option value=\"weekly\">Receive Weekly Alerts</option>\n");
      out.write("                                                <option value=\"daily\">Receive Daily Alerts</option>\n");
      out.write("                                                <!-- Add more alert options as needed -->\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <br>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"communicationSelect\">Preferred Communication Method:</label>\n");
      out.write("                                            <select class=\"form-control\" id=\"communicationSelect\">\n");
      out.write("                                                <option value=\"email\">Email</option>\n");
      out.write("                                                <option value=\"phone\">Phone</option>\n");
      out.write("                                                <option value=\"both\">Both Email and Phone</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <button class=\"btn btn-primary\">Save</button>\n");
      out.write("                                            <button class=\"btn btn-light\">Cancel</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("                        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("                        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
