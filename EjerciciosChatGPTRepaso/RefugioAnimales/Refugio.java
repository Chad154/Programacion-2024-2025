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

                animales.add(new Perro(id, nombre, id, tipo, raza, color));
                System.out.println("Perro añadido correctamente");
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
}
