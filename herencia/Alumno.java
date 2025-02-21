package herencia;

public class Alumno extends Humano {
    private int creditos;

    public Alumno(String nombre, int edad, int creditos) {
        super(nombre, edad);
        this.creditos = creditos;
        System.out.println(" tiene una edad de: " + edad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre + " tiene una edad de: " + edad + " y " + creditos + " créditos.");
        super.mostrarInfo();
    }
}