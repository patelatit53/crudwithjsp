package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("\t\t<title>Edit</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t");

	String values = request.getParameter("values");
	String split[] =values.split("~");
	String userid = split[0];
	String email =split[1];
	String department = split[2];
	String phone = split[3];
	
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"panel-primary\">\n");
      out.write("\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t<h3 class=\"panel-title\">Edit</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t<form action=\"update.jsp\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label\" for=UserID>USER ID</label>\n");
      out.write("\t\t\t\t\tUSER NAME CANNOT BE MODIFIED\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"UserID\" class=\"form-control\" name=\"UserID\" placeholder=\"ENTER YOUR USERID\" readonly required=\"required\" value=\"");
      out.print(userid);
      out.write("\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t<label for=\"email\" class=\"control-label\">EMAIL ID</label>\n");
      out.write("\t\t\t\t\t<input type=\"email\" id=\"email\" value =\"");
      out.print(email);
      out.write("\"class=\"form-control\" name=\"email\" placeholder=\"ENTER YOUR EMAIL\" required=\"required\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t<label for=\"department\" class=\"control-label\">DEPARTMENT</label>\n");
      out.write("\t\t\t\t\t<select id=\"department\" required=\"required\" class=\"form-control\" name=\"department\">\n");
      out.write("\t\t\t\t\t\t<option value=\"\">Select</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"MARKETING\">MARKETING</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"TESTING\">TESTING</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"DEVELOPMENT\">DEVELOPMENT</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"TRAINING\">TRAINING</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t<label for=\"phone\" class=\"control-label\">PHONE</label>\n");
      out.write("\t\t\t\t\t<input type=\"tel\" id=\"phone\" class=\"form-control\" name=\"phone\" placeholder=\"ENTER YOUR PHONE\" value =\"");
      out.print(phone );
      out.write("\" required=\"required\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-success\">UPDATE</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
