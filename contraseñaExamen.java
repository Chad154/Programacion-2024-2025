import java.util.Scanner;

public class contraseñaExamen {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String contraseña;
        int contador = 0;

        while (contador < 3) {
            System.out.println("Escriba la contraseña");
            contraseña = teclado.nextLine();

            if (contraseña.equals("PAQUITO")) {

                System.out.println("ENHORABUENA, HAS ACCEDIDO AL SISTEMA");
                contador = 4;

            } else {

                System.out.println("Contraseña Incorrecta");
                contador++;
            }

            if (contador == 3) {

                System.out.println("LO SIENTO, CUENTA BLOQUEADA");
            }
        }

        teclado.close();
    }
}
