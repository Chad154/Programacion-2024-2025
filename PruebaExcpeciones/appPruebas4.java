package PruebaExcpeciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class appPruebas4 {
    public static void main(String[] args) {
        boolean salir = false;
        int posicion;
        int[] array = { 10, 20, 30, 40, 50 };
        do {
            try {
                posicion = obtenerPosicion(array);
                System.out.println("Array[" + posicion + "] = " + array[posicion]);
                salir = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("El valor tiene que ser un numero");
                // Recojo el intro
                teclado.next();
            }
        } while (!salir);
        System.out.println("El programa sigue");
        teclado.close();

    }

    static Scanner teclado = new Scanner(System.in);

    public static int obtenerPosicion(int[] v) throws ArrayIndexOutOfBoundsException {
        System.out.println("Dime una posicion del array entre 0 y " + (v.length - 1));
        int n = teclado.nextInt();
        if (n < 0 || n >= v.length) {
            // Lanzamos la excepcion fuera del rango del array
            throw new ArrayIndexOutOfBoundsException("Error indice fuera de rango");
        }
        return n;
    }

}
