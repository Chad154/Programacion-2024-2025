package AccesoBaseDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class principal {
    public static void main(String[] args) {
        try {
            String nombre = "Antonio";
            String apellido = "Perez";

            Connection conex = Conexion.conectar("examen");
            System.out.println("Se ha conectado correctamente ");
            String query = "INSERT INTO personas (codigo ,nombre , apellido) VALUES (3,?,?)";
            PreparedStatement instruccion = conex.prepareStatement(query);
            instruccion.setString(1, nombre);
            instruccion.setString(2, apellido);
            int resultado = instruccion.executeUpdate();
            if (resultado == 1) {
                System.out.println("Añadido correctamente");
            }

            query = "DELETE FROM personas WHERE nombre LIKE ?";
            instruccion = conex.prepareStatement(query);
            instruccion.setString(1, "Ana");
            resultado = instruccion.executeUpdate();
            if (resultado > 0) {
                System.out.println("Borrado correctamente");
            }
            conex.close();

        } catch (SQLException e) {
            System.out.println("Error al conectar");
        }
    }
}
