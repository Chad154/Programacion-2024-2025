package herencia;

public class Alumno extends Humano {
    int edad;
    public Alumno(int edad,String humano, String hija){
        super(humano);
        this.edad = edad;
        System.out.println(" tiene una edad de: " + edad);
    }

    public void mostrarInfo(){
        System.out.println("Alumno: " + nombre + " tiene una edad de: " + edad);
        super.mostrarInfo();
    }
}