package GestionEmpleados;

public class Programador extends Empleado implements Informatico {
    protected String lenguaje;

    public Programador(String nombre, int dNI, double salario, String lenguaje) {
        super(nombre, dNI, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public void trabajar() {
        System.out.println("El programador: " + nombre + " esta programando en " + lenguaje);
    }

    @Override
    public void compilar() {
        System.out.println("El programdor: " + nombre + " esta compilando");
    }
}
