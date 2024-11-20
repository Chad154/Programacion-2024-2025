import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static int cubo(int numero) {
        return numero * numero * numero;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static void tablaMultiplicar(int num1) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " * " + i + " = " + multiplicar(num1, i));
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarMenu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Saludar");
            System.out.println("2. Calcular el cubo de un numero");
            System.out.println("3. Multiplicar dos numero");
            System.out.println("4. Mostrar tabla de multiplicar de un numero");
            System.out.println("5. Verificar si un numero es par");
            System.out.println("6. Salir");
            System.out.print("Elige una opcon: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce tu nombre: ");
                    String nombre = teclado.next();
                    saludar(nombre);
                    break;
                case 2:
                    System.out.print("Introduce el numero para calcular su cubo: ");
                    int numCubo = teclado.nextInt();
                    System.out.println("El cubo de " + numCubo + " es: " + cubo(numCubo));
                    break;
                case 3:
                    System.out.print("Introduce el primer numero: ");
                    int num1 = teclado.nextInt();
                    System.out.print("Introduce el segundo numero: ");
                    int num2 = teclado.nextInt();
                    System.out.println("La multiplicacion es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Introduce el numero para ver su tabla de multiplicar: ");
                    int numero = teclado.nextInt();
                    tablaMultiplicar(numero);
                    break;
                case 5:
                    System.out.print("Introduce el numero para ver si es par: ");
                    int numPar = teclado.nextInt();
                    if (esPar(numPar)) {
                        System.out.println(numPar + " es par.");
                    } else {
                        System.out.println(numPar + " es impar.");
                    }
                    break;
                case 6:
                    System.out.println("Adioh");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
        teclado.close();
    }
   
}
