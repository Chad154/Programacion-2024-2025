
import java.util.Arrays;

public class recorridoArrays {

    public static void main(String[] args) {
        int[] array = { 1, 4, 5, 6, 7, 8, 3, 8 };
        // int [][] matriz = {{1,2}, {3,4,5},{0}}
        int numero = 0;

        System.out.println("El numero es: " + numero);
        // Esto no cambia
        cambiarNumero(numero, 10);

        System.out.println("Numero cambiado es: " + numero);

        System.out.println("El array principal es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println("------------------------");
        cambiarArray(array, 10);
        System.out.println("El array despues de la funcion es: ");
        for (int elemento : array) {
            System.out.println(elemento + " ");
        }

        System.out.println("Imprimimos el array con Arrays.toString");
        System.out.println(Arrays.toString(array));
    }

    static void imprimir(int[] vector) {
        // Lo mostramos
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
        System.out.println();
    }

    static void cambiarArray(int[] vector, int num) {
        // Lo incrementamos con num

        for (int i = 0; i < vector.length; i++) {
            vector[i] += num;
        }
    }

    static void cambiarNumero(int numero, int num) {
        numero += num;
    }

}
