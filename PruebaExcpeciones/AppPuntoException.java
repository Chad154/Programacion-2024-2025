package PruebaExcpeciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppPuntoException {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            nuevoPunto();
        } catch (PuntoNoValidoException e) {
            System.out.println("Error: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Error: Los valores tienen que ser numeros");
        }
    }

    public static Punto nuevoPunto() throws InputMismatchException, PuntoNoValidoException {
        System.out.println("Escribe el valor de X");
        int x = teclado.nextInt();
        System.out.println("Escribe el valor de Y");
        int y = teclado.nextInt();
        // Creamos el punto con los valores enteros

        Punto p = new Punto(x, y);
        // Comprobamos que el punto es valido sino lanzamos la excepcion
        if (x < 0 || y < 0)
            throw new PuntoNoValidoException(p);
        System.out.println(p.getNombre() + " (" + x + "," + y + ") creado");

        return p;
    }
}
