<%@include file="snippet/logout.jsp" %>
<%@page import="java.util.List"%>
<%@page import="entities.Prestamo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Préstamos</title>
	<%@include file="snippet/bootstrap_ini.jsp" %>
</head>
<body>

	<%@include file="snippet/nav_bar.jsp"%>

	<div class="d-flex align-items-center justify-content-center">
		<h1 style="text-transform: uppercase"><strong>Préstamos</strong></h1>

     <%@include file="snippet/search.jsp" %>
	</div>
	<br>
    <div class="container">

        <table class="table table-striped" id="tabla">
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Título</th>
                <th scope="col">Alumno</th>
                <th scope="col">Fecha Préstamo</th>
                <th scope="col">Fecha Devolución</th>        
                <th scope="col">Estado</th>
                <th scope="col">Acciones</th>
            </tr>
			<% for (Prestamo prestamo : (List<Prestamo>) request.getAttribute("prestamos")) { %>
            <tr id="fila">
                <th><%= prestamo.getIdPrestamo() %></th>
                <td><%= prestamo.getTitulo() %></td>
                <td><%= prestamo.getAlumno() %></td>
                <td><%= prestamo.getFecPrestamo() %></td>
                <td><%= prestamo.getFecDevolucion() %></td>
                <td><%= prestamo.getEstado() %></td>
                <td>
					<a class="btn btn-outline-success" href="PrestamoServlet?action=mostrar&id=<%= prestamo.getIdPrestamo() %>">Editar</a>
					<a class="btn btn-outline-danger" onclick="confirmarEliminacionPr('<%= prestamo.getIdPrestamo() %>')" href="#">Eliminar</a>
                </td>
            </tr>
            <%} %>
        </table>

        <div class="d-flex justify-content-center">
            <input class="btn btn-primary" type="button" value="Crear Prestamo" style="color: #fff; font-weight:600"
                onclick="window.location.href='registrarPrestamo.jsp'">
        </div>

    </div>

<%@include file="snippet/bootstrap_fin.jsp" %>
<%@include file="snippet/sa.jsp" %>
       
</body>

<script>
function filtrarTabla() {
    var filtro = document.getElementById("busqueda").value.toUpperCase();
    var filas = document.querySelectorAll("#tabla tr:not(:first-child)");

    filas.forEach(function(fila) {
        var columnas = fila.querySelectorAll("td, th");
        var mostrarFila = false;

        columnas.forEach(function(columna) {
            var columnaTexto = columna.textContent || columna.innerText;
            if (columnaTexto.toUpperCase().includes(filtro)) {
                mostrarFila = true;
                return; // Salir del bucle forEach interno
            }
        });
        fila.style.display = mostrarFila ? "" : "none";
    });
}
</script>



</html>