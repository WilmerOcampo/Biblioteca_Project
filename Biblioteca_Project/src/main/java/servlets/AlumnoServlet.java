package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import models.AlumnoModel;
import models.CompraLibroModel;
import entities.Alumno;
import entities.CompraLibro;

import java.io.IOException;
import java.util.List;

public class AlumnoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null)
            action = "listar";

        switch (action) {
            case "listar" -> listarAlumnos(request, response);
            case "agregar" -> procesarAlumno(request, response, "agregar");
            case "mostrar" -> procesarAlumno(request, response, "mostrar");
            case "actualizar" -> procesarAlumno(request, response, "actualizar");
            case "eliminar" -> procesarAlumno(request, response, "eliminar");
            default -> listarAlumnos(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void listarAlumnos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Alumno> alumnos = AlumnoModel.listarAlumnos();
            request.setAttribute("alumnos", alumnos);
            request.getRequestDispatcher("listaAlumnos.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void procesarAlumno(HttpServletRequest request, HttpServletResponse response, String action) {
        String idAlumno = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");

        Alumno alumno = new Alumno(idAlumno, nombre, apellido, direccion, telefono, email);

        try {
            switch (action) {
                case "agregar" -> AlumnoModel.agregarAlumno(alumno);
                case "mostrar" -> {
                    Alumno alu = AlumnoModel.mostrarAlumno(idAlumno);
                    request.setAttribute("alumno", alu);
                    request.getRequestDispatcher("editarAlumno.jsp").forward(request, response);
                    return; // Se agrega un return para salir del método después de redirigir
                }
                case "actualizar" -> AlumnoModel.actualizarAlumno(alumno);
                case "eliminar" -> AlumnoModel.eliminarAlumno(idAlumno);
            }  
            listarAlumnos(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}