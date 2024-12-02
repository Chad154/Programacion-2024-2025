public class arrayEntero {
    public static void main(String[] args) {

        int[] array = { 5, 6, 7, 8, 9, 10 };
        int[] array2 = { 8, 1, 2, 3, 6, 4, 9 };
        ejercicio1(array, 5);
        String[] palabras = { "Hola", "Programacion", "Juan", "Informatico" };
        ejercicio2(palabras);
        ejercicio3(palabras, 'a');
        mostrarArray(ejercicio4(array, array2));
        mostrarArray(ejercicio4_2(array, array2));
    }

    static void mostrarArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    static void ejercicio1(int[] array, int n) {

        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n)
                contador++;
        }
        if (contador == 0)
            System.out.println("El valor " + n + " no aparece en el Array.");
        else
            System.out.println("El valor " + n + " aparece " + contador + " " + (contador == 1 ? "vez" : "veces")
                    + " en el Array.");
    }

    static void ejercicio2(String[] palabras) {

        String palabraMax = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMax.length())
                palabraMax = palabras[i];
        }
        System.out.println("La palabra más larga es \"" + palabraMax + "\".");
    }

    static void ejercicio3(String[] palabras, char letra) {

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].toLowerCase().charAt(0) == Character.toString(letra).toLowerCase().charAt(0))
                System.out.println(palabras[i]);
        }
    }

    static int[] ejercicio4(int[] a, int[] b) {

        int[] c;
        if (a.length > b.length)
            c = new int[b.length];
        else
            c = new int[a.length];

        for (int i = 0; i < c.length; i++) {
            if (a[i] > b[i])
                c[i] = a[i];
            else
                c[i] = b[i];
        }
        return c;
    }

    static int[] ejercicio4_2(int[] a, int[] b) {

        int[] c;
        if (a.length > b.length)
            c = new int[a.length];
        else
            c = new int[b.length];

        for (int i = 0; i < c.length; i++) {

            if (i >= a.length)
                c[i] = b[i];
            else if (i >= b.length)
                c[i] = a[i];
            else if (a[i] > b[i])
                c[i] = a[i];
            else
                c[i] = b[i];
        }
        return c;
    }
}
