package models;

import entities.Empleado;
import util.MySQLConexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoModel {
    public static List<Empleado> listarEmpleados() throws SQLException {
        List<Empleado> empleados = new ArrayList<>();

        try (Connection cn = MySQLConexion.getConexion();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT idEmpleado, nombre, apellido, direccion, telefono, email FROM empleado")) {

            while (rs.next()) {
                String idEmpleado = rs.getString("idEmpleado");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");

                Empleado empleado = new Empleado(idEmpleado, nombre, apellido, direccion, telefono, email);
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleados;
    }

    public static void agregarEmpleado(Empleado empleado) throws SQLException {
        try (Connection connection = MySQLConexion.getConexion();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Empleado (idEmpleado, nombre, apellido, direccion, telefono, email, dni, clave) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, empleado.getIdEmpleado());
            preparedStatement.setString(2, empleado.getNombre());
            preparedStatement.setString(3, empleado.getApellido());
            preparedStatement.setString(4, empleado.getDireccion());
            preparedStatement.setString(5, empleado.getTelefono());
            preparedStatement.setString(6, empleado.getEmail());
            preparedStatement.setString(7, empleado.getDni());
            preparedStatement.setString(8, empleado.getPass());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Empleado mostrarEmpleado(String idEmpleado) throws SQLException {
        Empleado empleado = null;

        try (Connection connection = MySQLConexion.getConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM empleado WHERE idEmpleado = ?"
             )) {
            preparedStatement.setString(1, idEmpleado);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String id = resultSet.getString("idEmpleado");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String direccion = resultSet.getString("direccion");
                String telefono = resultSet.getString("telefono");
                String email = resultSet.getString("email");
                String dni = resultSet.getString("dni");
                String pass = resultSet.getString("clave");

                empleado = new Empleado(id, nombre, apellido, direccion, telefono, email, dni, pass);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleado;
    }

    public static void actualizarEmpleado(Empleado empleado) throws SQLException {
        try (Connection connection = MySQLConexion.getConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE empleado SET nombre = ?, apellido = ?, direccion = ?, telefono = ?, email = ?, clave = ? WHERE idEmpleado = ?"
             )) {

            preparedStatement.setString(1, empleado.getNombre());
            preparedStatement.setString(2, empleado.getApellido());
            preparedStatement.setString(3, empleado.getDireccion());
            preparedStatement.setString(4, empleado.getTelefono());
            preparedStatement.setString(5, empleado.getEmail());
            preparedStatement.setString(6, empleado.getPass());
            preparedStatement.setString(7, empleado.getIdEmpleado());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarEmpleado(String idEmpleado) throws SQLException {
        try (Connection connection = MySQLConexion.getConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM empleado WHERE idEmpleado = ?"
             )) {

            preparedStatement.setString(1, idEmpleado);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Empleado> obtenerOpcionesEmpleado() throws SQLException {
        List<Empleado> opciones = new ArrayList<>();

        try (Connection cn = MySQLConexion.getConexion();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT idEmpleado, nombre FROM Empleado")) {

            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setIdEmpleado(rs.getString("idEmpleado"));
                emp.setNombre(rs.getString("nombre"));
                opciones.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return opciones;
    }
}