import java.util.Scanner;

public class trianguloDibujado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int altura;

        System.out.println("Introduzca la altura");
        altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println("");
        }

    }
}
