import java.util.Scanner;

public class Radio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el radio de la Circunferencia");
        double radio = teclado.nextDouble();

        System.out.println("La longituda del radio es:" + ((radio + radio) * Math.PI));
        System.out.println("El area del circulo es: " + (radio * radio * Math.PI));
        System.out.println("El volumen de la esfera es: " + ((4 / 3) * Math.PI * (radio * radio * radio)));

    }

}
