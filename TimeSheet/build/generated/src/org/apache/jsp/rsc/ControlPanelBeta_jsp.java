package org.apache.jsp.rsc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ControlPanelBeta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"autor\"        Content=\"Jose Angel Bonfil\">\n");
      out.write("        <meta name=\"copyright\"    Content=\"(c) 2011\">\n");
      out.write("        <title>Control Panel (Beta)   |   Hoja de apuntes</title>\n");
      out.write("\n");
      out.write("        <!--Styles-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"/TimeSheet/SvAgenda\" method=\"POST\">\n");
      out.write("            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("            <div id=\"cargando\" style=\"display:none; color: green;\">Cargando...</div>\n");
      out.write("            <hr>\n");
      out.write("            <center> <!--Menu-->\n");
      out.write("                <br>\n");
      out.write("                <table width=\"100%\" border=\"0\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"70%\"></td>\n");
      out.write("                        <td width=\"10%\" align=\"right\"><a href=\"/TimeSheet/SvAgenda?link=inicio\" id=\"enlaceAjax\">Inicio</a></td>\n");
      out.write("                        <td width=\"10%\" align=\"center\">| <a href=\"/TimeSheet/SvAgenda?link=nueva\">Nueva nota</a> |</td>\n");
      out.write("                        <td width=\"10%\" align=\"left\"><a href=\"/TimeSheet/SvAgenda?link=salir&sesion=cerrar\">Salir</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <div id=\"ControlPanel\">\n");
      out.write("                    <h2>Tus notas</h2>\n");
      out.write("\n");
      out.write("                    <table width=\"100%\" border=\"0\"><!--Entradas-->\n");
      out.write("                        <tr>\n");
      out.write("                            <th width=\"70%\">Titulo</th>\n");
      out.write("                            <th width=\"30%\">Fecha</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Entrada del primer dia de actividades</td>\n");
      out.write("                            <td align=\"center\">31/01/2011</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table><!--//Entradas-->\n");
      out.write("                </div>\n");
      out.write("            </center><!--//Menu-->\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
