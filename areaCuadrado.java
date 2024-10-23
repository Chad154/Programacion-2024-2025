import java.util.Scanner;

public class areaCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el lado del cuadrado");
        double lado = teclado.nextDouble();

        System.out.println("El lado del cuadrado es: " + lado * lado);
    }

}
