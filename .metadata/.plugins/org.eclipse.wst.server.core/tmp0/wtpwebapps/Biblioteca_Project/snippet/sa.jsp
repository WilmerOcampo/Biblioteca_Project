    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.20/dist/sweetalert2.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.20/dist/sweetalert2.min.css">

<script>
	   function confirmarEdicion(event) {
	        event.preventDefault(); // Evitar que el formulario se env�e autom�ticamente
	        
	        Swal.fire({
	            title: '�Est�s seguro de que deseas guardar los cambios?',
	            icon: 'question',
	            showCancelButton: true,
	            confirmButtonText: 'S�',
	            cancelButtonText: 'No'
	        }).then((result) => {
	            if (result.isConfirmed) {
	                // Si se confirma, enviar el formulario
	                document.getElementById('enviar').disabled = true; // Deshabilitar el bot�n para evitar m�ltiples env�os
	                document.getElementById('enviar').form.submit();
	            }
	        });
	    }
	   function confirmarEliminacionAl(id) {
	        Swal.fire({
	            title: "�Est�s seguro?",
	            text: "No podr�s revertir esto",
	            icon: "warning",
	            showCancelButton: true,
	            confirmButtonColor: "#3085d6",
	            cancelButtonColor: "#d33",
	            confirmButtonText: "S�, eliminarlo"
	        }).then((result) => {
	            if (result.isConfirmed) {
	                window.location.href = "AlumnoServlet?action=eliminar&id=" + id;
	            }
	        });
	    }
	   function confirmarEliminacionCo(id) {
	        Swal.fire({
	            title: "�Est�s seguro?",
	            text: "No podr�s revertir esto",
	            icon: "warning",
	            showCancelButton: true,
	            confirmButtonColor: "#3085d6",
	            cancelButtonColor: "#d33",
	            confirmButtonText: "S�, eliminarlo"
	        }).then((result) => {
	            if (result.isConfirmed) {
	                window.location.href = "CompraLibroServlet?action=eliminar&id=" + id;
	            }
	        });
	    }
	   function confirmarEliminacionEd(id) {
	        Swal.fire({
	            title: "�Est�s seguro?",
	            text: "No podr�s revertir esto",
	            icon: "warning",
	            showCancelButton: true,
	            confirmButtonColor: "#3085d6",
	            cancelButtonColor: "#d33",
	            confirmButtonText: "S�, eliminarlo"
	        }).then((result) => {
	            if (result.isConfirmed) {
	                window.location.href = "EditorialServlet?action=eliminar&id=" + id;
	            }
	        });
	    }
	   function confirmarEliminacionEm(id) {
	        Swal.fire({
	            title: "�Est�s seguro?",
	            text: "No podr�s revertir esto",
	            icon: "warning",
	            showCancelButton: true,
	            confirmButtonColor: "#3085d6",
	            cancelButtonColor: "#d33",
	            confirmButtonText: "S�, eliminarlo"
	        }).then((result) => {
	            if (result.isConfirmed) {
	                window.location.href = "EmpleadoServlet?action=eliminar&id=" + id;
	            }
	        });
	    }
	   function confirmarEliminacionLi(id) {
	        Swal.fire({
	            title: "�Est�s seguro?",
	            text: "No podr�s revertir esto",
	            icon: "warning",
	            showCancelButton: true,
	            confirmButtonColor: "#3085d6",
	            cancelButtonColor: "#d33",
	            confirmButtonText: "S�, eliminarlo"
	        }).then((result) => {
	            if (result.isConfirmed) {
	                window.location.href = "LibroServlet?action=eliminar&id=" + id;
	            }
	        });
	    }
	   function confirmarEliminacionPr(id) {
	        Swal.fire({
	            title: "�Est�s seguro?",
	            text: "No podr�s revertir esto",
	            icon: "warning",
	            showCancelButton: true,
	            confirmButtonColor: "#3085d6",
	            cancelButtonColor: "#d33",
	            confirmButtonText: "S�, eliminarlo"
	        }).then((result) => {
	            if (result.isConfirmed) {
	                window.location.href = "PrestamoServlet?action=eliminar&id=" + id;
	            }
	        });
	   }
</script>