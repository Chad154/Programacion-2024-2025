package GestionEmpleados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppGestionEmpleados {

    public static List<Empleado> empleados = new ArrayList<>();
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

    }

    void mostrarMenu() {
        System.out.println("""
                1º Registrar Empleado
                2º Mostrar Empleados
                3º Hacer que trabajen
                4º Hacer que los informaticos compilen
                5º Salir

                Opcion:
                """);
    }

    public void mostrarEmpleado() {
        empleados.forEach(System.out::println);
    }

    public void trabajar() {
        empleados.forEach(Empleado::trabajar);
    }

    public void registrarNuevoEmpleado() {
        int opcion;
        String nombre;
        int DNI;
        double salario;
        String lenguaje;
        String herramienta;
        System.out.println("Introduzca que tipo de empleado quiere regristar 1 Programador 2 Disenador");
        opcion = pedirInt();
        switch (opcion) {
            case 1:

                System.out.println("Introduzca el nombre del empleado: ");
                nombre = teclado.nextLine();
                System.out.println("Introduzca el DNI del empleado: ");
                DNI = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Introduzca el salario del empleado: ");
                salario = teclado.nextDouble();
                teclado.nextLine();
                System.out.println("Introduzca el lenguaje del programador: ");
                lenguaje = teclado.nextLine();
                empleados.add(new Programador(nombre, DNI, salario, lenguaje));
                System.out.println("El empleado ha sido añadido correctamente");

                break;
            case 2:
                System.out.println("Introduzca el nombre del empleado: ");
                nombre = teclado.nextLine();
                System.out.println("Introduzca el DNI del empleado: ");
                DNI = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Introduzca el salario del empleado: ");
                salario = teclado.nextDouble();
                teclado.nextLine();
                System.out.println("Introduzca la herramienta del diseñador: ");
                herramienta = teclado.nextLine();
                empleados.add(new Disenador(nombre, DNI, salario, herramienta));
            case 3:
                System.out.println("Adioh");
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
    }

    public static int pedirInt() {
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }

    }

    public void compilar() {

    }

    static Departamento elegirDepartamento() {
        System.out.println("Elija el departamento en el que esta el Empleado: ");
        Departamento[] departamentos = Departamento.values();

        for (int i = 0; i < departamentos.length; i++) {
            System.out.println((i + 1) + ") " + departamentos[i]);
        }

        int opcion;
        do {
            opcion = pedirInt();
        } while (opcion < 1 || opcion > departamentos.length);
        return departamentos[opcion - 1];
    }
}
