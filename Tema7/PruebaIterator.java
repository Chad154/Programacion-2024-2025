package Tema7;

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaIterator {
    public static void main(String[] args) {

        ArrayList<String> ciudades = new ArrayList<>();

        ciudades.add("New York");
        ciudades.add("Rumania");
        ciudades.add("Paris");
        ciudades.add("Belgica");

        System.out.println("Ciuades");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }

        Iterator<String> it = ciudades.iterator();
        System.out.println("Ciudades con Iterator");

        // Mientras tengas datos
        while (it.hasNext()) {
            String ciudad = it.next(); // Avanza al siguiente elemento
            if (ciudad.equals("Paris")) {
                it.remove(); // Elimina "Paris" de la lista
            }
        }

        // Imprimir las ciudades restantes después de usar el iterador
        System.out.println("Ciudades restantes:");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }

    }
}
