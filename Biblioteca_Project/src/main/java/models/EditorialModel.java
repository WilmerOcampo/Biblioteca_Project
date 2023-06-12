package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Editorial;
import util.MySQLConexion;

public class EditorialModel {
    private static Connection connection = MySQLConexion.getConexion();

    // Constructor
    /*public EditorialModel(Connection connection) {
        this.connection = connection;
    }*/

    // Método para listar todas las editoriales
    public static List<Editorial> listarEditoriales() throws SQLException {
        List<Editorial> editoriales = new ArrayList<>();
        String query = "SELECT * FROM Editorial";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Editorial editorial = new Editorial(
                        resultSet.getString("idEditorial"),
                        resultSet.getString("nombre"),
                        resultSet.getString("direccion"),
                        resultSet.getString("telefono"),
                        resultSet.getString("email"),
                        resultSet.getString("ruc")
                );
                editoriales.add(editorial);
            }
        }

        return editoriales;
    }

    // Método para agregar una nueva editorial
    public void agregarEditorial(Editorial editorial) throws SQLException {
        String query = "INSERT INTO Editorial (idEditorial, nombre, direccion, telefono, email, ruc) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, editorial.getIdEditorial());
            statement.setString(2, editorial.getNombre());
            statement.setString(3, editorial.getDireccion());
            statement.setString(4, editorial.getTelefono());
            statement.setString(5, editorial.getEmail());
            statement.setString(6, editorial.getRuc());

            statement.executeUpdate();
        }
    }

    // Método para mostrar los detalles de una editorial
    public Editorial mostrarEditorial(String idEditorial) throws SQLException {
        String query = "SELECT * FROM Editorial WHERE idEditorial = ?";
        Editorial editorial = null;

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, idEditorial);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    editorial = new Editorial(
                            resultSet.getString("idEditorial"),
                            resultSet.getString("nombre"),
                            resultSet.getString("direccion"),
                            resultSet.getString("telefono"),
                            resultSet.getString("email"),
                            resultSet.getString("ruc")
                    );
                }
            }
        }

        return editorial;
    }

    // Método para actualizar los datos de una editorial
    public void actualizarEditorial(Editorial editorial) throws SQLException {
        String query = "UPDATE Editorial SET nombre = ?, direccion = ?, telefono = ?, email = ?, ruc = ? " +
                "WHERE idEditorial = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, editorial.getNombre());
            statement.setString(2, editorial.getDireccion());
            statement.setString(3, editorial.getTelefono());
            statement.setString(4, editorial.getEmail());
            statement.setString(5, editorial.getRuc());
            statement.setString(6, editorial.getIdEditorial());

            statement.executeUpdate();
        }
    }

    // Método para eliminar una editorial
    public void eliminarEditorial(String idEditorial) throws SQLException {
        String query = "DELETE FROM Editorial WHERE idEditorial = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, idEditorial);

            statement.executeUpdate();
        }
    }
}
