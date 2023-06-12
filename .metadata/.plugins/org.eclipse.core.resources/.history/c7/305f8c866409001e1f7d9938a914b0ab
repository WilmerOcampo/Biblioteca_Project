package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Empleado;
import util.MySQLConexion;

public class EmpleadoModel {
	public static List<Empleado> listarEmpleados() throws Exception {
        List<Empleado> empleados = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            cn = MySQLConexion.getConexion();
            String sql = "SELECT idEmpleado, nombre, apellido, direccion, telefono, email FROM empleado";
            st = cn.createStatement();
            rs = st.executeQuery(sql);

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
			rs.close();
			rs.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empleados;
    }

    /*public static void addEmpleado(Empleado nuevoEmpleado) throws Exception {
        try (Connection miConexion = MYSQLConexion.getConnection();
                PreparedStatement miStatement = miConexion.prepareStatement("INSERT INTO empleado (idEmpleado, nombreEmpleado, apellidoEmpleado, direccion, telefono, email, dni, pass) VALUES (?,?,?,?,?,?,?,?)")) {

            miStatement.setString(1, nuevoEmpleado.getIdEmpleado());
            miStatement.setString(2, nuevoEmpleado.getNombreEmpleado());
            miStatement.setString(3, nuevoEmpleado.getApellidoEmpleado());
            miStatement.setString(4, nuevoEmpleado.getDireccion());
            miStatement.setString(5, nuevoEmpleado.getTelefono());
            miStatement.setString(6, nuevoEmpleado.getEmail());
            miStatement.setString(7, nuevoEmpleado.getDni());
            miStatement.setString(8, nuevoEmpleado.getPass());

            miStatement.execute();
        }
    }

    public static Empleado getEmpleado(String idEmpleado) throws Exception {
        Empleado elEmpleado = null;
        Connection miConexion = null;
        PreparedStatement miStatement = null;
        ResultSet miResulSet = null;

        try {
            miConexion = MYSQLConexion.getConnection();
            String sql = "SELECT idEmpleado, nombreEmpleado, apellidoEmpleado, direccion, telefono, email, dni, pass FROM empleado WHERE idEmpleado = ?";
            miStatement = miConexion.prepareStatement(sql);
            miStatement.setString(1, idEmpleado);
            miResulSet = miStatement.executeQuery();

            if (miResulSet.next()) {
                String id = miResulSet.getString("idEmpleado");
                String nombre = miResulSet.getString("nombreEmpleado");
                String apellido = miResulSet.getString("apellidoEmpleado");
                String direccion = miResulSet.getString("direccion");
                String telefono = miResulSet.getString("telefono");
                String email = miResulSet.getString("email");
                String dni = miResulSet.getString("dni");
                String pass = miResulSet.getString("pass");

                elEmpleado = new Empleado(id, nombre, apellido, direccion, telefono, email, dni, pass);
            } else {
                throw new Exception("No se encontró el empleado con ID " + idEmpleado);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (miResulSet != null) {
                try {
                    miResulSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (miStatement != null) {
                try {
                    miStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (miConexion != null) {
                try {
                    miConexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return elEmpleado;
    }

    public static void actualizarEmpleado(Empleado empleadoActualizado) throws Exception {
        Connection miConexion = null;
        PreparedStatement miStatement = null;

        try {
            miConexion = MYSQLConexion.getConnection();

            String sql = "UPDATE empleado SET nombreEmpleado = ?, apellidoEmpleado = ?, direccion = ?, telefono = ?, email = ?, dni = ?, pass = ? WHERE idEmpleado = ?";

            miStatement = miConexion.prepareStatement(sql);
            miStatement.setString(1, empleadoActualizado.getNombreEmpleado());
            miStatement.setString(2, empleadoActualizado.getApellidoEmpleado());
            miStatement.setString(3, empleadoActualizado.getDireccion());
            miStatement.setString(4, empleadoActualizado.getTelefono());
            miStatement.setString(5, empleadoActualizado.getEmail());
            miStatement.setString(6, empleadoActualizado.getDni());
            miStatement.setString(7, empleadoActualizado.getPass());
            miStatement.setString(8, empleadoActualizado.getIdEmpleado());

            int filasActualizadas = miStatement.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Empleado actualizado correctamente.");
            } else {
                System.out.println("No se encontró el empleado o no se realizó ninguna actualización.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Manejo de excepciones
        } finally {
            // Cerrar recursos en el orden inverso de su apertura
            if (miStatement != null) {
                try {
                    miStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (miConexion != null) {
                try {
                    miConexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void eliminarEmpleado(String idEmpleado) throws Exception {
        Connection miConexion = null;
        PreparedStatement miStatement = null;

        try {
            miConexion = MYSQLConexion.getConnection();

            String sql = "DELETE FROM empleado WHERE idEmpleado IS NULL OR idEmpleado=?";

            miStatement = miConexion.prepareStatement(sql);
            miStatement.setString(1, idEmpleado);

            miStatement.executeUpdate();
        } finally {
            // Cerrar los recursos (Statement y Connection) en un bloque finally
            if (miStatement != null) {
                miStatement.close();
            }
            if (miConexion != null) {
                miConexion.close();
            }
        }
    }*/
}
