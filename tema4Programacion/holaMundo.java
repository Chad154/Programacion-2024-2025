public class holaMundo {

    public static void main(String... args) {
        System.out.println("args [] tiene longitud " + args.length);
        System.out.print("Hola");

        // Recorremos el Array de String args

        for (int i = 0; i < args.length; i++) {
            System.out.print(" " + args[i]);
        }

        System.out.println(" Hola Prieto");

        sumar(3);
        sumar(4, 7);
        sumar(12, 43, 23, 432, 23, 23, 45, 2, 1, 67, 86);

    }

    static void sumar(int... numeros) {

        System.out.println("La suma es:");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println(suma);
    }

}
