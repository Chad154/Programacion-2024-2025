import java.util.Scanner;

public class cuantosDigitosTiene {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador = 1;

        System.out.println("Introduzca el numero que quiere contar los digitos");
        numero = teclado.nextInt();

        if (numero < 0) {
            numero = -numero;
        }

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }

        System.out.println("Tiene " + contador + " digitos");

    }
}
