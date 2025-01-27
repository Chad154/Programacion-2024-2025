public class arrayBidimensional {
    public static void main(String[] args) {
        // Definir un array bidimensional
        int[][] arrayBidimensional = {
                { 1, 2, 3 }, // Fila 0
                { 4, 5, 6 }, // Fila 1
                { 7, 8, 9 } // Fila 2
        };

        // Recorrer el array bidimensional
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
            System.out.println("Hola mundo"); // Esto imprime "Hola mundo" después de cada fila
        }
    }
}
