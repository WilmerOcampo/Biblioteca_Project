package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.RequestDispatcher;
import util.MySQLConexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("user");
        String psw = request.getParameter("pass");
        HttpSession httpSession = request.getSession();
        RequestDispatcher reqDispatcher = null;

        try (Connection con = MySQLConexion.getConexion()) {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Empleado WHERE (dni = ? OR email = ?) AND clave = ?");
            pst.setString(1, email);
            pst.setString(2, email);
            pst.setString(3, psw);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                httpSession.setAttribute("nombre", rs.getString("nombre"));
                reqDispatcher = request.getRequestDispatcher("LibroServlet?listaLibros&action=listar");
            } else {
                request.setAttribute("estado", "failed");
                reqDispatcher = request.getRequestDispatcher("login.jsp");
            }
            reqDispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}