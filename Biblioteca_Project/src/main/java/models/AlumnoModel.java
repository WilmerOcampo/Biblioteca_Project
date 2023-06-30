package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entities.Alumno;
import util.MySQLConexion;

public class AlumnoModel {

	public static List<Alumno> listarAlumnos() throws SQLException {
		List<Alumno> alumnos = new ArrayList<>();

		try (Connection cn = MySQLConexion.getConexion();
			 PreparedStatement ps = cn.prepareStatement("SELECT * FROM alumno");
			 ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				String idAlumno = rs.getString("idAlumno");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String direccion = rs.getString("direccion");
				String telefono = rs.getString("telefono");
				String email = rs.getString("email");

				Alumno alumno = new Alumno(idAlumno, nombre, apellido, direccion, telefono, email);
				alumnos.add(alumno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alumnos;
	}

	public static void agregarAlumno(Alumno alumno) throws SQLException {
		try (Connection cn = MySQLConexion.getConexion();
			 PreparedStatement ps = cn.prepareStatement("INSERT INTO alumno (idAlumno, nombre, apellido, direccion, telefono, email) VALUES (?, ?, ?, ?, ?, ?)")) {

			ps.setString(1, alumno.getIdAlumno());
			ps.setString(2, alumno.getNombre());
			ps.setString(3, alumno.getApellido());
			ps.setString(4, alumno.getDireccion());
			ps.setString(5, alumno.getTelefono());
			ps.setString(6, alumno.getEmail());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Alumno mostrarAlumno(String idAlumno) throws SQLException {
		Alumno alumno = null;

		try (Connection cn = MySQLConexion.getConexion();
			 PreparedStatement ps = cn.prepareStatement("SELECT * FROM alumno WHERE idAlumno = ?")) {

			ps.setString(1, idAlumno);

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					String id = rs.getString("idAlumno");
					String nombre = rs.getString("nombre");
					String apellido = rs.getString("apellido");
					String direccion = rs.getString("direccion");
					String telefono = rs.getString("telefono");
					String email = rs.getString("email");

					alumno = new Alumno(id, nombre, apellido, direccion, telefono, email);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alumno;
	}

	public static void actualizarAlumno(Alumno alumno) throws SQLException {
		try (Connection cn = MySQLConexion.getConexion();
			 PreparedStatement ps = cn.prepareStatement(
					 "UPDATE alumno SET nombre = ?, apellido = ?, direccion = ?, telefono = ?, email = ? WHERE idAlumno = ?")) {

			ps.setString(1, alumno.getNombre());
			ps.setString(2, alumno.getApellido());
			ps.setString(3, alumno.getDireccion());
			ps.setString(4, alumno.getTelefono());
			ps.setString(5, alumno.getEmail());
			ps.setString(6, alumno.getIdAlumno());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void eliminarAlumno(String idAlumno) throws SQLException {
		try (Connection cn = MySQLConexion.getConexion();
			 PreparedStatement ps = cn.prepareStatement(
					 "DELETE FROM alumno WHERE idAlumno IS NULL OR idAlumno = ?")) {

			ps.setString(1, idAlumno);

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Alumno> obtenerOpcionesAlumno() throws SQLException {
		List<Alumno> opciones = new ArrayList<>();

		try (Connection cn = MySQLConexion.getConexion();
			 PreparedStatement ps = cn.prepareStatement("SELECT * FROM Alumno");
			 ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				Alumno alu = new Alumno();
				alu.setIdAlumno(rs.getString("idAlumno"));
				alu.setNombre(rs.getString("nombre"));
				opciones.add(alu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return opciones;
	}
}