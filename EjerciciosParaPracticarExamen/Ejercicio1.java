/*Ejercicio 1: Sumar los elementos de un array
Enunciado: Escribe un programa que reciba un array de números enteros y calcule la suma de todos sus elementos. Muestra el resultado en consola.*/

public class Ejercicio1 {

    public static void main(String[] args) {

        int numero[] = { 1, 1, 1, 1};
        int suma = 0;
        for (int i : numero) {
            suma = suma + i;

        }
        System.out.println(suma);

    }
}