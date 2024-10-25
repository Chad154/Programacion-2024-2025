import java.util.Scanner;

public class descuento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precioInicial, precioFinal;

        System.out.println("Indicame el precio que has pagado por el articulo");
        precioFinal = teclado.nextDouble();
        System.out.println("Indicame el precio sin descuento");
        precioInicial = teclado.nextDouble();

        double descuento = (precioInicial - precioFinal) / precioInicial * 100;

        System.out.println("El descuento aplicado es: " + descuento + " %");
    }

}
