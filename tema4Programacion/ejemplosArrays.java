public class ejemplosArrays {

    public static void main(String[] args) {

        int[] vector = new int[6];
        int[] arrayClonado;
        int[] arrayCopiado;

        // Lo mostramos
        imprimir(vector);

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        // Lo mostramos
        System.out.print("El vector es: ");
        imprimir(vector);

        System.out.print("El array clonado es: ");
        arrayClonado = vector.clone();
        arrayCopiado = vector;
        imprimir(arrayClonado);

        // Modifico el primer elemento del vector

        vector[0] = -1;
        System.out.print("El vector original es: ");
        imprimir(vector);
        System.out.print("El array clonado es: ");
        imprimir(arrayClonado);
       
        arrayCopiado[0] = 0;
        System.out.print("El vector original es: ");
        imprimir(vector);
        System.out.print("El vector copiado es: ");
        imprimir(arrayCopiado);


    }

    static void imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
