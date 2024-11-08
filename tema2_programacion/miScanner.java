
//Cargamos la Clase Scanner para la introduccion de datos
import java.util.Scanner;

public class miScanner {

    public static void main(String[] args) {
        // Creamos un objeto de la clase Scanner
        Scanner teclado = new Scanner(System.in);

        String nombre;

        System.out.print("Introduzca un nombre (una palabra): ");
        // Utilizamos la funcion next, espera hasta que se introduzcan datos
        nombre = teclado.next();

        System.out.println("Hola, " + nombre);

        teclado.close();
    }

}
