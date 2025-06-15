package EjerciciosChatGPTRepaso.RefugioAnimales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Refugio {

    private static List<Animal> animales = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("""
                        1 Añadir nuevo animal
                        2 Mostrar todos los animales
                        3 Buscar animal
                        4 Salir

                        Opcion:
                    """);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    registrarAnimal();
                    break;
                case 2:
                    mostrarAnimales();
                    break;
                case 3:
                    buscarAnimal();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion Invalida intentelo otra vez");
                    break;
            }
        } while (opcion != 4);

    }

    static void registrarAnimal() {
        int opcion;
        String nombre;
        int id;
        String tipo;
        String raza;
        String color;
        int edad;

        System.out.println("Elija una opcion 1 Añadir Perro 2 Añadir Gato");
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Introduzca el nombre del Perro");
                nombre = teclado.nextLine();
                System.out.println("Introduza el ID del animal");
                id = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Introduzca el tipo del Perro");
                tipo = teclado.nextLine();
                System.out.println("Introduzca la raza del perro");
                raza = teclado.nextLine();
                System.out.println("Introduzca el color del perro");
                color = teclado.nextLine();
                System.out.println("Introduzca la edad del perro");
                edad = teclado.nextInt();
                teclado.nextLine();

                animales.add(new Perro(id, nombre, edad, tipo, raza, color));
                System.out.println("Perro añadido correctamente");
                break;

            case 2:
                System.out.println("Introduzca el nombre del Gato");
                nombre = teclado.nextLine();
                System.out.println("Introduzca el ID del animal");
                id = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Introduzca el tipo del gato");
                tipo = teclado.nextLine();
                System.out.println("Introduzca la raza del perro");
                raza = teclado.nextLine();
                System.out.println("Introduzca el color del gato");
                color = teclado.nextLine();
                System.out.println("Introduzca la edad del gato");
                edad = teclado.nextInt();
                teclado.nextLine();

                animales.add(new Gato(id, nombre, edad, tipo, raza, color));
                break;

            default:
                break;
        }
    }

    static void mostrarAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados");
        } else
            animales.forEach(System.out::println);
    }

    static void buscarAnimal() {
        teclado.nextLine(); // limpiar buffer
        System.out.print("Introduce el nombre del animal a buscar: ");
        String nombreBuscado = teclado.nextLine().toLowerCase();

        boolean encontrado = false;
        for (Animal a : animales) {
            if (a.nombre.toLowerCase().contains(nombreBuscado)) {
                System.out.println(a);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron animales con ese nombre.");
        }
    }

}
