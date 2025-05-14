import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EjemploInsertMySQL {

    public static void main(String[] args) {
        try {
            String nombre = "Antonio";
            String correo = "antonio@gmail.com";
            Connection conex = ConexionDB.conectar("agenda");
            System.out.println("Se ha conectado correctamente");
            String query = "INSERT INTO contacto VALUES (2,5)";
            PreparedStatement instruccion = conex.prepareStatement(query);
            instruccion.setString(1, nombre);
            instruccion.setString(2, correo);
            int resultado = instruccion.executeUpdate();
            if (resultado == 1)
                System.out.println("Insertado contacto nombre" + nombre);
            conex.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
