package tema5_POO_Programacion;

import java.util.Random;

public class appArrayPuntos {
    public static void main(String[] args) {
        // creamos 5 puntos aleatorios

        Random r = new Random();
        punto1[] puntos = new punto1[5];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i].mostrarPunto();
        }

        // obtenemos la distancia del punto más lejano del centro(0,0)
        double max = 0;
        for (int i = 0; i < puntos.length; i++) {
            if (max < puntos[i].calcularDistanciaCentro())
                max = puntos[i].calcularDistanciaCentro();
        }
        System.out.println();
        System.out.println("El punto mas lejano es ");
        System.out.println("La distancia máxima del centro es " + max);
    }

    
}
