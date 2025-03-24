package PruebaExcpeciones;

public class EmpleadoExisteException extends RuntimeException {

    private Empleado empleado;

    public EmpleadoExisteException(Empleado empleado) {
        this.empleado = empleado;

    }

    public String toString() {
        return "El empleado " + this.empleado.getNombre() + " ya existe";
    }

    public void mostrarDatos() {
        System.out.println("Error: " + toString());
    }
}
