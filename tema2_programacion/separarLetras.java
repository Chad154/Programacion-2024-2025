import java.util.Scanner;

public class separarLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println("Escriba lo que quieras separar");
        cadena = teclado.nextLine();

        System.out.print("[");

        for (int indice = 0; indice < cadena.length(); indice++) {

            System.out.print(cadena.charAt(indice));

            if (indice < cadena.length() - 1) {
                System.out.print(" ");
            }

        }

        System.out.print("]");

        teclado.close();
    }
}
