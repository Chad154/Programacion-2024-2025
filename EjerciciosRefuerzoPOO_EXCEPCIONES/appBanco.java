package EjerciciosRefuerzoPOO_EXCEPCIONES;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class appBanco {

    private static Scanner teclado = new Scanner(System.in);

    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();
    private static int contador;

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            menuPrincipal();
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    crearCuenta();
                    break;
                case 3:
                    mantenimentoCuenta();
                    break;
                case 4:
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("Opcion NO valida (Seleccione un numero del 1 al 4)");
                    break;
            }
        }
        teclado.close();
    }

    private static void menuPrincipal() {
        String s = """
                    MENU PRINCIPAL
                    1 - Crear Cliente
                    2 - Crear Cuenta
                    3 - Mantenimiento Cuenta
                    4 - Salir
                """;
        System.out.println(s);
    }

    private static void crearCliente() {
        System.out.println("Introduce el nombre del Cliente");
        String nombre = teclado.nextLine();

        System.out.println("Introduce los apellidos del Cliente");
        String apellidos = teclado.nextLine();

        System.out.println("Introduce el dirreccion del Cliente");
        String dirrecion = teclado.nextLine();

        System.out.println("Introduce la localidad del Cliente");
        String localidad = teclado.nextLine();

        System.out.println("Introduce la fecha de nacimiento del Cliente (AAAA-MM-DD)");
        String fecha = teclado.nextLine();

        clientes.add(new Cliente(nombre, apellidos, dirrecion, localidad, LocalDate.parse(fecha)));
        System.out.println("Cliente añadido correctamente");
    }

    private static void crearCuenta() {

        // Comprobar si hay clientes, si no hay mensaje y volver al Programa Principal

        if (clientes.isEmpty()) {
            System.out.println("Primero debe crear un cliente");
            return;
        }
        String nombre;
        Cliente cliente;
        do {
            System.out.println("Introduce el nombre del cliente que quiere abrir una cuenta");
            for (Cliente c : clientes) {
                System.out.println(c.getNombre());
            }
            nombre = teclado.nextLine();
            cliente = validarCliente(nombre);
        } while (cliente == null);

        // crear la cuenta

        cuentas.add(new Cuenta(contador, contador, cliente));
    }

    private static void mantenimentoCuenta() {
        // Si no hay cuents, mensaje y volvemos

        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas debe crear una");
            return;
        }
        // Si hay cuentas las mostramos
        int numCuenta;
        do {
            System.out.println("Seleccione el numero de cuenta");
            for (Cuenta c : cuentas) {
                System.out.println(c);
            }
            numCuenta = Integer.parseInt(teclado.nextLine());
        } while (!validarCuenta(numCuenta));
        opcionCuenta();
    }

    private static Cliente validarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado. Inténtelo de nuevo.");
        return null;
    }

    private static boolean validarCuenta(int numCuenta) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta() == numCuenta) {
                return true;
            }
        }
        return false;
    }

    private static void opcionCuenta() {
        System.out.println("Introduce el número de cuenta para realizar operaciones:");
        int numCuenta = Integer.parseInt(teclado.nextLine());

        // Buscar la cuenta seleccionada
        Cuenta cuentaSeleccionada = null;
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numCuenta) {
                cuentaSeleccionada = cuenta;
                break;
            }
        }

        if (cuentaSeleccionada == null) {
            System.out.println("Cuenta no encontrada. Inténtelo de nuevo.");
            return;
        }

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("""
                        OPCIONES DE CUENTA
                        1 - Ingresar dinero
                        2 - Retirar dinero
                        3 - Ver datos de la cuenta
                        4 - Salir
                    """);
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la cantidad a ingresar:");
                    double cantidadIngreso = Double.parseDouble(teclado.nextLine());
                    cuentaSeleccionada.ingresar(cantidadIngreso);
                    System.out.println("Ingreso realizado con éxito.");
                    break;
                case 2:
                    System.out.println("Introduce la cantidad a retirar:");
                    double cantidadRetiro = Double.parseDouble(teclado.nextLine());
                    cuentaSeleccionada.retirar(cantidadRetiro);
                    System.out.println("Retiro realizado con éxito.");
                    break;
                case 3:
                    cuentaSeleccionada.verDatos();
                    break;
                case 4:
                    System.out.println("Saliendo de las opciones de la cuenta...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }
}
