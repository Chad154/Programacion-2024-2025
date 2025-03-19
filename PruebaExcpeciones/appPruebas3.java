package PruebaExcpeciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class appPruebas3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int minutos, divisor, dividendo;
        dividendo = 1;
        divisor = 0;

        System.out.println("Introduce los minutos");
        try {
            minutos = entrada.nextInt();
            comprobar(minutos);
            dividir(dividendo, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Capturamos excepcion Arithmetic en el main");
        } catch (InputMismatchException e) {
            System.out.println("Los minutos tienen que ser numeros");
        } catch (Exception e) {
            System.out.println("Error indefinido");
        }
        System.out.println("Continua el programa");
    }

    public static void comprobar(int minutos) throws InputMismatchException {
        // Este método lanza la excepción sin capturarla
        if (minutos < 0 || minutos >= 60) {
            // Lanzamos el error de datos de entrada
            throw new InputMismatchException("Valor fuera de rango (0-59)");
        }
    }

    public static void dividir(int n, int m) throws ArithmeticException {
        if (m == 0)
            throw new ArithmeticException("Lanzamos la excepcion");
        else
            System.out.println("La division es: " + (n / m));
        System.out.println();
    }
}
