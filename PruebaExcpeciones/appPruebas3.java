package PruebaExcpeciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class appPruebas3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int minutos;

        System.out.println("Introduce los minutos");
        minutos = entrada.nextInt();
        if (minutos < 0 || minutos >= 60) {
            // Lanzamos el error de datos de entrada
            throw new InputMismatchException("Valor fuera de rango (0-59)");
        }
        System.out.println("Los minutos son validos");
    }

}
