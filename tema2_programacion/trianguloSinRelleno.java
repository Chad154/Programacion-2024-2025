import java.util.Scanner;

public class trianguloSinRelleno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int altura;

        System.out.println("Introduzca la altura:");
        altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == altura - 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
