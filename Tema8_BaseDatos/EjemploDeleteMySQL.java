import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EjemploDeleteMySQL {
    public static void main(String[] args) {
        try {
            // Conectamos

            Connection conex = ConexionDB.conectar("agenda");
            // Preparamos la sentencia
            String query = "DELETE FROM contacto WHERE nombre LIKE ?";
            PreparedStatement instruccion = conex.prepareStatement(query);
            instruccion.setString(1, "____");

            // La ejecutamos
            int resultado = instruccion.executeUpdate();
            // Analizamos el resultado
            if (resultado > 0)
                System.out.println("Se han borrado " + resultado + " filas");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
