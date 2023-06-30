package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Prestamo;
import util.MySQLConexion;

public class PrestamoModel {
    public static List<Prestamo> listarPrestamos() {
        List<Prestamo> pres = new ArrayList<>();

        try (Connection connection = MySQLConexion.getConexion();
             CallableStatement st = connection.prepareCall("{CALL SP_MostrarPrestamos()}")) {

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    String id = rs.getString("idPrestamo");
                    String tit = rs.getString("titulo");
                    String alu = rs.getString("alumno");
                    Date fecp = rs.getDate("fecPre");
                    Date fecd = rs.getDate("fecDev");
                    String est = rs.getString("estado");

                    Prestamo prestamo = new Prestamo(id, tit, alu, fecp, fecd, est);
                    pres.add(prestamo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pres;
    }

    public static void agregarPrestamo(Prestamo pres) throws Exception {
        try (Connection cn = MySQLConexion.getConexion();
             PreparedStatement ps = cn.prepareStatement("{CALL SP_AgregarPrestamo(?, ?, ?, ?, ?, ?)}")) {

            ps.setString(1, pres.getIdPrestamo());
            ps.setDate(2, new java.sql.Date(pres.getFecPrestamo().getTime()));
            ps.setDate(3, new java.sql.Date(pres.getFecDevolucion().getTime()));
            ps.setString(4, pres.getEstado());
            ps.setString(5, pres.getIdLibro());
            ps.setString(6, pres.getIdAlumno());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Prestamo mostrarPrestamo(String id) {
        Prestamo pres = null;

        try (Connection cn = MySQLConexion.getConexion();
             PreparedStatement ps = cn.prepareStatement("CALL SP_MostrarPrestamo(?)")) {

            ps.setString(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String idp = rs.getString("idPrestamo");
                    String tit = rs.getString("titulo");
                    String alu = rs.getString("alumno");
                    Date fecp = rs.getDate("fecPre");
                    Date fecd = rs.getDate("fecDev");
                    String est = rs.getString("estado");

                    pres = new Prestamo(idp, tit, alu, fecp, fecd, est);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pres;
    }

    public static void actualizarPrestamo(Prestamo prestamo) throws Exception {
        try (Connection cn = MySQLConexion.getConexion();
             PreparedStatement ps = cn.prepareStatement("CALL SP_ActualizarPrestamo(?, ?, ?, ?, ?, ?)")) {

            ps.setString(1, prestamo.getIdPrestamo());
            ps.setDate(2, new java.sql.Date(prestamo.getFecPrestamo().getTime()));
            ps.setDate(3, new java.sql.Date(prestamo.getFecDevolucion().getTime()));
            ps.setString(4, prestamo.getEstado());
            ps.setString(5, prestamo.getIdLibro());
            ps.setString(6, prestamo.getIdAlumno());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarPrestamo(String id) {
        try (Connection cn = MySQLConexion.getConexion();
             CallableStatement cs = cn.prepareCall("{CALL SP_EliminarPrestamo(?)}")) {

            cs.setString(1, id);
            cs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}