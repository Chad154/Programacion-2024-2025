import java.util.Scanner;

public class mayorEdad {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Escribir usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }

        teclado.close();
    }
}
