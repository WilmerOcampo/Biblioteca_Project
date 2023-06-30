	<%
		if(session.getAttribute("nombre")==null){
			response.sendRedirect("login.jsp");
		}
	%>