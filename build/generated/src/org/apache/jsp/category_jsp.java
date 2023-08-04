package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Real estate category</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/category.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"#\" class=\"active\">Home</a></li>\n");
      out.write("            <li><a href=\"#\">Properties</a></li>\n");
      out.write("            <li><a href=\"#\">Agents</a></li>\n");
      out.write("            <li><a href=\"#\">About</a></li>\n");
      out.write("            <li><a href=\"#\">Contact</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Real Estate Categories</h2>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-4 pb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <img src=\"./images/shutterstock_1088460305-1000x460.jpg\" alt=\"Residential Properties\" class=\"card-img-top h-50 \">\n");
      out.write("              <div class=\"card-body d-flex flex-column\">\n");
      out.write("                <h5 class=\"card-title\">Residential Properties</h5>\n");
      out.write("                <p class=\"card-text mb-auto\">Single-family homes, apartments, condos, etc.</p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary mt-3\">View Properties</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("         \n");
      out.write("          <div class=\"col-lg-4 pb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <img src=\"./images/eyJidWNrZXQiOiJjb250ZW50Lmhzd3N0YXRpYy5jb20iLCJrZXkiOiJnaWZcL2J1eS12YWNhbnQtbG90LXVwZGF0ZTIuanBnIiwiZWRpdHMiOnsicmVzaXplIjp7IndpZHRoIjo4Mjh9fX0= (1).webp\" alt=\"Land and Lots\" class=\"card-img-top h-50\">\n");
      out.write("              <div class=\"card-body d-flex flex-column\">\n");
      out.write("                <h5 class=\"card-title\">Land and Lots</h5>\n");
      out.write("                <p class=\"card-text mb-auto\">Vacant land for development or investmentetc..</p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary mt-3\">View Properties</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-4 pb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <img src=\"./images/commercial.jpg\" alt=\"Industrial Properties\" class=\"card-img-top h-50\">\n");
      out.write("              <div class=\"card-body d-flex flex-column\">\n");
      out.write("                <h5 class=\"card-title\">Industrial Properties</h5>\n");
      out.write("                <p class=\"card-text mb-auto\">Manufacturing facilities, distribution centers, etc.</p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary mt-3\">View Properties</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("          <div class=\"col-lg-4 pb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <img src=\"./images/Capture-d’écran-2019-07-26-à-13.14.52.webp\" alt=\"Luxury Properties\" class=\"card-img-top h-50\">\n");
      out.write("              <div class=\"card-body d-flex flex-column\">\n");
      out.write("                <h5 class=\"card-title\">Luxury Properties</h5>\n");
      out.write("                <p class=\"card-text mb-auto\">High-end homes, estates, penthouses, etc.</p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary mt-3\">View Properties</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("          <div class=\"col-lg-4 pb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <img src=\"./images/nine-steps-to-turn-your-home-into-a-rental-property_hero.jpg\" alt=\"Rental Properties\" class=\"card-img-top h-50\">\n");
      out.write("              <div class=\"card-body d-flex flex-column\">\n");
      out.write("                <h5 class=\"card-title\">Rental Properties</h5>\n");
      out.write("                <p class=\"card-text mb-auto\">Properties available for lease or rent.</p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary mt-3\">View Properties</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("          <div class=\"col-lg-4 pb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <img src=\"./images/amazon-warehouse.jpg\" alt=\"Commercial Properties\" class=\"card-img-top h-50\">\n");
      out.write("              <div class=\"card-body d-flex flex-column\">\n");
      out.write("                <h5 class=\"card-title\">Commercial Properties</h5>\n");
      out.write("                <p class=\"card-text mb-auto\">Office buildings, retail spaces, warehouses, etc.</p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary mt-3\">View Properties</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <h3>About Us</h3>\n");
      out.write("                    <p>Our main focus is the customer journey in day-to-day management and our services are tailored to\n");
      out.write("                        each client. We dedicate our special attention to unique needs and\n");
      out.write("                        requirements to help hundreds of clients realize their homeownership goals, business setup, and\n");
      out.write("                        return on investments.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <h3>Quick Links</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Properties</a></li>\n");
      out.write("                        <li><a href=\"#\">Agents</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <h3>Contact Us</h3>\n");
      out.write("                    <p>123 Main St, City</p>\n");
      out.write("                    <p>Email: uwu.realestate.com</p>\n");
      out.write("                    <p>Phone: (123) 456-7890</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("\n");
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
