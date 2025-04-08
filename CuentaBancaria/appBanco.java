package CuentaBancaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class appBanco {
    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();
    private static int contador = 1;
    private static Cuenta cuentaActiva;

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            menuPrincipal();
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    crearCuenta();
                    break;
                case 3:
                    elegirCuenta();
                    break;
                case 4:
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("Opción no válida (seleccione un número entre 1 y 4 )");
                    break;
            }

        }
        entrada.close();

    }

    static void menuPrincipal() {
        String s = "\t\t\t MENÚ PRINCIPAL" +
                "\n\t1 - Crear Cliente" +
                "\n\t2 - Crear Cuenta" +
                "\n\t3 - Mantenimiento de cuenta" +
                "\n\t4 - Salir ";
        System.out.println(s);
    }

    static void crearCliente() {
        System.out.println("Introduce el nombre del cliente...");
        String nombre = entrada.nextLine();
        System.out.println("Introduce los apellidos del cliente...");
        String apellidos = entrada.nextLine();
        System.out.println("Introduce la dirección del cliente...");
        String direccion = entrada.nextLine();
        System.out.println("Introduce la localidad del cliente...");
        String localidad = entrada.nextLine();
        System.out.println("Introduce la fecha de nacimiento del cliente (AAAA-MM-DD)...");
        String fecha = entrada.nextLine();
        clientes.add(new Cliente(nombre, apellidos, direccion, localidad, LocalDate.parse(fecha)));
        System.out.println("El cliente " + nombre + " " + apellidos + " se ha creado correctamente");
    }

    static void crearCuenta() {
        // comprobar si hay clientes, si no hay: mensaje y volver al menu
        if (clientes.isEmpty()) {
            System.out.println("Primero debe crear un cliente");
            return;
        }
        // llamamos a validar Cliente (pide nombre y lo valida en el array)
        Cliente cliente = validarCliente();
        // llamamos a validar Cuenta, que crea la cuenta
        Cuenta cuenta = validarCuenta(cliente);
        // añado la cuenta al arrayList
        cuentas.add(cuenta);
        System.out.println("Creada la " + cuenta);
    }

    static Cliente validarCliente() {
        String nombre;
        while (true) {
            System.out.println("Introduce el nombre del cliente que quiere abrir la cuenta:");
            for (Cliente c : clientes) {
                System.out.println(c.getNombre());
            }
            nombre = entrada.nextLine();
            for (Cliente c : clientes) {
                if (c.getNombre().equalsIgnoreCase(nombre))
                    return c;
            }
        }
    }

    static void elegirCuenta() {
        // Si no hay cuentas, mensaje y volvemos al programa
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas, debe crear una");
            return;
        }

        // Si hay cuentas, las mostramos
        int numCuenta;
        boolean cuentaEncontrada = false; // Variable para controlar la salida del bucle
        while (!cuentaEncontrada) {
            System.out.println("Seleccione número de cuenta:");
            for (Cuenta c : cuentas) {
                System.out.println(c); // Imprime las cuentas disponibles
            }
            numCuenta = Integer.parseInt(entrada.nextLine());
            for (Cuenta c : cuentas) {
                if (c.getNumeroCuenta() == numCuenta) {
                    cuentaActiva = c;
                    cuentaEncontrada = true; // Salimos del bucle
                    break;
                }
            }
            if (!cuentaEncontrada) {
                System.out.println("Número de cuenta no válido. Inténtelo de nuevo.");
            }
        }

        // Llamamos a seleccionarOpcionCuenta() después de seleccionar una cuenta válida
        seleccionarOpcionCuenta();
    }

    static Cuenta validarCuenta(Cliente cliente) {
        int opcion;
        Cuenta cuenta;
        while (true) {
            menuTipoCuenta();
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    cuenta = new CuentaCorriente(contador++, cliente);
                    return cuenta;
                case 2:
                    cuenta = new CuentaVivienda(contador++, cliente);
                    return cuenta;
                case 3:
                    cuenta = new FondoInversion(contador++, cliente);
                    return cuenta;
            }
        }

    }

    static void seleccionarOpcionCuenta() {
        int opcionCuenta = 0;
        while (opcionCuenta != 4) {
            menuCuenta();
            opcionCuenta = Integer.parseInt(entrada.nextLine());
            switch (opcionCuenta) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    cuentaActiva.verDatos();
                    break;
                case 4:
                    System.out.println("Volver al menú principal");
                    break;
                default:
                    System.out.println("Opción no válida (ingrese un valor entre 1 y 4)");
            }
        }
    }

    static void menuCuenta() {
        String s = "\t\t\t MENÚ CUENTA" +
                "\n\t1 - Ingresar" +
                "\n\t2 - Retirar" +
                "\n\t3 - Ver datos de la cuenta" +
                "\n\t4 - Volver al menú principal ";
        System.out.println(s);
    }

    static void menuTipoCuenta() {
        String s = "\t\t\t ELIJA EL TIPO DE CUENTA A CREAR" +
                "\n\t1 - Cuenta Corriente" +
                "\n\t2 - Cuenta Vivienda" +
                "\n\t3 - Fondo de Inversión";
        System.out.println(s);
    }

    static void ingresar() {
        System.out.println("Introduzca la cantidad a ingresar...");
        double cantidad = Double.parseDouble(entrada.nextLine());
        // llamamos al método ingresar de la cuenta
        cuentaActiva.ingresar(cantidad);
    }

    static void retirar() {
        System.out.println("Introduzca la cantidad a retirar...");
        double cantidad = Double.parseDouble(entrada.nextLine());
        // llamamos al método ingresar de la cuenta
        cuentaActiva.retirar(cantidad);
    }

}
