import java.util.Scanner;

public class peso_medioExamen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer peso: ");
        float peso1 = teclado.nextFloat();

        System.out.print("Introduzca el segundo peso: ");
        float peso2 = teclado.nextFloat();

        System.out.print("Introduzca el tercer peso: ");
        float peso3 = teclado.nextFloat();

        float media = (peso1 + peso2 + peso3) / 3;

        System.out.println("La media de peso de los 3 es: " + media);

        if (media < 70) {
            System.out.println("Ningun problema para llevaros");

        }

        else if (media > 100) {
            System.out.println("Ups, Alguno se tiene que bajar");
        } else {
            System.out.println("Subimos pero me va costar");
        }
        teclado.close();

    }
}
