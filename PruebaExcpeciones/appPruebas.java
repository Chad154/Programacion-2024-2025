package PruebaExcpeciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class appPruebas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = "4";
        int num = 0;
        int decimal, resultado = 0;

        try {
            decimal = teclado.nextInt();
            num = Integer.parseInt(cadena);
            resultado = num / decimal;

        } catch (NumberFormatException e1) {
            System.out.println("El error es: " + e1.getMessage());
            e1.printStackTrace();
        } catch (InputMismatchException e2) {
            System.out.println("El error es: " + e2.getMessage());
            e2.printStackTrace();
        } catch (ArithmeticException e3) {
            System.out.println("El error es: " + e3.getMessage());
            e3.printStackTrace();
        }
        System.out.println("El numero es: " + num);
        System.out.println("El resultado es: " + resultado);
    }

}
