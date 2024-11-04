import java.util.Scanner;

public class contraseñaExamen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String contraseña;
        int contador = 0;

        do {

            System.out.println("Escriba la contraseña");
            contraseña = teclado.nextLine();
            if (contraseña.equals("PAQUITO")) {
                System.out.println("ENHORABUENA, HAS ACCEDIDO AL SISTEMA");
                break;
            } else if (contador == 3) {
                System.out.println("LO SIENTO, CUENTA BLOQUEADA");
                break;
            } else {
                System.out.println("Contraseña Incorrecta");
                contador++;
            }
        } while (true);

        teclado.close();
    }
}
