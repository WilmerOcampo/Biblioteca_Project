<%@include file="snippet/logout.jsp"%>
<%@page import="entities.Alumno"%>
<%@page import="models.AlumnoModel"%>
<%@page import="models.LibroModel"%>
<%@page import="entities.Libro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Prestamo</title>
	<%@include file="snippet/bootstrap_ini.jsp" %>
</head>
<body>

	<%@ include file="snippet/nav_bar.jsp"%>

    <div class="container">
        <br>
        <h1 class="text-center" style="text-transform: uppercase;"><strong>Editar Préstamo</strong></h1><br>
        <form method="get" action="PrestamoServlet" style="margin: 0 12%">
        	<input type="hidden" name="action" value="actualizar">
			<input type="hidden" name="id" value="${ prestamo.idPrestamo }">
            <div class="row mb-3">
				<div class="col-md-6">
					<label for="id" class="form-label"><b>Id Prestamo:</b></label>
						<input type="text" class="form-control" id="id" name="id" disabled value="${ prestamo.idPrestamo }">
				</div>
                <div class="col-md-6">
                    <label for="fecpre" class="form-label"><b>Fecha Prestamo:</b></label>
                    <input type="date" class="form-control" id="fecpre" name="fecpre" value="${ prestamo.fecPrestamo }">
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="fecdev" class="form-label"><b>Fecha Devolución:</b></label>
                    <input type="date" class="form-control" id="fecdev" name="fecdev" value="${ prestamo.fecDevolucion }">
                </div>
                <div class="col-md-6">
                    <label for="estado" class="form-label"><b>Estado:</b></label>
                    <select class="form-select" id="estado" name="estado">
                    <option value="${ prestamo.estado }" selected > ${ prestamo.estado }</option>
                        <option value="Prestado" id="Prestado" >Prestado</option>
                        <option value="Devuelto" id="Devuelto" >Devuelto</option>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                
                <div class="col-md-6">
                    <label for="idLibro" class="form-label"><b>Libro:</b></label>
				    <select class="form-select" id="idLibro" name="idLibro">
					    <option value="${prestamo.idLibro }" > ${ prestamo.titulo }</option>
					    <% List<Libro> opcionesLibro = LibroModel.obtenerOpcionesLibro();
					    for (Libro opcion : opcionesLibro) { %>
					        <option value="<%= opcion.getIdLibro() %>"><%= opcion.getTitulo() %></option>
					    <% } %>
				    </select>
                </div> 
            </div>   
            <br><h3 style="font-weight: 700; text-transform: uppercase;">Dato del Alumno</h3>
                <div class="col-md-6">
                    <label for="idAlumno" class="form-label"><b>Alumno:</b></label>
				    <select class="form-select" id="idAlumno" name="idAlumno">
				        <option value="${prestamo.idAlumno }" > ${ prestamo.alumno }</option>
					    <% List<Alumno> opcionesAlumno = AlumnoModel.obtenerOpcionesAlumno();
					    for (Alumno opcion : opcionesAlumno) { %>
					        <option value="<%= opcion.getIdAlumno() %>"><%= opcion.getNombre() %></option>
					    <% } %>
				    </select>
                </div>  
			<div class="row">
				<div class="col-md-12 text-center">
					<br>
					<input type="submit" name="enviar" id="enviar" value="Editar Préstamo" class="btn btn-primary" style="font-weight: 600" onclick="return confirmarEdicion(event)">
					<input type="reset" name="borrar" id="borrar" value="Restablecer" class="btn btn-secondary" style="font-weight: 600">
				</div>
			</div>
        </form>
    </div>

</body>
<%@include file="snippet/bootstrap_fin.jsp" %>
<%@include file="snippet/sa.jsp" %>
</html>