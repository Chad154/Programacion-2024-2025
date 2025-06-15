package GestionEmpleados;

public class Disenador extends Empleado implements Informatico {
    protected String herramienta;

    public Disenador(String nombre, int dNI, double salario, String herramienta) {
        super(nombre, dNI, salario);
        this.herramienta = herramienta;
    }

    @Override
    public void trabajar() {
        System.out.println("El diseñador: " + nombre + " esta diseñando en " + herramienta);
    }

    @Override
    public void compilar() {
        System.out.println("El programdor: " + nombre + " esta compilando");
    }
}
