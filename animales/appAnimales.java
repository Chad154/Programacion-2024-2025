package animales;

import java.util.ArrayList;

public class appAnimales {

    public static void main(String[] args) {
        // Crear un objeto de la clase Perro
        ArrayList<Animal> animales = new ArrayList<Animal>();
        ArrayList<Perro> perros = new ArrayList<Perro>();

        // añaddimos elementos al arraylist
        animales.add(new Animal("blanco", 2));
        animales.add(new Animal("negro", 2));
        animales.add(new Perro("Azul", 5));
        animales.add(new Pitcher("Dorado", 7));

        // Animal a1 =new Animal(); animales.add(a1);
        for (Animal a : animales) {
            a.hacerRuido();

        }

        for (Perro a : perros) {
            a.hacerLadrido();
        } 

    }
}
