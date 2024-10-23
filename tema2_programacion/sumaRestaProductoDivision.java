import java.util.Scanner;

public class sumaRestaProductoDivision {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        double n1 = teclado.nextDouble();
        System.out.println("Introduzca el segundo numero: ");
        double n2 = teclado.nextDouble();

        System.out.println("Su numero sumado es:" + (n1 + n2));
        System.out.println("Su numero restado es: " + (n1 - n2));
        System.out.println("Su numero multiplicado es: " + (n1 * n2));
        System.out.println("Su numero divido es: " + (n1 / n2));
    }

}
