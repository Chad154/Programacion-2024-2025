public class EjercicioMatricesInversa {

    public static void main(String[] args) {

        int n = 4;
        String[][] matriz = crearMatriz(n);

        System.out.println("Matriz de " + n + "x" + n + ":");
        imprimirMatriz(matriz);

    }

    static void imprimirMatriz(String[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }

    }

    static String[][] crearMatriz(int n) {

        String[][] matriz = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    matriz[i][j] = "x";
                } else {
                    matriz[i][j] = "-";
                }
            }
        }
        return matriz;
    }

}
