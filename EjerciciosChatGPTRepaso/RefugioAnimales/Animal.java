package EjerciciosChatGPTRepaso.RefugioAnimales;

public abstract class Animal {

    protected int id;
    protected String nombre;
    protected int edad;
    protected String tipo;

    public Animal(int id, String nombre, int edad, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + " ID: " + id + " Edad: " + edad + " Tipo: " + tipo;
    }

}
