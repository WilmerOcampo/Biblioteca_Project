package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import models.LibroModel;
import entities.Libro;

import java.io.IOException;
import java.util.List;

public class LibroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null)
            action = "listar";

        switch (action) {
            case "listar" -> listarLibros(request, response);
            case "agregar" -> procesarLibro(request, response, "agregar");
            case "mostrar" -> procesarLibro(request, response, "mostrar");
            case "actualizar" -> procesarLibro(request, response, "actualizar");
            case "eliminar" -> procesarLibro(request, response, "eliminar");
            default -> listarLibros(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void listarLibros(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Libro> libros = LibroModel.listarLibros();
            request.setAttribute("libros", libros);
            request.getRequestDispatcher("listaLibros.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void procesarLibro(HttpServletRequest request, HttpServletResponse response, String action) throws ServletException, IOException {
        String idLibro = request.getParameter("id");
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String idEditorial = request.getParameter("idEditorial");
        //int stock = Integer.parseInt(request.getParameter("stock"));
        String stk = request.getParameter("stock");
        int stock = 0; // Valor predeterminado en caso de que el parámetro sea nulo

        if (stk != null && !stk.isEmpty()) {
            try {
                stock = Integer.parseInt(stk);
            } catch (NumberFormatException e) {
                // Manejar el caso en el que la cadena no sea un número válido
                e.printStackTrace();
            }
        }
        String estado = request.getParameter("estado");

        Libro libro = new Libro(idLibro, titulo, autor, idEditorial, stock, estado);

        try {
            switch (action) {
                case "agregar":
                    LibroModel.agregarLibro(libro);
                    break;
                case "mostrar":
                    Libro lib = LibroModel.mostrarLibro(idLibro);
                    request.setAttribute("libro", lib);
                    request.getRequestDispatcher("editarLibro.jsp").forward(request, response);
                    return; // Se agrega un return para salir del método después de redirigir
                case "actualizar":
                    LibroModel.actualizarLibro(libro);
                    break;
                case "eliminar":
                    LibroModel.eliminarLibro(idLibro);
                    break;
            }
            listarLibros(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}