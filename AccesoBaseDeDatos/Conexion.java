package AccesoBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static final String user = "root";
    public static final String PWD = "";
    public static final String URl = "jdbc:MySQL://localhost/";

    public static Connection conectar(String nombreDB) throws SQLException {
        return DriverManager.getConnection(URl + nombreDB, user, PWD);
    }
}
