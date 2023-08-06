package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Real Estate faq/help</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./css/faq.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\" class=\"active\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#\">Properties</a></li>\r\n");
      out.write("            <li><a href=\"#\">Agents</a></li>\r\n");
      out.write("            <li><a href=\"#\">About</a></li>\r\n");
      out.write("            <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("  <header>\r\n");
      out.write("    <h1>Real Estate </h1>\r\n");
      out.write("  </header>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <main>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <section>\r\n");
      out.write("      <h2>Frequently Asked Questions</h2>\r\n");
      out.write("      <dl>\r\n");
      out.write("        <dt>Question 1<br>What is the difference between a real estate agent and a real estate broker?</dt>\r\n");
      out.write("        <dd>Answer:- <br>A real estate agent is licensed to represent buyers and sellers in real estate transactions. They work under a licensed real estate broker. A broker, on the other hand, \r\n");
      out.write("          has completed additional education and licensing requirements and can work independently or manage a real estate brokerage.</dd>\r\n");
      out.write("        <dt>Question 2<br>How do I find a reputable real estate agent?</dt>\r\n");
      out.write("        <dd>Answer:-<br>You can find a reputable real estate agent by asking for referrals from friends, family, or colleagues who have had positive experiences with agents in the past.\r\n");
      out.write("           You can also research agents online, read reviews, and interview multiple agents before making a decision.</dd>\r\n");
      out.write("        <dt>Question 2<br>What is the process of buying a home?</dt>\r\n");
      out.write("        <dd>Answer:- <br>The home-buying process typically involves the following steps:\r\n");
      out.write("          a. Determine your budget and get pre-approved for a mortgage.\r\n");
      out.write("          b. Engage a real estate agent to help you find suitable properties.\r\n");
      out.write("          c. Visit and evaluate properties, making offers on the ones you like.\r\n");
      out.write("          d. Negotiate the terms of the purchase, including price, contingencies, and closing dates.\r\n");
      out.write("          e. Conduct inspections and appraisals to assess the property's condition and value.\r\n");
      out.write("          f. Finalize the financing, secure homeowner's insurance, and complete any necessary paperwork.\r\n");
      out.write("          g. Attend the closing, where you'll sign the final documents and transfer ownership.</dd>\r\n");
      out.write("          <dt>Question 4<br>What is a down payment?</dt>.\r\n");
      out.write("          <dd>Answer:-<br>A down payment is the initial upfront payment made by a buyer toward the purchase price of a property. It is typically a percentage of the total purchase price, often ranging from 3% to 20% or more. \r\n");
      out.write("            The larger the down payment, the lower the mortgage amount and potentially the interest rate.</dd>\r\n");
      out.write("            <dt>Question 5<br>What are closing costs?</dt>\r\n");
      out.write("            <dd>Answer:-<br>Closing costs are the fees and expenses associated with finalizing a real estate transaction. They typically include costs such as loan origination fees, appraisal fees, title insurance, attorney fees, recording fees, and prepaid property taxes and insurance.\r\n");
      out.write("               Closing costs are typically paid by both the buyer and the seller and can range from 2% to 5% of the purchase price.</dd>\r\n");
      out.write("       \r\n");
      out.write("      </dl>\r\n");
      out.write("    </section>\r\n");
      out.write("    <section>\r\n");
      out.write("      <h2>Help &amp; Support</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("        <li><a href=\"terms.html\">Terms of Service</a></li>\r\n");
      out.write("        <li><a href=\"privacy policy.html\">Privacy Policy</a></li>\r\n");
      out.write("        <!-- Add more help/support links as needed -->\r\n");
      out.write("      </ul>\r\n");
      out.write("    </section>\r\n");
      out.write("  </div>\r\n");
      out.write("  </main>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h3>About Us</h3>\r\n");
      out.write("                    <p>Our main focus is the customer journey in day-to-day management and our services are tailored to\r\n");
      out.write("                        each client. We dedicate our special attention to unique needs and\r\n");
      out.write("                        requirements to help hundreds of clients realize their homeownership goals, business setup, and\r\n");
      out.write("                        return on investments.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h3>Quick Links</h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Properties</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Agents</a></li>\r\n");
      out.write("                        <li><a href=\"#\">About</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h3>Contact Us</h3>\r\n");
      out.write("                    <p>123 Main St, City</p>\r\n");
      out.write("                    <p>Email: uwu.realestate.com</p>\r\n");
      out.write("                    <p>Phone: (123) 456-7890</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
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
