/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.8
 * Generated at: 2023-06-08 03:48:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import util.MySQLConexion;
import java.sql.Connection;
import entities.Libro;
import entities.Editorial;
import java.util.List;

public final class registrarLibro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/snippet/bootstrap_fin.jsp", Long.valueOf(1686152148634L));
    _jspx_dependants.put("/snippet/bootstrap_ini.jsp", Long.valueOf(1686152102464L));
    _jspx_dependants.put("/snippet/nav_bar.jsp", Long.valueOf(1686155934878L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("entities.Libro");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("entities.Editorial");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("util.MySQLConexion");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Registrar Editorial</title>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Bootstrap Ini</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("          integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Nav Bar</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("          integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-light\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Inicio del menu -->\r\n");
      out.write("	<nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("			<!-- icono o nombre -->\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"#\"\r\n");
      out.write("				style=\"padding-left: 3rem; padding-right: 3rem;\"> <i\r\n");
      out.write("				class=\"bi bi-book\" style=\"font-size: 2rem; color: #bbb\"></i> <span\r\n");
      out.write("				style=\"font-size: 2rem; color: #bbb\"><b>CiberBiblioteca</b></span>\r\n");
      out.write("			</a>\r\n");
      out.write("\r\n");
      out.write("			<!-- boton del menu -->\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#menu\"\r\n");
      out.write("				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("\r\n");
      out.write("			<!-- elementos del menu colapsable -->\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"menu\">\r\n");
      out.write("				<ul class=\"navbar-nav me-auto\" style=\"font-size: 20px\">\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"LibroServlet?listaLibros&action=listar\">Libros</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"listaEmpleados.jsp\">Empleados</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"listaPrestamos.jsp\">Préstamos</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"AlumnoServlet?listaAlumnos&action=listar\">Alumnos</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"listaEditorial.jsp\">Editorial</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"listaCompras.jsp\">Compras</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				<hr class=\"d-md-none text-white-50\">\r\n");
      out.write("\r\n");
      out.write("				<!--boton Informacion -->\r\n");
      out.write("				<form class=\"d-flex\">\r\n");
      out.write("					<button class=\"btn btn-danger d-none d-md-inline-block \"\r\n");
      out.write("						type=\"submit\" style=\"font-size: 20px; font-weight: 600\">\r\n");
      out.write("						<a href=\"login.jsp\" style=\"text-decoration: none; color: #fff\">Cerrar Sesion</a>\r\n");
      out.write("					</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <h1 class=\"text-center\" style=\"text-transform: uppercase;\"><strong>Registrar Libro</strong></h1><br>\r\n");
      out.write("        <form style=\"margin: 0 12%\" method=\"get\" action=\"LibroServlet\">\r\n");
      out.write("        	<input type=\"hidden\" name=\"action\" value=\"agregar\">\r\n");
      out.write("            <div class=\"row mb-3\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <label for=\"id\" class=\"form-label\"><b>Id Libro:</b></label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"id\" name=\"id\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <label for=\"titulo\" class=\"form-label\"><b>Titulo:</b></label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"titulo\" name=\"titulo\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row mb-3\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <label for=\"autor\" class=\"form-label\"><b>Autor:</b></label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"autor\" name=\"autor\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <label for=\"idEditorial\" class=\"form-label\"><b>Editorial:</b></label>\r\n");
      out.write("				    <select class=\"form-select\" id=\"idEditorial\" name=\"idEditorial\">\r\n");
      out.write("				        <!-- option value=\"0\" disabled>Seleccione editorial</option-->\r\n");
      out.write("				        ");
 try {
				            Connection connection = MySQLConexion.getConexion();
				            String sql = "SELECT * FROM editorial";
				            Statement statement = connection.createStatement();
				            ResultSet resultSet = statement.executeQuery(sql);
				            while (resultSet.next()) { 
      out.write("\r\n");
      out.write("				                <option value=\"");
      out.print( resultSet.getString("idEditorial") );
      out.write('"');
      out.write('>');
      out.print( resultSet.getString("nombre") );
      out.write("</option>\r\n");
      out.write("				            ");
 }
				        } catch (Exception e) {
				            e.printStackTrace();
				        } 
      out.write("\r\n");
      out.write("				    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row mb-3\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <label for=\"stock\" class=\"form-label\"><b>Stock:</b></label>\r\n");
      out.write("                    <input type=\"number\" class=\"form-control\" id=\"stock\" name=\"stock\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <label for=\"estado\" class=\"form-label\"><b>Estado:</b></label>\r\n");
      out.write("                    <select class=\"form-select\" id=\"estado\" name=\"estado\">\r\n");
      out.write("                    <!--option value=\"selecione\" disabled=\"disabled\" >Seleccione</option-->\r\n");
      out.write("                        <option value=\"Disponible\" id=\"Disponible\" name=\"Disponible\" selected >Disponible</option>\r\n");
      out.write("                        <option value=\"Agotado\" id=\"Agotado\" name=\"Agotado\">Agotado</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12 text-center\">\r\n");
      out.write("                    <br><input type=\"submit\" name=\"enviar\" id=\"enviar\" value=\"Registrar Libro\"\r\n");
      out.write("                        class=\"btn btn-primary\" style=\"font-weight: 600\">\r\n");
      out.write("                    <input type=\"reset\" name=\"borrar\" id=\"borrar\" value=\"Restablecer\"\r\n");
      out.write("                        class=\"btn btn-secondary\" style=\"font-weight: 600\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Bootstrap Fin</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
