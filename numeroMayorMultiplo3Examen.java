import java.util.Scanner;

public class numeroMayorMultiplo3Examen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int nVeces, numeros, i, maximo = -100000;

        System.out.println("Introduce el numero de numeros a comparar");
        nVeces = teclado.nextInt();

        for (i = 0; i < nVeces; i++) {

            System.out.println("Introduce al numero a comparar");
            numeros = teclado.nextInt();

            if (numeros % 3 == 0) {
                if (numeros > maximo) {
                    maximo = numeros;

                }
            }

        }

        if (maximo != -100) {
            System.out.println("El numero maximo multiplo de 3 es: " + maximo);
        } else {
            System.out.println("No has introducido ningun numero multiplo de 3");
        }

    }

}
