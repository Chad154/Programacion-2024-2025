import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EjemploUpdateMySQL {
    public static void main(String[] args) {
        try {
            // Conectamos

            Connection conex = ConexionDB.conectar("agenda");
            System.out.println("Conexion realizada correctamente");
            // Preparamos la sentencia
            String query = "UPDATE contacto SET edad = ? WHERE edad > ?";
            PreparedStatement instruccion = conex.prepareStatement(query);
            instruccion.setInt(1, 25);
            instruccion.setInt(2, 19);

            // ejecutamos
            int resultado = instruccion.executeUpdate();
            // analizamos resultado
            if (resultado > 0)
                System.out.println("Se han modificado " + resultado + " contacots");
            else
                System.out.println("No se ha modificado nada");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
