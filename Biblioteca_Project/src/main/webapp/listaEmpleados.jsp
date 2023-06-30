<%@include file="snippet/logout.jsp" %>
<%@page import="java.util.List"%>
<%@page import="entities.Empleado"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empleados</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">  
</head>
<body>
    <!-- Inicio del menu -->
	<%@include file="snippet/nav_bar.jsp" %>

	<div class="d-flex align-items-center justify-content-center">
    	<h1 class="d-flex justify-content-center" style="text-transform: uppercase;"><strong>Empleados</strong></h1>
		<%@include file="snippet/search.jsp" %>
	</div>
    <br>
    <div class="container">
    
        <table class="table table-striped" id="tabla">
            <tr>
                <th scope="col">Codigo</th>
                <th scope="col">Nombre</th>
                <th scope="col">Apellido</th>
                <th scope="col">Direccion</th>
                <th scope="col">Telefono</th>
                <th scope="col">Email</th>
                <th scope="col">Acciones</th>
            </tr>
			<% for (Empleado empleado : (List<Empleado>) request.getAttribute("empleados")) { %>
            <tr class="fila">
                <th><%= empleado.getIdEmpleado() %></th>
                <td><%= empleado.getNombre() %></td>
                <td><%= empleado.getApellido() %></td>
                <td><%= empleado.getDireccion() %></td>
                <td><%= empleado.getTelefono() %></td>
                <td><%= empleado.getEmail() %></td>
                <td><a class="btn btn-outline-success" href="EmpleadoServlet?action=mostrar&id=<%= empleado.getIdEmpleado()%>">Editar</a>
                    <a class="btn btn-outline-danger" href="#" onclick="confirmarEliminacionEm('<%= empleado.getIdEmpleado() %>')">Eliminar</a>
                </td>
            </tr>
            <%
			}
            %>
        </table>

        <div class="d-flex justify-content-center">
            <input class="btn btn-primary" type="button" value="Crear Empleado" style="color: #fff; font-weight:600"
                onclick="window.location.href='registrarEmpleado.jsp'">
        </div>

    </div>
    
</body>
    <%@include file="snippet/bootstrap_fin.jsp" %>
	<%@include file="snippet/sa.jsp" %>
        
<script>
function filtrarTabla() {
    var input, filter, table, tr, tdId, tdNombre, tdApellido, i;
    input = document.getElementById("busqueda");
    filter = input.value.toUpperCase();
    table = document.getElementById("tabla");
    tr = table.getElementsByClassName("fila");
    for (i = 0; i < tr.length; i++) {
        tdId = tr[i].getElementsByTagName("th")[0];
        tdNombre = tr[i].getElementsByTagName("td")[0];
        tdApellido = tr[i].getElementsByTagName("td")[1];
        if (tdId || tdNombre || tdApellido) {
            if (tdId.innerHTML.toUpperCase().indexOf(filter) > -1 ||
                tdNombre.innerHTML.toUpperCase().indexOf(filter) > -1 ||
                tdApellido.innerHTML.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}
</script>
</html>