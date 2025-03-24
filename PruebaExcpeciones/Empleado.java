package PruebaExcpeciones;

public class Empleado {

    private String nombre;
    private int permanencia;
    private double salario = 1000;

    public Empleado(String nombre, int permanencia, double salario) {
        this.nombre = nombre;
        setPermanencia(permanencia);
        setSalario(salario);
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.permanencia = 0;
        this.salario = 1000;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(int permanencia) {
        if (permanencia >= 0)
            this.permanencia = permanencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1000)
            this.salario = salario;
    }

    private void mostrarClasificacion() {
        if (permanencia >= 18)
            System.out.println("Senior");
        else if (permanencia > 3)
            System.out.println("Intermedio");
        else
            System.out.println("Principiante");
    }

    public void mostrarDatos() {
        System.out.println("Nombre:" + nombre);
        System.out.print("Permanencia:");
        mostrarClasificacion();
        System.out.println("Salario:" + salario);
    }

    public void modificarSalario(double porcentaje) {
        setSalario(salario + salario * porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Empleado: " + "Nombre: " + nombre;
    }

}