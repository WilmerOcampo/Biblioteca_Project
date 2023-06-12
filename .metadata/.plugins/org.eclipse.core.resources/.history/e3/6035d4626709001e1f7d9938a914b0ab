package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.AlumnoModel;
import models.EmpleadoModel;

import java.io.IOException;
import java.util.List;

import entities.Alumno;
import entities.Empleado;

public class EmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
        if (action == null)
            action = "listar";

        switch (action) {
            case "listar":
                listarEmpleados(request, response);
                break;
            /*case "agregar":
                agregarEmpleado(request, response);
                break;
            case "mostrar":
                try {
                    mostrarEmpleado(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "actualizar":
                try {
                    actualizarEmpleado(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "eliminar":
                try {
                    eliminarEmpleado(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;*/
            default:
                listarEmpleados(request, response);
        }
	}
	
	private void listarEmpleados(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<Empleado> empleados = EmpleadoModel.listarEmpleados();
			request.setAttribute("empleados", empleados);
			request.getRequestDispatcher("listaEmpleados.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
