package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import models.EmpleadoModel;
import entities.Empleado;

import java.io.IOException;
import java.util.List;

public class EmpleadoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null)
            action = "listar";

        switch (action) {
            case "listar" -> listarEmpleados(request, response);
            case "agregar" -> procesarEmpleado(request, response, "agregar");
            case "mostrar" -> procesarEmpleado(request, response, "mostrar");
            case "actualizar" -> procesarEmpleado(request, response, "actualizar");
            case "eliminar" -> procesarEmpleado(request, response, "eliminar");
            default -> listarEmpleados(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void listarEmpleados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Empleado> empleados = EmpleadoModel.listarEmpleados();
            request.setAttribute("empleados", empleados);
            request.getRequestDispatcher("listaEmpleados.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void procesarEmpleado(HttpServletRequest request, HttpServletResponse response, String action) throws ServletException, IOException {
        String idEmpleado = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        String dni = request.getParameter("dni");
        String clave = request.getParameter("clave");

        Empleado empleado = new Empleado(idEmpleado, nombre, apellido, direccion, telefono, email, dni, clave);

        try {
            switch (action) {
                case "agregar":
                    EmpleadoModel.agregarEmpleado(empleado);
                    break;
                case "mostrar":
                    Empleado emp = EmpleadoModel.mostrarEmpleado(idEmpleado);
                    request.setAttribute("empleado", emp);
                    request.getRequestDispatcher("editarEmpleado.jsp").forward(request, response);
                    return; // Se agrega un return para salir del método después de redirigir
                case "actualizar":
                    EmpleadoModel.actualizarEmpleado(empleado);
                    break;
                case "eliminar":
                    EmpleadoModel.eliminarEmpleado(idEmpleado);
                    break;
            }
            listarEmpleados(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}