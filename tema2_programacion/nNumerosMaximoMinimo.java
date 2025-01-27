import java.util.Scanner;

public class nNumerosMaximoMinimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int contadorMayor = 0;
        int contadorMenor = 0;

        System.out.print("Introduce la cantidad de numeros: ");
        numeros = teclado.nextInt();

        while (numeros <= 0) {
            System.out.print("La cantidad debe ser mayor que 0");
            numeros = teclado.nextInt();
        }

        System.out.println("Introduce los " + numeros + " numeros :");
        for (int i = 0; i < numeros; i++) {
            int numero = teclado.nextInt();

            if (numero > mayor) {
                mayor = numero;
                contadorMayor = 1;
            } else if (numero == mayor) {
                contadorMayor++;
            }

            if (numero < menor) {
                menor = numero;
                contadorMenor = 1;
            } else if (numero == menor) {
                contadorMenor++;
            }
        }

        System.out.println("El mayor numero es: " + mayor + " y aparece " + contadorMayor + " veces.");
        System.out.println("El menor numero es: " + menor + " y aparece " + contadorMenor + " veces.");

        teclado.close();
    }

}
