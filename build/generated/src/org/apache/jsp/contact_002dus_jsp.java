package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_002dus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String message = "";
    if(request.getParameter("status") != null){
        int status = Integer.parseInt(request.getParameter("status"));
        if(status == 1){
            message = "<h7 class='text-success'>Thank you for contacting us! Your inquiry has been received.</h7>";
        }
        else{
            message = "<h7 class='text-success'>Oops! Something went wrong while processing your request.Please try again later or contact our support team for assistance.</h7>";
        }
    }

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("  <!-- Bootstrap CSS -->\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("    integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("  <!--boostrap icon-->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css\">\n");
      out.write("\n");
      out.write("  <!--external css-->\n");
      out.write("   <link rel=\"stylesheet\" href=\"./css/contact-us.css\">\n");
      out.write("  \n");
      out.write("  <title>Contact Us</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-5\">\n");
      out.write("        <h4>Contact us</h4>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"mt-5\">\n");
      out.write("          <div class=\"d-flex\">\n");
      out.write("            <i class=\"bi bi-telephone-fill\"></i>\n");
      out.write("            <p style=\"font-size: 14px\">Contact: 0112222222</p>\n");
      out.write("          </div>\n");
      out.write("          <hr>\n");
      out.write("          <div class=\"d-flex\">\n");
      out.write("            <i class=\"bi bi-envelope-fill\"></i>\n");
      out.write("            <p style=\"font-size: 14px\">Email: propertyhub@gmail.com</p>\n");
      out.write("          </div>\n");
      out.write("          <hr>\n");
      out.write("          <div class=\"d-flex\">\n");
      out.write("            <i class=\"bi bi-facebook\"></i>\n");
      out.write("            <p style=\"font-size: 14px\">Facebook: PropertyHub</p>\n");
      out.write("          </div>\n");
      out.write("          <hr>\n");
      out.write("          <div class=\"d-flex\">\n");
      out.write("            <i class=\"bi bi-instagram\"></i>\n");
      out.write("            <p style=\"font-size: 14px\">Instagram: @PropertyHubOfficial</p>\n");
      out.write("          </div>\n");
      out.write("          <hr>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-7\">\n");
      out.write("            <form action=\"contactProcess.jsp\" method=\"POST\">\n");
      out.write("                <h4 class=\"pb-2\">Send a Message</h4>\n");
      out.write("                ");
      out.print( message );
      out.write("\n");
      out.write("                <div class=\"mb-3 mt-2\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"name\" id=\"exampleFormControlInput1\" placeholder=\"John Perera\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Email</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" name=\"email\" id=\"exampleFormControlInput1\" placeholder=\"perera@gmail.com\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Contact Number</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"contactNo\" id=\"exampleFormControlInput1\" placeholder=\"0771234567\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlTextarea1\" class=\"form-label\">Message</label>\n");
      out.write("                    <textarea class=\"form-control\" name=\"message\" id=\"exampleFormControlTextarea1\" rows=\"3\"\n");
      out.write("                              placeholder=\"Your Message\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" >Send</button>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("      </div>      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("  <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("    integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("  <!-- Option 2: Separate Popper and Bootstrap JS -->\n");
      out.write("  <!--\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("    -->\n");
      out.write("</body>\n");
      out.write("\n");
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
