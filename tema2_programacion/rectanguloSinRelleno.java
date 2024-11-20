import java.util.Scanner;

public class rectanguloSinRelleno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura;

        System.out.println("Introduzca la base del rectángulo:");
        base = teclado.nextInt();

        System.out.println("Introduzca la altura del rectángulo:");
        altura = teclado.nextInt();

      
        for (int i = 0; i < altura; i++) { 

            for (int j = 0; j < base; j++) { 

                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) { 
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
