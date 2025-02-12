package herencia;

public class Humano {

    String nombre;

    public Humano(String  nombre){
        this.nombre = nombre;
        System.out.println(nombre);
    }

    public void mostrarInfo(){
        System.out.println("Humano: " + nombre);
    }
}
