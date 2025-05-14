import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    public static final String User = "root";
    public static final String PWD = "";
    public static final String URL = "jdbc:MySQL://localhost/";

    public static Connection conectar(String nombreDB) throws SQLException {
        return DriverManager.getConnection(URL + nombreDB, User, PWD);
    }
}
