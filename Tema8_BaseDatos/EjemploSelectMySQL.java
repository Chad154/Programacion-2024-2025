import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjemploSelectMySQL {
public static void main(String[] args) {
    try{
        String bddd = "agenda";
        String nom = "Juan";
        int edad = 28;

        Connection conex = ConexionDB.conectar(bddd);
        System.out.println("Se ha conectado correctamente");
        String query = "SELECT nombre,correo,edad FROM contacto WHERE nombre=? OR edad >?";
        PreparedStatement instruccion = conex.prepareStatement(query);
        instruccion.setString(1, nom);
        instruccion.setInt(2, edad);

        ResultSet resultado = instruccion.executeQuery();
        while (resultado.next()) {
            String nombre = resultado.getString("nombre");
            String correo = resultado.getString("correo");
            int anios = resultado.getInt("edad");
            System.out.println("Nombre: " + nombre + ",Correo: " + correo + ",Edad: "+anios);
        }
        conex.close();
    }catch(SQLException e){
        System.out.println(e);
    }
}
}
