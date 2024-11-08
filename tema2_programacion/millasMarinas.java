import java.util.Scanner;

public class millasMarinas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el numero de millas a cambiar a metros: ");
        int millas = teclado.nextInt();

        System.out.println("Las millas marinas convertidas a metros son: " + (millas * 1852) + " m");
        teclado.close();
    }

}
