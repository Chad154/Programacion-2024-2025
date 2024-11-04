import java.util.Scanner;

public class PrecioFinalExamen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String producto;
        float precioInicial, precioFinal, descuento;

        System.out.println("Introduzca el nombre del producto (TERMINAR para salir):");
        producto = teclado.nextLine();

        while (!producto.equals("TERMINAR")) {

            System.out.println("Introduzca el precio inicial (sin descuento):");
            precioInicial = teclado.nextFloat();

            System.out.println("Introduzca el porcentaje de descuento (entre 10 y 40 inclusives):");
            descuento = teclado.nextFloat();

            
            if (descuento < 10 || descuento > 40) {
                System.out.println("Porcentaje no valido. No hay calculo para " + producto);
                
            } else {
                precioFinal = precioInicial - (precioInicial * (descuento / 100));
                System.out.println("El producto: " + producto + " y su precio final: " + precioFinal);
            }

            teclado.nextLine();

            System.out.println("Introduzca el nombre del producto (TERMINAR para salir):");
            producto = teclado.nextLine();
        }

        teclado.close();
    }
}
