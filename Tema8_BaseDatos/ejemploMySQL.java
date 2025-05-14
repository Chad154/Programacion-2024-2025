import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ejemploMySQL {

    public static final String User = "root";
    public static final String PWD = "";
    public static final String URL = "jdbc:MySQL://localhost/agenda";

    public static void main(String[] args) {
        try {
            Connection conex = DriverManager.getConnection(URL, User, PWD);
            System.out.println("Se ha conectado correctamente");
            String query = "INSERT INTO contacto VALUES ('maria','maria@gmail.com')";
            Statement instruccion = (Statement) conex.createStatement();
            instruccion.executeUpdate(query);
            System.out.println("Fila insertada");
            conex.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
