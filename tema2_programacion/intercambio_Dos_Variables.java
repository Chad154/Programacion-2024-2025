import java.util.Scanner;

public class intercambio_Dos_Variables {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c;

        System.out.println("Introduzca el primer numero para intercambiar");
        int x = teclado.nextInt();
        System.out.println("Introduzca el segundo numero para intecambiar");
        int y = teclado.nextInt();

        System.out.println("Las variables inicales son x = " + x + " y = " + y);

        c = x;
        x = y;
        y = c;

        System.out.println("Las variables cambidas son: x = " + x + " y = " + y);

        teclado.close();
    }

}
