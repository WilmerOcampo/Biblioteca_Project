/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.8
 * Generated at: 2023-06-30 05:19:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class editarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/snippet/sa.jsp", Long.valueOf(1688077919240L));
    _jspx_dependants.put("/snippet/bootstrap_fin.jsp", Long.valueOf(1686152148634L));
    _jspx_dependants.put("/snippet/bootstrap_ini.jsp", Long.valueOf(1686152102464L));
    _jspx_dependants.put("/snippet/logout.jsp", Long.valueOf(1688074240672L));
    _jspx_dependants.put("/snippet/nav_bar.jsp", Long.valueOf(1688075900685L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write('	');

		if(session.getAttribute("nombre")==null){
			response.sendRedirect("login.jsp");
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Editar Empleado</title>\r\n");
      out.write("    ");
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
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"EmpleadoServlet?listaEmpleados&action=listar\">Empleados</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"PrestamoServlet?listaPrestamos&action=listar\">Préstamos</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"AlumnoServlet?listaAlumnos&action=listar\">Alumnos</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"EditorialServlet?listaEditoriales&action=listar\">Editorial</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"CompraLibroServlet?listaCompras&action=listar\">Compras</a></li>\r\n");
      out.write("					<li class=\"nav-item\" style=\"margin: 0 0.5rem\"><a class=\"nav-link\" href=\"\">");
      out.write("</a></li>\r\n");
      out.write("				<form class=\"d-flex\"  action=\"LogoutServlet\">\r\n");
      out.write("					<button class=\"btn btn-danger d-none d-md-inline-block\" type=\"submit\" style=\"font-size: 20px; font-weight: 600\">Cerrar sesión</button>\r\n");
      out.write("				</form>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				<hr class=\"d-md-none text-white-50\">\r\n");
      out.write("\r\n");
      out.write("				<!--boton Informacion -->\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<br>\r\n");
      out.write("		<h1 class=\"text-center\" style=\"text-transform: uppercase;\"><strong>Editar Empleado</strong></h1>\r\n");
      out.write("		<br>\r\n");
      out.write("		<form method=\"get\" action=\"EmpleadoServlet\" style=\"margin: 0 12%\">\r\n");
      out.write("			<input type=\"hidden\" name=\"action\" value=\"actualizar\">\r\n");
      out.write("			<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.idEmpleado }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			<div class=\"row mb-3\">\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label for=\"id\" class=\"form-label\"><b>Id Empleado:</b></label> <input\r\n");
      out.write("						type=\"text\" class=\"form-control\" id=\"id\" name=\"id\" disabled\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.idEmpleado }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label for=\"nombre\" class=\"form-label\"><b>Nombre:</b></label> <input\r\n");
      out.write("						type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\"\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.nombre }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row mb-3\">\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label for=\"apellido\" class=\"form-label\"><b>Apellido:</b></label> <input\r\n");
      out.write("						type=\"text\" class=\"form-control\" id=\"apellido\" name=\"apellido\"\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.apellido }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label for=\"direccion\" class=\"form-label\"><b>Dirección:</b></label>\r\n");
      out.write("					<input type=\"text\" class=\"form-control\" id=\"direccion\"\r\n");
      out.write("						name=\"direccion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.direccion }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row mb-3\">\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label for=\"telefono\" class=\"form-label\"><b>Telefono:</b></label> <input\r\n");
      out.write("						type=\"number\" class=\"form-control\" id=\"telefono\" name=\"telefono\"\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.telefono }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label for=\"email\" class=\"form-label\"><b>Email:</b></label> <input\r\n");
      out.write("						type=\"email\" class=\"form-control\" id=\"email\" name=\"email\"\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.email }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row mb-3\">\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label for=\"dni\" class=\"form-label\"><b>DNI:</b></label> <input\r\n");
      out.write("						type=\"text\" class=\"form-control\" id=\"dni\" name=\"dni\"\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.dni }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label for=\"clave\" class=\"form-label\"><b>Contaseña:</b></label> <input\r\n");
      out.write("						type=\"password\" class=\"form-control\" id=\"clave\" name=\"clave\"\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empleado.pass }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-12 text-center\">\r\n");
      out.write("					<br>\r\n");
      out.write("					<input type=\"submit\" name=\"enviar\" id=\"enviar\" value=\"Editar Empleado\" class=\"btn btn-primary\" style=\"font-weight: 600\" onclick=\"return confirmarEdicion(event)\">\r\n");
      out.write("					<input type=\"reset\" name=\"borrar\" id=\"borrar\" value=\"Restablecer\" class=\"btn btn-secondary\" style=\"font-weight: 600\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
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
      out.write('\r');
      out.write('\n');
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.0.20/dist/sweetalert2.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.0.20/dist/sweetalert2.min.css\">\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	   function confirmarEdicion(event) {\r\n");
      out.write("	        event.preventDefault(); // Evitar que el formulario se envíe automáticamente\r\n");
      out.write("	        \r\n");
      out.write("	        Swal.fire({\r\n");
      out.write("	            title: '¿Estás seguro de que deseas guardar los cambios?',\r\n");
      out.write("	            icon: 'question',\r\n");
      out.write("	            showCancelButton: true,\r\n");
      out.write("	            confirmButtonText: 'Sí',\r\n");
      out.write("	            cancelButtonText: 'No'\r\n");
      out.write("	        }).then((result) => {\r\n");
      out.write("	            if (result.isConfirmed) {\r\n");
      out.write("	                // Si se confirma, enviar el formulario\r\n");
      out.write("	                document.getElementById('enviar').disabled = true; // Deshabilitar el botón para evitar múltiples envíos\r\n");
      out.write("	                document.getElementById('enviar').form.submit();\r\n");
      out.write("	            }\r\n");
      out.write("	        });\r\n");
      out.write("	    }\r\n");
      out.write("	   function confirmarEliminacionAl(id) {\r\n");
      out.write("	        Swal.fire({\r\n");
      out.write("	            title: \"¿Estás seguro?\",\r\n");
      out.write("	            text: \"No podrás revertir esto\",\r\n");
      out.write("	            icon: \"warning\",\r\n");
      out.write("	            showCancelButton: true,\r\n");
      out.write("	            confirmButtonColor: \"#3085d6\",\r\n");
      out.write("	            cancelButtonColor: \"#d33\",\r\n");
      out.write("	            confirmButtonText: \"Sí, eliminarlo\"\r\n");
      out.write("	        }).then((result) => {\r\n");
      out.write("	            if (result.isConfirmed) {\r\n");
      out.write("	                window.location.href = \"AlumnoServlet?action=eliminar&id=\" + id;\r\n");
      out.write("	            }\r\n");
      out.write("	        });\r\n");
      out.write("	    }\r\n");
      out.write("	   function confirmarEliminacionCo(id) {\r\n");
      out.write("	        Swal.fire({\r\n");
      out.write("	            title: \"¿Estás seguro?\",\r\n");
      out.write("	            text: \"No podrás revertir esto\",\r\n");
      out.write("	            icon: \"warning\",\r\n");
      out.write("	            showCancelButton: true,\r\n");
      out.write("	            confirmButtonColor: \"#3085d6\",\r\n");
      out.write("	            cancelButtonColor: \"#d33\",\r\n");
      out.write("	            confirmButtonText: \"Sí, eliminarlo\"\r\n");
      out.write("	        }).then((result) => {\r\n");
      out.write("	            if (result.isConfirmed) {\r\n");
      out.write("	                window.location.href = \"CompraLibroServlet?action=eliminar&id=\" + id;\r\n");
      out.write("	            }\r\n");
      out.write("	        });\r\n");
      out.write("	    }\r\n");
      out.write("	   function confirmarEliminacionEd(id) {\r\n");
      out.write("	        Swal.fire({\r\n");
      out.write("	            title: \"¿Estás seguro?\",\r\n");
      out.write("	            text: \"No podrás revertir esto\",\r\n");
      out.write("	            icon: \"warning\",\r\n");
      out.write("	            showCancelButton: true,\r\n");
      out.write("	            confirmButtonColor: \"#3085d6\",\r\n");
      out.write("	            cancelButtonColor: \"#d33\",\r\n");
      out.write("	            confirmButtonText: \"Sí, eliminarlo\"\r\n");
      out.write("	        }).then((result) => {\r\n");
      out.write("	            if (result.isConfirmed) {\r\n");
      out.write("	                window.location.href = \"EditorialServlet?action=eliminar&id=\" + id;\r\n");
      out.write("	            }\r\n");
      out.write("	        });\r\n");
      out.write("	    }\r\n");
      out.write("	   function confirmarEliminacionEm(id) {\r\n");
      out.write("	        Swal.fire({\r\n");
      out.write("	            title: \"¿Estás seguro?\",\r\n");
      out.write("	            text: \"No podrás revertir esto\",\r\n");
      out.write("	            icon: \"warning\",\r\n");
      out.write("	            showCancelButton: true,\r\n");
      out.write("	            confirmButtonColor: \"#3085d6\",\r\n");
      out.write("	            cancelButtonColor: \"#d33\",\r\n");
      out.write("	            confirmButtonText: \"Sí, eliminarlo\"\r\n");
      out.write("	        }).then((result) => {\r\n");
      out.write("	            if (result.isConfirmed) {\r\n");
      out.write("	                window.location.href = \"EmpleadoServlet?action=eliminar&id=\" + id;\r\n");
      out.write("	            }\r\n");
      out.write("	        });\r\n");
      out.write("	    }\r\n");
      out.write("	   function confirmarEliminacionLi(id) {\r\n");
      out.write("	        Swal.fire({\r\n");
      out.write("	            title: \"¿Estás seguro?\",\r\n");
      out.write("	            text: \"No podrás revertir esto\",\r\n");
      out.write("	            icon: \"warning\",\r\n");
      out.write("	            showCancelButton: true,\r\n");
      out.write("	            confirmButtonColor: \"#3085d6\",\r\n");
      out.write("	            cancelButtonColor: \"#d33\",\r\n");
      out.write("	            confirmButtonText: \"Sí, eliminarlo\"\r\n");
      out.write("	        }).then((result) => {\r\n");
      out.write("	            if (result.isConfirmed) {\r\n");
      out.write("	                window.location.href = \"LibroServlet?action=eliminar&id=\" + id;\r\n");
      out.write("	            }\r\n");
      out.write("	        });\r\n");
      out.write("	    }\r\n");
      out.write("	   function confirmarEliminacionPr(id) {\r\n");
      out.write("	        Swal.fire({\r\n");
      out.write("	            title: \"¿Estás seguro?\",\r\n");
      out.write("	            text: \"No podrás revertir esto\",\r\n");
      out.write("	            icon: \"warning\",\r\n");
      out.write("	            showCancelButton: true,\r\n");
      out.write("	            confirmButtonColor: \"#3085d6\",\r\n");
      out.write("	            cancelButtonColor: \"#d33\",\r\n");
      out.write("	            confirmButtonText: \"Sí, eliminarlo\"\r\n");
      out.write("	        }).then((result) => {\r\n");
      out.write("	            if (result.isConfirmed) {\r\n");
      out.write("	                window.location.href = \"PrestamoServlet?action=eliminar&id=\" + id;\r\n");
      out.write("	            }\r\n");
      out.write("	        });\r\n");
      out.write("	   }\r\n");
      out.write("</script>");
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
