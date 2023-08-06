package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    String message = "";
    if (request.getParameter("status") != null) {
        int status = Integer.parseInt(request.getParameter("status"));
        if (status == 0) {
            message = "<h7 class='text-danger'>Your username and password are incorrect.</h7>";
        }

    }

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("     <!--icon css-->\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/login.css\">\r\n");
      out.write("\r\n");
      out.write("    <title>Log in</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <form action=\"login.jsp\" method=\"POST\">\r\n");
      out.write("            <h4 class=\"text-center\">Login</h4>\r\n");
      out.write("            ");
      out.print( message );
      out.write("\r\n");
      out.write("            <div class=\"form-group mb-3 mt-5\">\r\n");
      out.write("              <label for=\"exampleInputEmail1\">Username</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"username\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group mb-3\">\r\n");
      out.write("              <label for=\"exampleInputPassword1\">Password</label>\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <input type=\"test\" class=\"form-control\" name=\"password\" id=\"exampleInputPassword1\">\r\n");
      out.write("                <div class=\"input-group-append\">\r\n");
      out.write("                  <button class=\"btn eye-btn\" type=\"button\" id=\"toggleVisibility\" >\r\n");
      out.write("                    <i class=\"fa-solid fa-eye-slash\" id=\"eyeIcon\"></i>\r\n");
      out.write("                  </button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <small id=\"emailHelp\" class=\"form-text text-muted mt-3 centered-text\">Don't have an account? <a href=\"register.jsp\" style=\"color:#146C94;text-decoration: none;\"><b> Sign up</b></a></small>\r\n");
      out.write("             \r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary mt-4\">Login </button>\r\n");
      out.write("          </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"./js/login.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\r\n");
      out.write("    <!--\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    -->\r\n");
      out.write("  </body>\r\n");
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
