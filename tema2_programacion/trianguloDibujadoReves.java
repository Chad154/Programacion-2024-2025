import java.util.Scanner;

public class trianguloDibujadoReves {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int altura;
        char caracater;

        System.out.println("Introduzca la altura");
        altura = teclado.nextInt();
        System.out.println("Introduzca el caracater que quiere utlizar");
        caracater = teclado.next().charAt(0);
        System.out.println("");

        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracater);
            }
            System.out.println("");
        }
    }

}
