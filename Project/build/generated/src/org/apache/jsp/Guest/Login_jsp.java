package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');


    if (request.getParameter("btn_submit") != null) {
        String username = request.getParameter("txt_username");
        String password = request.getParameter("txt_password");

        String selU = "select * from tbl_user where user_email='" + username + "' and user_password='" + password + "'";
        ResultSet rsU = con.selectCommand(selU);

        String selE = "select * from tbl_labour where labour_email='" + username + "' and labour_password='" + password + "'";
        ResultSet rsE = con.selectCommand(selE);

        String selA = "select * from tbl_admin where admin_uname='" + username + "' and admin_password='" + password + "'";
        ResultSet rsA = con.selectCommand(selA);

        if (rsU.next()) {
            if (rsU.getString("user_status").equals("1")) {
                out.println("<script>alert('Sorry Your Account Disabled')</script>");
            } else if (rsU.getString("user_status").equals("0")) {
                session.setAttribute("userid", rsU.getString("user_id"));
                session.setAttribute("username", rsU.getString("user_name"));
                response.sendRedirect("../User/HomePage.jsp");
            }
        } else if (rsE.next()) {

            if (rsE.getString("labour_status").equals("0")) {
                out.println("<script>alert('Verification Under Proccessing')</script>");
            } else if (rsE.getString("labour_status").equals("2")) {
                out.println("<script>alert('Sorry Your Account Disabled')</script>");
            } else if (rsE.getString("labour_status").equals("1")) {
                session.setAttribute("labourid", rsE.getString("labour_id"));
                session.setAttribute("labourname", rsE.getString("labour_name"));
                response.sendRedirect("../Labour/HomePage.jsp");
            }

        } else if (rsA.next()) {
            session.setAttribute("adminname", rsA.getString("admin_name"));
            session.setAttribute("aid", rsA.getString("admin_id"));
            response.sendRedirect("../Admin/HomePage.jsp");
        } else {
            out.println("<script>alert('Invalid E-mail or Password')</script>");
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login Form</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../Template/Login/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-6 d-none d-md-block image-container\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-6 col-md-6 form-container\">\n");
      out.write("                    <div class=\"col-lg-8 col-md-12 col-sm-9 col-xs-12 form-box text-center\">\n");
      out.write("                        <div class=\"logo mb-3\">\n");
      out.write("                            <h1>WORKDAY</h1>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"heading mb-4\">\n");
      out.write("                            <h4>Login into your account</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <form method=\"post\" autocomplete=\"off\">\n");
      out.write("                            <div class=\"form-input\">\n");
      out.write("                                <span><i class=\"fa fa-envelope\"></i></span>\n");
      out.write("                                <input type=\"email\" name=\"txt_username\"  placeholder=\"Email Address\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-input\">\n");
      out.write("                                <span><i class=\"fa fa-lock\"></i></span>\n");
      out.write("                                <input type=\"password\" name=\"txt_password\" title=\"Minimum eight characters, at least one letter and one number\" pattern=\"^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$\"  placeholder=\"Password\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mb-3\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-left mb-3\">\n");
      out.write("                                <button type=\"submit\" name=\"btn_submit\"  class=\"btn\">Login</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-center mb-2\">\n");
      out.write("\n");
      out.write("                                <div style=\"color: #777\">Don't have an account\n");
      out.write("                                    <a href=\"../index.jsp\" class=\"register-link\">Back To Home</a>\n");
      out.write("                                </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
