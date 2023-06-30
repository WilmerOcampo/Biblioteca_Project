package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import models.PrestamoModel;
import entities.Prestamo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PrestamoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null)
            action = "listar";

        switch (action) {
            case "listar" -> listarPrestamos(request, response);
            case "agregar" -> procesarPrestamo(request, response, "agregar");
            case "mostrar" -> procesarPrestamo(request, response, "mostrar");
            case "actualizar" -> procesarPrestamo(request, response, "actualizar");
            case "eliminar" -> procesarPrestamo(request, response, "eliminar");
            default -> listarPrestamos(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void listarPrestamos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Prestamo> prestamos = PrestamoModel.listarPrestamos();
            request.setAttribute("prestamos", prestamos);
            request.getRequestDispatcher("listaPrestamos.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void procesarPrestamo(HttpServletRequest request, HttpServletResponse response, String action) throws ServletException, IOException {
        String idPrestamo = request.getParameter("id");
        String idLibro = request.getParameter("idLibro");
        String fecPres = request.getParameter("fecpre");
        String fecDevo = request.getParameter("fecdev");
        String estado = request.getParameter("estado");
        String idAlumno = request.getParameter("idAlumno");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fecPre = null;
        Date fecDev = null;
        try {
            fecPre = dateFormat.parse(fecPres);
            fecDev = dateFormat.parse(fecDevo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Prestamo prestamo = new Prestamo(idPrestamo, fecPre, fecDev, estado, idLibro, idAlumno, "");

        try {
            switch (action) {
                case "agregar":
                    PrestamoModel.agregarPrestamo(prestamo);
                    break;
                case "mostrar":
                    Prestamo pres = PrestamoModel.mostrarPrestamo(idPrestamo);
                    request.setAttribute("prestamo", pres);
                    request.getRequestDispatcher("editarPrestamo.jsp").forward(request, response);
                    return; // Se agrega un return para salir del método después de redirigir
                case "actualizar":
                    PrestamoModel.actualizarPrestamo(prestamo);
                    break;
                case "eliminar":
                    PrestamoModel.eliminarPrestamo(idPrestamo);
                    break;
            }
            listarPrestamos(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}