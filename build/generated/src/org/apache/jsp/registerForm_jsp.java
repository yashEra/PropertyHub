package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String message = "";
    if (request.getParameter("status") != null) {
        int status = Integer.parseInt(request.getParameter("status"));
        if (status == 1) {
            message = "<h6 class='text-success'>You have successfully registered with Samadhi Bookstore.</h6>";
        } else {
            message = "<h6 class='text-danger'>Oops! There was an error during sign-up. Please try again.</h6>";
        }
    }

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <link href=\"./css/register.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <title>Register</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container-fluid\" >\r\n");
      out.write("        <div class=\"row\" style=\" box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;\">\r\n");
      out.write("            <div class=\"col-lg-6 hero-form\">\r\n");
      out.write("                <form action=\"register.jsp\" id=\"registrationForm\" method=\"POST\">\r\n");
      out.write("                    <h3 class=\"text-center\"><b>Sign up to <span style=\"color:#146C94\" class=\"h2\">PropertyHub</span></b></h3>\r\n");
      out.write("                    <p class=\"mt-4 mb-4\" style=\"color:rgba(0,0,0,0.6)\">Welcome to PropertyHub, your ultimate destination for seamless real estate\r\n");
      out.write("                        transactions. Join us today and experience a hassle-free and efficient way to buy or sell\r\n");
      out.write("                        properties.</p>\r\n");
      out.write("                    ");
      out.print( message );
      out.write("\r\n");
      out.write("                    <div class=\"form-group mb-3\">\r\n");
      out.write("                        <label for=\"role\">Select Role:</label>\r\n");
      out.write("                        <select id=\"role\" name=\"role\">\r\n");
      out.write("                            <option value=\"buyer\">Buyer</option>\r\n");
      out.write("                            <option value=\"seller\">Seller</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"form-group mb-3\">\r\n");
      out.write("                                <label for=\"exampleInputEmail1\">First Name</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"firstname\" id=\"exampleInputEmail1\"\r\n");
      out.write("                                    aria-describedby=\"emailHelp\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"form-group mb-3\">\r\n");
      out.write("                                <label for=\"exampleInputEmail1\">Last Name</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"lastname\" id=\"exampleInputEmail1\"\r\n");
      out.write("                                    aria-describedby=\"emailHelp\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"form-group mb-3\">\r\n");
      out.write("                                <label for=\"exampleInputEmail1\">Email</label>\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"email\" id=\"exampleInputEmail1\"\r\n");
      out.write("                                    aria-describedby=\"emailHelp\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"form-group mb-3\">\r\n");
      out.write("                                <label for=\"exampleInputEmail1\">Contact Number</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"contactNo\" id=\"exampleInputEmail1\"\r\n");
      out.write("                                    aria-describedby=\"emailHelp\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- input fields specific to buyer or seller -->\r\n");
      out.write("                        <!-- Buyer  -->\r\n");
      out.write("                    <div id=\"buyerFields\" class=\"form-group hidden mb-3\">\r\n");
      out.write("                        <label for=\"buyerAttribute\">Address:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"buyerAttribute\" name=\"address\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                        <!-- Seller -->\r\n");
      out.write("                    <div id=\"sellerFields\" class=\"form-group hidden mb-3\">\r\n");
      out.write("                        <label for=\"sellerAttribute\">Shop Address:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"sellerAttribute\" name=\"shop_address\" class=\"form-control\">     \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div id=\"sellerFields2\" class=\"form-group hidden mb-3\">\r\n");
      out.write("                                <label for=\"sellerAttribute2\">Account Number:</label>\r\n");
      out.write("                                <input type=\"text\" id=\"sellerAttribute2\" name=\"acc_number\" class=\"form-control\">\r\n");
      out.write("                            </div> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div id=\"sellerFields3\" class=\"form-group hidden mb-3\">\r\n");
      out.write("                                <label for=\"sellerAttribute3\">Account Type:</label>\r\n");
      out.write("                                <input type=\"text\" id=\"sellerAttribute3\" name=\"acc_type\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div id=\"sellerFields4\" class=\"form-group hidden mb-3\">\r\n");
      out.write("                                <label for=\"sellerAttribute4\">Bank Name:</label>\r\n");
      out.write("                                <input type=\"text\" id=\"sellerAttribute4\" name=\"acc_bank_name\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div id=\"sellerFields5\" class=\"form-group hidden mb-3\">\r\n");
      out.write("                                <label for=\"sellerAttribute5\">Bank Branch:</label>\r\n");
      out.write("                                <input type=\"text\" id=\"sellerAttribute5\" name=\"acc_bank_branch\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group mb-3\">\r\n");
      out.write("                        <label for=\"exampleInputEmail1\">Username</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"username\" id=\"exampleInputEmail1\"\r\n");
      out.write("                            aria-describedby=\"emailHelp\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group mb-3\">\r\n");
      out.write("                        <label for=\"exampleInputEmail1\">Password</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"password\" id=\"exampleInputEmail1\"\r\n");
      out.write("                            aria-describedby=\"emailHelp\">\r\n");
      out.write("                        <div id=\"passwordHelpBlock\" class=\"form-text\">\r\n");
      out.write("                            Your password must be 8-20 characters long, contain letters and numbers, and must not contain spaces.\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-6 hero-image\" >\r\n");
      out.write("                <img src=\"./images/register1.jpg\" class=\"img-fluid hero-img\" alt=\"...\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"./js/register.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\r\n");
      out.write("    <!--\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
