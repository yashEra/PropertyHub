package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classes.DBConnector;
import classes.User;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String role = request.getParameter("role");
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
    String contactNo =request.getParameter("contactNo");
    String address = request.getParameter("address");
    String shop_address = request.getParameter("shop_address");
    String acc_number = request.getParameter("acc_number");
    String acc_type = request.getParameter("acc_type");
    String acc_bank_name = request.getParameter("acc_bank_name");
    String acc_bank_branch = request.getParameter("acc_bank_branch");
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    User user = new User();
    user.setRole(role);
    user.setFirstName(firstname);
    user.setLastName(lastname);
    user.setEmail(email);
    user.setConatcNumber(contactNo);
    user.setUsername(username);
    user.setPassword(password);
    
    if("buyer".equals(role)){
        user.setAddress(address);
    }
    else if("seller".equals(role)){
        user.setShopAddress(shop_address);
        user.setAccountNumber(acc_number);
        user.setAccountType(acc_type);
        user.setBankName(acc_bank_name);
        user.setBranchName(acc_bank_branch);
    }
    
    if (user.register(DBConnector.getConnection())) {
        response.sendRedirect("registerForm.jsp?status=1");
    } else {
        response.sendRedirect("registerForm.jsp?status=0");
    }

      out.write('\n');
      out.write('\n');

   /* String role = request.getParameter("role");
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
   int contactNo = Integer.parseInt(request.getParameter("contactNo"));
    String address = request.getParameter("address");
    String shop_address = request.getParameter("shop_address");
    String acc_number = request.getParameter("acc_number");
    String acc_type = request.getParameter("acc_type");
    String acc_bank_name = request.getParameter("acc_bank_name");
    String acc_bank_branch = request.getParameter("acc_bank_branch");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    User user = new User();
    user.setRole(role);
    user.setFirstName(firstname);
    user.setLastName(lastname);
    user.setEmail(email);
    user.setConatcNumber(contactNo);
    user.setUsername(username);
    user.setPassword(password);
    
    if("buyer".equals(role)){
        user.setAddress(address);
    }
    else if("seller".equals(role)){
        user.setShopAddress(shop_address);
        user.setAccountNumber(acc_number);
        user.setAccountType(acc_type);
        user.setBankName(acc_bank_name);
        user.setBranchName(acc_bank_branch);
    }
    
    if(user.register(DBConnector.getConnection())){
        response.sendRedirect("registerForm.jsp?status=1");
    }
    else{
        response.sendRedirect("registerForm.jsp?status=0");
    }*/
    
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
