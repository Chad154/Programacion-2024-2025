package herencia;

public class Humano {

    String nombre;
    int edad;

    public Humano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println(nombre);
    }

    public void mostrarInfo() {
        System.out.println("Humano: " + nombre + " tiene una edad de: " + edad);
    }
}
