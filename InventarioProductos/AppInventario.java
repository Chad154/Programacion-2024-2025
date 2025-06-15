package InventarioProductos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppInventario {
    private static Scanner teclado = new Scanner(System.in);
    private static List<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {
        try {
            int opcion;
            do {
                mostrarMenu();
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion) {
                    case 1:
                        añadirProducto();
                        break;
                    case 2:
                        buscarProducto();
                        break;
                    case 3:
                        mostrarProductos();
                        break;
                    case 4:
                        calcularStock();
                        break;
                    case 5:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opcion Invalida");
                        break;
                }
            } while (opcion != 5);
        } catch (InputMismatchException e) {
            System.out.println("Opcion no valida");
        }
    }

    public static void mostrarMenu() {
        System.out.println("""
                1 Añadir producto
                2 Buscar por nombre
                3 Mostrar todos los productos
                4 Calcular el total del stock
                5 Salir

                Opcion:
                    """);
    }

    public static void añadirProducto() {
        int id;
        String nombre;
        double precio;
        int cantidad;

        System.out.println("Introduzca el ID del producto");
        id = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el nombre del producto");
        nombre = teclado.nextLine();
        System.out.println("Introduzca el precio del producto");
        precio = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduzca la cantidad de producto");
        cantidad = teclado.nextInt();
        teclado.nextLine();

        productos.add(new Producto(id, nombre, precio, cantidad));
        System.out.println("Producto añadido correctamente");
    }

    public static void buscarProducto() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            System.out.println("Introduzca el nombre del producto que quiere buscar");
            String nombreBuscado = teclado.nextLine().toLowerCase();

            boolean encontrado = false;

            for (Producto a : productos) {
                if (a.nombre.toLowerCase().contains(nombreBuscado)) {
                    System.out.println(a);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Producto no encontrado");
            }
        }
    }

    public static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados");
            System.out.println();
        } else
            productos.forEach(System.out::println);
    }

    public static void calcularStock() {
        for (Producto a : productos) {
            double cantidad = a.precio * a.cantidad;
            System.out.println(a.nombre + " cantidad: " + cantidad);
        }
    }
}
