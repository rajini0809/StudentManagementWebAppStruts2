package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=updatedetails method=\"post\">\n");
      out.write("\t\t<pre>\n");
      out.write("<b>First Name:         </b><input type=\"text\" name=\"firstname\" value='<s:property value=\"firstname\"/>'>\n");
      out.write("<b>Last Name:         </b><input type=\"text\" name=\"lastname\" value='<s:property value=\"lastname\"/>'>\t\t\n");
      out.write("\t\t\n");
      out.write("<b>Email:        </b><input type=\"email\"  name=\"email\" value='<s:property value=\"email\"/>'>\n");
      out.write("\t\t            <input type=\"hidden\" name=\"uemailhidden\" value='<s:property value=\"email\"/>'>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("<b>Course  </b><input type=\"text\" name=\"course\" value='<s:property value=\"course\"/>'>\n");
      out.write("\t\t\n");
      out.write("\t\t<button name=\"submitType\" value=\"update\" type=\"submit\">Update</button>\n");
      out.write("\t\t</pre>\n");
      out.write("\t</form>\n");
      out.write("\t<s:if test=\"ctr>0\">\n");
      out.write("\t\t<span style=\"color: red;\"><s:property value=\"msg\" /></span>\n");
      out.write("\t</s:if>\n");
      out.write("\t<s:else>\n");
      out.write("\t\t<span style=\"color: red;\"><s:property value=\"msg\" /></span>\n");
      out.write("\t</s:else>\n");
      out.write("    </body>\n");
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
