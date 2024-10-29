import java.util.Scanner;

public class precioFinal_Examen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String producto;
        float precioInicial, precioFinal, descuento;

        do {

            System.out.println("Introduzca el nombre del producto");
            producto = teclado.nextLine();

            if (producto.equals("TERMINAR")) {
                break;
            }

            System.out.println("Introduzca el precio inicial (sin descuento)");
            precioInicial = teclado.nextFloat();
            do {
                System.out.println( "Introduzca el porcentaje de descuento tiene que estar entre 10 y 40 inclusives (Sobre 100)");
                
                descuento = teclado.nextFloat();
                teclado.nextLine();
                
                if (descuento < 10 || descuento > 40) {
                    System.out.println("Introduzca un descuento valido");

                }
                precioFinal = precioInicial - (precioInicial * (descuento / 100));
            } while (descuento < 10 || descuento > 40);

            System.out.println("El producto: " + producto + " y su precio final: " + precioFinal);

        } while (true);

        teclado.close();

    }

}
