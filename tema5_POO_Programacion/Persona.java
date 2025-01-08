package tema5_POO_Programacion;

public class Persona {

    String nombre;
    String dni;
    int edad;
    String ciudad;
    String profesion;

    // Contrstuctor

    public Persona(String s, String d, int n) {
        nombre = s;
        dni = d;
        edad = n;
        ciudad = "Pozuelo de Alarcon";
        profesion = "Estudiante";
    }

    public void obtenerDatos() {

        System.out.println("Nombre " + nombre);
        System.out.println("DNI " + dni);
        System.out.println("Edad " + edad);
        System.out.println("Ciudad " + ciudad);
        System.out.println("Profesion " + profesion);
        System.out.println();
    }

    public void cambiarProfesion(String p) {
        profesion = p;
    }

    public void modificarCiudad(String c) {
        ciudad = c;
    }

    public void cambiarNombre(String n){
        nombre = n;
    }
}
