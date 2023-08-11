package org.apache.jsp.commen_005fcomp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("\r\n");
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
      out.write("                    <!--Search and Filter Form -->\r\n");
      out.write("                    <form class=\"form-inline ml-auto\" action=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" method=\"POST\">\r\n");
      out.write("                        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search Properties\" name=\"propertyName\">\r\n");
      out.write("                        <select class=\"custom-select mr-sm-2\" name=\"propertyType\">\r\n");
      out.write("                            <option value=\"\" style=\"color:#007bff\">All Types</option>\r\n");
      out.write("                            <option value=\"building\" style=\"color:#007bff\">Building</option>\r\n");
      out.write("                            <option value=\"house\" style=\"color:#007bff\">House</option>\r\n");
      out.write("                            <option value=\"vehicle\" style=\"color:#007bff\">Vehicles</option>\r\n");
      out.write("                            <option value=\"electronic\" style=\"color:#007bff\">Electronics</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("                        <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("                    </form>\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/search_Filter.jsp");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
