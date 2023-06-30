<%@include file="snippet/logout.jsp" %>
<%@page import="models.EditorialModel"%>
<%@page import="models.EmpleadoModel"%>
<%@page import="models.LibroModel"%>
<%@page import="entities.Libro"%>
<%@page import="entities.Editorial"%>
<%@page import="entities.Empleado"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Compra</title>
    <%@include file="snippet/bootstrap_ini.jsp" %>
</head>
<body>

    <%@ include file="snippet/nav_bar.jsp"%>
    
    <div class="container">
        <br>
        <h1 class="text-center" style="text-transform: uppercase;"><strong>Editar Compra</strong></h1><br>
        <form style="margin: 0 12%" method="get" action="CompraLibroServlet">
            <input type="hidden" name="action" value="actualizar">
            <input type="hidden" name="id" value="${ compra.idCompra }">
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="id" class="form-label"><b>Id Compra:</b></label>
                    <input type="text" class="form-control" id="id" name="id" disabled value="${ compra.idCompra }" >         
                </div>
                <div class="col-md-6">
                    <label for="libro" class="form-label"><b>Libro:</b></label>
					<select class="form-select" id="libro" name="libro">
					    <option value="${compra.idLibro }" > ${ compra.libro }</option>
					    <% List<Libro> opcionesLibro = LibroModel.obtenerOpcionesLibro();
					    for (Libro opcion : opcionesLibro) { %>
					        <option value="<%= opcion.getIdLibro() %>"><%= opcion.getTitulo() %></option>
					    <% } %>
					</select>
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="editorial" class="form-label"><b>Editorial:</b></label>
                    <select class="form-select" id="editorial" name="editorial">
					    <option value="${compra.idEditorial }" > ${ compra.editorial }</option>
					    <% List<Editorial> opcionesEditorial = EditorialModel.obtenerOpcionesEditorial();
					    for (Editorial opcion : opcionesEditorial) { %>
					        <option value="<%= opcion.getIdEditorial() %>"><%= opcion.getNombre() %></option>
					    <% } %>
					</select>
                </div>
                <div class="col-md-6">
                    <label for="idEmpleado" class="form-label"><b>Empleado:</b></label>
					<select class="form-select" id="empleado" name="empleado">
					    <option value="${compra.idEmpleado }" > ${ compra.empleado }</option>
					    <% List<Empleado> opcionesEmpleado = EmpleadoModel.obtenerOpcionesEmpleado();
					    for (Empleado opcion : opcionesEmpleado) { %>
					        <option value="<%= opcion.getIdEmpleado() %>"><%= opcion.getNombre() %></option>
					    <% } %>
					</select>
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="fecha" class="form-label"><b>Fecha:</b></label>
                    <input type="date" class="form-control" id="fecha" name="fecha" value="${ compra.fecCompra }">
                </div>
                <div class="col-md-6">
                    <label for="cantidad" class="form-label"><b>Cantidad:</b></label>
                    <input type="number" class="form-control" id="cantidad" name="cantidad" value="${ compra.cantidad }">
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="precio" class="form-label"><b>Precio:</b></label>
                    <input type="number" step="0.01" class="form-control" id="precio" name="precio" value="${ compra.precio }">
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-12">
                    <input type="submit" name="enviar" id="enviar" class="btn btn-primary" value="Guardar" onclick="return confirmarEdicion(event)">
                    <a href="" class="btn btn-secondary">Cancelar</a>
                </div>
            </div>
        </form>
    </div>

    <%@include file="snippet/bootstrap_fin.jsp" %>
	<%@include file="snippet/sa.jsp" %>

</body>
</html>