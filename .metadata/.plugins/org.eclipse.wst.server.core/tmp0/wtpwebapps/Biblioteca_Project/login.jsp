<%@page import="util.MySQLConexion"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<%@include file="snippet/bootstrap_ini.jsp" %>
<title>Login</title>
<style>
        .alert-small {
            padding: 0.7rem 1rem;
            font-size: 0.875rem;
            text-align: center;
            font-weight: bold;
            margin-top: 1rem;
            margin: 0 42%;
        }
    </style>
</head>
<body class="bg-light">

<input type="hidden" id="estado" value="<%= request.getAttribute("estado")%>">

    <div class="container mt-4 col-lg-4 d-flex justify-content-center">
        <div class="card col-sm-10">
            <div class="card-body">
                <form method="post" action="LoginServlet" class="form-sign">
                    <div class="form-group text-center d-flex flex-column justify-content-center align-items-center">
                        <h3 style="font-weight: 700; font-size: 2rem; text-transform: uppercase;">Login</h3>
                        <img alt="Logo" src="img/people.svg" width="40%">
                    </div>
                    <div class="form-group">
                        <label>Usuario:</label>
                        <input type="text" name="user" id="user" class="form-control">
                    </div>
                    <br>
                    <div class="form-group">
                        <label>Password:</label>
                        <input type="password" name="pass" id="pass" class="form-control">
                    </div>
                    <br>
                    <div style="text-align: center">
                        <input type="submit" name="login" value="Ingresar" class="btn btn-success" style="font-weight: 600">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	
	<script type="text/javascript">
		var estado = document.getElementById("estado").value;
		if(estado == "failed"){
			swal("Disculpe", "Usuario o Contraseña Errado", "error");
		}
	</script>
<%@include file="snippet/bootstrap_fin.jsp" %>
</html>