/*Ejercicio 5: Conversión de temperaturas
Enunciado: Crea un programa que reciba una temperatura en grados Celsius y la convierta a Fahrenheit y Kelvin. Muestra los resultados en consola. */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int temperatura;

        System.out.println("Introduzca los grados Celsius que quiere convertir");
        temperatura = teclado.nextInt();

        System.out.println(temperatura + " º" + " son " + (temperatura + 273.15) + " K");
        System.out.println(temperatura + " º" + " son " + (temperatura * 9 / 5 + 32));
    }

}
