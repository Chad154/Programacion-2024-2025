package GestionEmpleados;

public abstract class Empleado {
    protected String nombre;
    protected int DNI;
    protected double salario;

    public Empleado(String nombre, int dNI, double salario) {
        this.nombre = nombre;
        DNI = dNI;
        this.salario = salario;
    }

    public abstract void trabajar();

    @Override

    public String toString() {
        return "Nombre: " + nombre + " DNI: " + DNI + " Salario: " + salario;
    }
}
