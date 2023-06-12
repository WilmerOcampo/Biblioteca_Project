<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>Editar Alumno</title>
    <%@include file="snippet/bootstrap_ini.jsp" %>
</head>
<body>

	<%@include file="snippet/nav_bar.jsp"%>

	<div class="container">
		<br>
		<h1 class="text-center" style="text-transform: uppercase;"><strong>Editar Alumno</strong></h1>
		<br>
		<form method="get" action="AlumnoServlet" style="margin: 0 12%">
			<input type="hidden" name="action" value="actualizar">
			<input type="hidden" name="id" value="${ alumno.idAlumno }">
			<div class="row mb-3">
				<div class="col-md-6">
					<label for="id" class="form-label"><b>Id Alumno:</b></label> <input
						type="text" class="form-control" id="id" name="id" disabled
						value="${ alumno.idAlumno }">
				</div>
				<div class="col-md-6">
					<label for="nombre" class="form-label"><b>Nombre:</b></label> <input
						type="text" class="form-control" id="nombre" name="nombre"
						value="${ alumno.nombre }">
				</div>
			</div>
			<div class="row mb-3">
				<div class="col-md-6">
					<label for="apellido" class="form-label"><b>Apellido:</b></label> <input
						type="text" class="form-control" id="apellido" name="apellido"
						value="${ alumno.apellido }">
				</div>
				<div class="col-md-6">
					<label for="direccion" class="form-label"><b>Direcci�n:</b></label>
					<input type="text" class="form-control" id="direccion"
						name="direccion" value="${ alumno.direccion }">
				</div>
			</div>
			<div class="row mb-3">
				<div class="col-md-6">
					<label for="telefono" class="form-label"><b>Telefono:</b></label> <input
						type="number" class="form-control" id="telefono" name="telefono"
						value="${ alumno.telefono }">
				</div>
				<div class="col-md-6">
					<label for="email" class="form-label"><b>Email:</b></label> <input
						type="email" class="form-control" id="email" name="email"
						value="${ alumno.email }">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 text-center">
					<br>
					<input type="submit" name="enviar" id="enviar" value="Editar Alumno" class="btn btn-primary" style="font-weight: 600" onclick="return confirmarEdicion()">
					<input type="reset" name="borrar" id="borrar" value="Restablecer" class="btn btn-secondary" style="font-weight: 600">
				</div>
			</div>
		</form>
	</div>

</body>
<%@include file="snippet/bootstrap_fin.jsp" %>
<script>
	function confirmarEdicion() {
		return confirm("�Est�s seguro de que deseas guaradr los cambios?");
	}
</script>
</html>