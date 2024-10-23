import java.util.Scanner;

public class leerNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba el numero (Entero) que quiere mostrar ");
        int numeroEntero = teclado.nextInt();// Se puede hacer lo mismo con long .nextLong()
        System.out.print("Introduzca su nombre: ");
        
        /*
         * Se pone un .nextLine antes del String porque al dar al Enter el bufer
         * recogeria el Enter como el String
         * al hacer el .nextline antes hacemos que el bufer guarde el Enter antes para
         * que pongamos el nombre.
         * Tambien se puede solucionar poniendo el String antes que el Int
         */

        teclado.nextLine();
        String nombre = teclado.nextLine();
        System.out.print("Escriba el numero(decimal) que quiere mostrar: ");
        double numeroDecimal = teclado.nextDouble();// Se puede hacer lo mismo con float .nextFloat()

        System.out.println("Su numero entero es: " + numeroEntero);
        System.out.println("Su numero decimal es: " + numeroDecimal);

        teclado.close();
    }

}
