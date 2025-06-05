package EjerciciosParaExtraordinaria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TiendaAnimalesApp {

    private static List<Animal> animales = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = pedirInt();
            switch (opcion) {
                case 1:
                    registrarAnimal();
                    break;
                case 2:
                    mostrarAnimales();
                    break;
                case 3:
                    animalesComen();
                    break;
                case 4:
                    animalesJuegan();
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        } while (opcion != 5);

    }

    public static void mostrarMenu() {
        System.out.println("""
                1º Registrar nuevo animal
                2ºMostrar todos los animales registrados
                3ºHacer que todos los animales coman
                4ºHacer que todas las mascotas jueguen
                5ºSalir del programa

                Opcion:
                """);
    }

    static int pedirInt() {
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    static void animalesComen() {
        animales.forEach(Animal::comer);
    }

    static void animalesJuegan() {
        for (Animal a : animales) {
            if (a instanceof Mascota m) {
                m.jugar();
                System.out.println();
            }
        }
    }

    static void registrarAnimal() {
        int tipo;
        String nombre;
        Color color = elegirColor();
        try {

            System.out.println("Elija el animal que quiera registrar 1 Perro 2 Gato 3 Loro");
            tipo = pedirInt();
            System.out.println("Nombre: ");
            nombre = teclado.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Raza: ");
                    animales.add(new Perro(nombre, color, teclado.nextLine()));
                    break;

                case 2:
                    System.out.println("Pelaje: ");
                    animales.add(new Gato(nombre, color, teclado.nextLine()));
                    break;
                case 3:
                    System.out.println("Idioma: ");
                    animales.add(new Loro(nombre, color, teclado.nextLine()));
                    break;
                default:
                    throw new AnimalInvalidoException("Tipo de animal invalido");
            }
            System.out.println("Animal registrado correctamente");
            System.out.println();

        } catch (AnimalInvalidoException | NombreInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    static Color elegirColor() {
        System.out.println("Seleccione color:");
        Color[] colores = Color.values();
        for (int i = 0; i < colores.length; i++) {
            System.out.println((i + 1) + ") " + colores[i]);
        }
        int opcion;
        do {
            opcion = pedirInt();
        } while (opcion < 1 || opcion > colores.length);
        return colores[opcion - 1];
    }

    static void mostrarAnimales() {
        if (animales.isEmpty())
            System.out.println("No hay animales registrados");
        else
            animales.forEach(System.out::println);
        System.out.println();
    }
}
