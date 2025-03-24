package PruebaExcpeciones;

import java.util.ArrayList;

public class AppEmpleado2 {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan"));
        empleados.add(new Empleado("Puma"));
        empleados.add(new Empleado("Puchol"));

        nuevoEmple("Puma", empleados);
        nuevoEmple("Puyol", empleados);

        System.out.println("El programa sigue ejecutandose correctamente");

        for (Empleado emp : empleados) {
            System.out.println(emp);
        }

    }

    // Recorre arraylist buscando un empleado y lanza el error si lo encuentra
    // Y si no lo encuentra lo añade al array list
    public static void nuevoEmple(String nombre, ArrayList<Empleado> empleados) throws EmpleadoExisteException {
        try {
            for (Empleado emp : empleados) {
                if (emp.getNombre().equals(nombre)) {
                    throw new EmpleadoExisteException(emp);
                }
            }
            // Si no lo encuentra lo añadimos
            empleados.add(new Empleado(nombre));
            System.out.println("Empleado añadido correctamente");
        } catch (EmpleadoExisteException e) {
            e.mostrarDatos();
        }
    }

}
