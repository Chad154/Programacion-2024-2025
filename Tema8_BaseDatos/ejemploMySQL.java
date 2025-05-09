import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ejemploMySQL {

    public static final String User = "root";
    public static final String PWD = "";
    public static final String URL = "jdbc:MySQL://localhost/agenda";

    public static void main(String[] args) {
        try {
            Connection conex = DriverManager.getConnection(URL, User, PWD);
            System.out.println("Se ha conectado correctamente");
            conex.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
