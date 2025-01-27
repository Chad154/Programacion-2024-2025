import java.util.Scanner;

public class menuFiguras {

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void trianguloDibujado() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println("");
        }
    }

    public static void trianguloSinRelleno() {
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

    public static void rectanguloDibujado() {
        Scanner teclado = new Scanner(System.in);
        int base, altura;

        System.out.println("Introduzca la base del rectángulo:");
        base = teclado.nextInt();

        System.out.println("Introduzca la altura del rectángulo:");
        altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        teclado.close();
    }

    public static void rectanguloSinRelleno() {
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
        teclado.close();
    }

    public static void mostrarMenu() {
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("Seleccione una opcio:\n" +
                    "1 triangulo dibujado\n" +
                    "2 triangulo sin relleno\n" +
                    "3 rectangulo dibujado\n" +
                    "4 rectangulo sin relleno\n" +
                    "5 Salir del Programa");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    trianguloDibujado();
                    break;
                case 2:
                    trianguloSinRelleno();
                    break;
                case 3:
                    rectanguloDibujado();
                    break;
                case 4:
                    rectanguloSinRelleno();
                    break;
                case 5:
                    System.out.println("Adioh");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (opcion != 5);

    }
}
