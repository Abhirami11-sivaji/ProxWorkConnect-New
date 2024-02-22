package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/SessionValidator.jsp");
    _jspx_dependants.add("/Admin/Head.jsp");
  }

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

        response.setHeader("Cache-Control", "no-cache, no-store");
        if(session.getAttribute("aid") == null)
        {
            response.sendRedirect("../Guest/Login.jsp");
        }
    
      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <title>Admin</title>\n");
      out.write("\n");
      out.write("        <!-- <link rel=\"icon\" href=\"../Template/Admin/img/favicon.png\" type=\"image/png\"> -->\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/css/bootstrap.min.css\" />\n");
      out.write("        <!-- themefy CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/themefy_icon/themify-icons.css\" />\n");
      out.write("        <!-- swiper slider CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/swiper_slider/css/swiper.min.css\" />\n");
      out.write("        <!-- select2 CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/select2/css/select2.min.css\" />\n");
      out.write("        <!-- select2 CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/niceselect/css/nice-select.css\" />\n");
      out.write("        <!-- owl carousel CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/owl_carousel/css/owl.carousel.css\" />\n");
      out.write("        <!-- gijgo css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/gijgo/gijgo.min.css\" />\n");
      out.write("        <!-- font awesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/font_awesome/css/all.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/tagsinput/tagsinput.css\" />\n");
      out.write("        <!-- datatable CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/datatable/css/jquery.dataTables.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/datatable/css/responsive.dataTables.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/datatable/css/buttons.dataTables.min.css\" />\n");
      out.write("        <!-- text editor css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/text_editor/summernote-bs4.css\" />\n");
      out.write("        <!-- morris css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/morris/morris.css\">\n");
      out.write("        <!-- metarial icon css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/material_icon/material-icons.css\" />\n");
      out.write("\n");
      out.write("        <!-- menu css  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/css/metisMenu.css\">\n");
      out.write("        <!-- style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/css/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/css/colors/default.css\" id=\"colorSkinCSS\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"crm_body_bg\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- main content part here -->\n");
      out.write("\n");
      out.write("        <!-- sidebar  -->\n");
      out.write("        <!-- sidebar part here -->\n");
      out.write("        <nav class=\"sidebar\">\n");
      out.write("            <div class=\"logo d-flex justify-content-between\">\n");
      out.write("                <a href=\"HomePage.jsp\"><h2 align=\"center\">Welcome<br>Admin<br>");
      out.print(session.getAttribute("adminname"));
      out.write("</h2></a>\n");
      out.write("                <div class=\"sidebar_close_icon d-lg-none\">\n");
      out.write("                    <i class=\"ti-close\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <ul id=\"sidebar_menu\">\n");
      out.write("                <li class=\"side_menu_title\">\n");
      out.write("                    <span>Dashboard</span>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mm-active\">\n");
      out.write("                    <a  href=\"HomePage.jsp\"  aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/1.svg\" alt=\"\">\n");
      out.write("                        <span>Dashboard</span>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li class=\"side_menu_title\">\n");
      out.write("                    <span>Applications</span>\n");
      out.write("                </li><li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"UserList.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>User List</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"LabourList.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Labour List</span>\n");
      out.write("                    </a> </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"District.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>District</span>\n");
      out.write("                    </a></li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"Taluk.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Taluk</span>\n");
      out.write("                    </a>\t\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"Town.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Town</span>\n");
      out.write("                    </a>\t\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"ComplaintType.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Comlaint Type</span>\n");
      out.write("                    </a>\t\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"WorkType.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Work Type</span>\n");
      out.write("                    </a>\t\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"ViewComplaint.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Complaints</span>\n");
      out.write("                    </a>\t\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"ViewFeedback.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Feedbacks</span>\n");
      out.write("                    </a>\t\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"../logout.jsp\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Logout</span>\n");
      out.write("                    </a>\t\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"main_content dashboard_part\">\n");
      out.write("    <!-- menu  -->\n");
      out.write("\n");
      out.write("    <!--/ menu  -->\n");
      out.write("    <div class=\"main_content_iner \">\n");
      out.write("        <div class=\"container-fluid p-0\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"single_element\">\n");
      out.write("                        <div class=\"quick_activity\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"quick_activity_wrap\">\n");
      out.write("                                        <div class=\"single_quick_activity d-flex\">\n");
      out.write("                                            <div class=\"icon\">\n");
      out.write("                                                <img src=\"../Template/Admin/img/icon/labour.png\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"count_content\">\n");
      out.write("                                                <h3><span class=\"counter\">\n");
      out.write("                                                        ");
                                                            String sel = "select count(labour_id) as id from tbl_labour";
                                                            ResultSet rs = con.selectCommand(sel);
                                                            rs.next();
                                                            out.println(rs.getString("id"));
                                                        
      out.write("\n");
      out.write("                                                    </span> </h3>\n");
      out.write("                                                <p>Labour</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single_quick_activity d-flex\">\n");
      out.write("                                            <div class=\"icon\">\n");
      out.write("                                                <img src=\"../Template/Admin/img/icon/user.png\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"count_content\">\n");
      out.write("                                                <h3><span class=\"counter\">\n");
      out.write("                                                        ");

                                                            String sel1 = "select count(user_id) as id from tbl_user";
                                                            ResultSet rs1 = con.selectCommand(sel1);
                                                            rs1.next();
                                                            out.println(rs1.getString("id"));
                                                        
      out.write("\n");
      out.write("                                                    </span> </h3>\n");
      out.write("                                                <p>User</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single_quick_activity d-flex\">\n");
      out.write("                                            <div class=\"icon\">\n");
      out.write("                                                <img src=\"../Template/Admin/img/icon/post.png\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"count_content\">\n");
      out.write("                                                <h3><span class=\"counter\">\n");
      out.write("                                                        ");

                                                            String sel2 = "select count(workpost_id) as id from tbl_workpost";
                                                            ResultSet rs2 = con.selectCommand(sel2);
                                                            rs2.next();
                                                            out.println(rs2.getString("id"));
                                                        
      out.write("\n");
      out.write("                                                    </span> </h3>\n");
      out.write("                                                <p>Posts</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single_quick_activity d-flex\">\n");
      out.write("                                            <div class=\"icon\">\n");
      out.write("                                                <img src=\"../Template/Admin/img/icon/request.png\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"count_content\">\n");
      out.write("                                                <h3><span class=\"counter\">\n");
      out.write("                                                        ");

                                                            String sel3 = "select count(workrequest_id) as id from tbl_workrequest";
                                                            ResultSet rs3 = con.selectCommand(sel3);
                                                            rs3.next();
                                                            out.println(rs3.getString("id"));
                                                        
      out.write("\n");
      out.write("                                                    </span> </h3>\n");
      out.write("                                                <p>Requests</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-12\">\n");
      out.write("                    <div class=\"white_box card_height_100\">\n");
      out.write("                        <div class=\"box_header border_bottom_1px  \">\n");
      out.write("                            <div class=\"main-title\">\n");
      out.write("                                <h3 class=\"mb_25\">Labour</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"staf_list_wrapper sraf_active owl-carousel\">\n");
      out.write("                            ");

                                String selZ = "select * from tbl_labour";
                                ResultSet rsZ = con.selectCommand(selZ);
                                while (rsZ.next()) {
                            
      out.write("\n");
      out.write("                            <!-- single carousel  -->\n");
      out.write("                            <div class=\"single_staf\">\n");
      out.write("                                <div class=\"staf_thumb\">\n");
      out.write("                                    <img src=\"../Assets/LabourPhoto/");
      out.print(rsZ.getString("labour_photo"));
      out.write("\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <h4>");
      out.print(rsZ.getString("labour_name"));
      out.write("</h4>\n");
      out.write("                                <p>");
      out.print(rsZ.getString("labour_contact"));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-12\">\n");
      out.write("                    <div class=\"white_box card_height_100\">\n");
      out.write("                        <div class=\"box_header border_bottom_1px  \">\n");
      out.write("                            <div class=\"main-title\">\n");
      out.write("                                <h3 class=\"mb_25\">User</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"staf_list_wrapper sraf_active owl-carousel\">\n");
      out.write("                            ");

                                String selU = "select * from tbl_user";
                                ResultSet rsU = con.selectCommand(selU);
                                while (rsU.next()) {
                            
      out.write("\n");
      out.write("                            <!-- single carousel  -->\n");
      out.write("                            <div class=\"single_staf\">\n");
      out.write("                                <div class=\"staf_thumb\">\n");
      out.write("                                    <img src=\"../Assets/UserPhoto/");
      out.print(rsU.getString("user_photo"));
      out.write("\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <h4>");
      out.print(rsU.getString("user_name"));
      out.write("</h4>\n");
      out.write("                                <p>");
      out.print(rsU.getString("user_contact"));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("<!-- main content part end -->\n");
      out.write("\n");
      out.write("<!-- footer  -->\n");
      out.write("<!-- jquery slim -->\n");
      out.write("<script src=\"../Template/Admin/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("<!-- popper js -->\n");
      out.write("<script src=\"../Template/Admin/js/popper.min.js\"></script>\n");
      out.write("<!-- bootstarp js -->\n");
      out.write("<script src=\"../Template/Admin/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- sidebar menu  -->\n");
      out.write("<script src=\"../Template/Admin/js/metisMenu.js\"></script>\n");
      out.write("<!-- waypoints js -->\n");
      out.write("<script src=\"../Template/Admin/vendors/count_up/jquery.waypoints.min.js\"></script>\n");
      out.write("<!-- waypoints js -->\n");
      out.write("<script src=\"../Template/Admin/vendors/chartlist/Chart.min.js\"></script>\n");
      out.write("<!-- counterup js -->\n");
      out.write("<script src=\"../Template/Admin/vendors/count_up/jquery.counterup.min.js\"></script>\n");
      out.write("<!-- swiper slider js -->\n");
      out.write("<script src=\"../Template/Admin/vendors/swiper_slider/js/swiper.min.js\"></script>\n");
      out.write("<!-- nice select -->\n");
      out.write("<script src=\"../Template/Admin/vendors/niceselect/js/jquery.nice-select.min.js\"></script>\n");
      out.write("<!-- owl carousel -->\n");
      out.write("<script src=\"../Template/Admin/vendors/owl_carousel/js/owl.carousel.min.js\"></script>\n");
      out.write("<!-- gijgo css -->\n");
      out.write("<script src=\"../Template/Admin/vendors/gijgo/gijgo.min.js\"></script>\n");
      out.write("<!-- responsive table -->\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/dataTables.responsive.min.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/dataTables.buttons.min.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/buttons.flash.min.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/jszip.min.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/pdfmake.min.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/vfs_fonts.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/buttons.html5.min.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/datatable/js/buttons.print.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"../Template/Admin/js/chart.min.js\"></script>\n");
      out.write("<!-- progressbar js -->\n");
      out.write("<script src=\"../Template/Admin/vendors/progressbar/jquery.barfiller.js\"></script>\n");
      out.write("<!-- tag input -->\n");
      out.write("<script src=\"../Template/Admin/vendors/tagsinput/tagsinput.js\"></script>\n");
      out.write("<!-- text editor js -->\n");
      out.write("<script src=\"../Template/Admin/vendors/text_editor/summernote-bs4.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"../Template/Admin/vendors/apex_chart/apexcharts.js\"></script>\n");
      out.write("\n");
      out.write("<!-- custom js -->\n");
      out.write("<script src=\"../Template/Admin/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"../Template/Admin/vendors/apex_chart/bar_active_1.js\"></script>\n");
      out.write("<script src=\"../Template/Admin/vendors/apex_chart/apex_chart_list.js\"></script>\n");
      out.write("</body>\n");
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
