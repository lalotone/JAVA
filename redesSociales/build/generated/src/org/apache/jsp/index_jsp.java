package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>REDES SOCIALES</title>\n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        <h1>REDES SOCIALES</h1>\n");
      out.write("     \n");
      out.write("        <ul id=\"typo\">\n");
      out.write("            <li id=\"Google\"><a href=\"https://www.google.com\" title=\"Google\"><img border=0 src=\"google.png\" >Google</a></li>\n");
      out.write("            <li id=\"Twitter\"><a href=\"https://www.twitter.com\" title=\"Twitter\"><img border=0 src=\"twitter.png\" >Twitter</a></li>\n");
      out.write("            <li id=\"Facebook\"><a href=\"https://www.facebook.com\" title=\"Facebook\"><img border=0 src=\"facebook.png\" >Facebook</a></li>\n");
      out.write("            <li id=\"Linkedin\"><a href=\"https://www.linkedin.com\" title=\"Linkedin\"><img border=0 src=\"linkedin.png\" >Linkedin</a></li>\n");
      out.write("            <li id=\"Blogger\"><a href=\"https://www.blogger.com\" title=\"Blogger\"><img border=0 src=\"blogger.png\" >Blogger</a></li>\n");
      out.write("            <li id=\"GoogleP\"><a href=\"https://plus.google.com/\" title=\"GoogleP\"><img border=0 src=\"googleP.png\" >GoogleP</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
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
