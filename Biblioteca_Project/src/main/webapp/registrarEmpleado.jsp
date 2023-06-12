<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Empleado</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
</head>

<body class="bg-light">

    <!-- Inicio del menu -->
      <nav class="navbar navbar-expand-md navbar-dark bg-dark">
        <div class="container-fluid">

        <!-- icono o nombre -->
        <a class="navbar-brand" href="#" style="padding-left: 3rem; padding-right: 3rem;">
            <i class="bi bi-book" style="font-size: 2rem; color:#bbb"></i>
            <span style="font-size: 2rem; color:#bbb"><b>CiberBiblioteca</b></span>
          </a>  
            
        <!-- boton del menu -->
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#menu" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

          <!-- elementos del menu colapsable -->
        <div class="collapse navbar-collapse" id="menu">
            <ul class="navbar-nav me-auto" style="font-size: 20px">
                  <li class="nav-item" style="margin:0 0.5rem">
                    <a class="nav-link" href="listaLibros.jsp">Libros</a>
                  </li>
                  <li class="nav-item" style="margin:0 0.5rem">
                    <a class="nav-link" href="listaEmpleados.jsp">Empleados</a>
                  </li>
                  <li class="nav-item" style="margin:0 0.5rem">
                    <a class="nav-link" href="listaPrestamos.jsp">Prestamos</a>
                  </li>
                  <li class="nav-item" style="margin:0 0.5rem">
                    <a class="nav-link" href="listaAlumnos.jsp">Alumnos</a>
                  </li>
                   <li class="nav-item" style="margin:0 0.5rem">
                    <a class="nav-link" href="listaEditorial.jsp">Editorial</a>
                  </li>
                  <li class="nav-item" style="margin:0 0.5rem">
                    <a class="nav-link" href="listaCompras.jsp">Compras</a>
                  </li>
                 </ul>

          <hr class="d-md-none text-white-50">

         <!--boton Informacion -->
          <form class="d-flex">
            <button class="btn btn-danger d-none d-md-inline-block " type="submit" style="font-size: 20px; font-weight:600"><a href="login.jsp" style="text-decoration: none; color: #fff">Cerrar Sesion</a></button>
          </form>
        </div>
        </div>  
      </nav>

    <div class="container">
        <br>
        <h1 class="text-center" style="text-transform: uppercase;"><strong>Registrar Empleado</strong></h1><br>
        <form style="margin: 0 12%">
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="codigo" class="form-label"><b>Codigo:</b></label>
                    <input type="text" class="form-control" id="codigo" name="codigo">
                </div>
                <div class="col-md-6">
                    <label for="nombre" class="form-label"><b>Nombre:</b></label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="apellido" class="form-label"><b>Apellido:</b></label>
                    <input type="text" class="form-control" id="apellido" name="apellido">
                </div>
                <div class="col-md-6">
                    <label for="direccion" class="form-label"><b>Dirección:</b></label>
                    <input type="text" class="form-control" id="direccion" name="direccion">
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="telefono" class="form-label"><b>Telefono:</b></label>
                    <input type="text" class="form-control" id="telefono" name="telefono">
                </div>
                <div class="col-md-6">
                    <label for="email" class="form-label"><b>Email:</b></label>
                    <input type="email" class="form-control" id="email" name="email">
                </div>                  
            </div>
            <div class="row mb-3">
            	<div class="col-md-6">
                    <label for="dni" class="form-label"><b>DNI:</b></label>
                    <input type="text" class="form-control" id="dni" name="dni">
                </div>
            	<div class="col-md-6">
                    <label for="password" class="form-label"><b>Contraseña:</b></label>
                    <input type="password" class="form-control" id="password" name="password">
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 text-center">
                    <br><input type="submit" name="Registrar" id="registrar" value="Registrar Empleado" class="btn btn-primary" style="font-weight: 600">
                    <input type="reset" name="borrar" id="borrar" value="Restablecer" class="btn btn-secondary" style="font-weight: 600">
                </div>
            </div>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>

</body>
</html>