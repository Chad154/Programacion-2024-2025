package tema5_POO_Programacion;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;
    private String ciudad;
    private String profesion;
     
//constructor
    public Persona( String n, String d, int e){
        nombre = n;
        dni = d;
        edad = e;
        ciudad = "Pozuelo de Alarcón";
        profesion = "Estudiante";
    }
    public void obtenerDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("DNI: "+ dni);
        System.out.println("Edad: "+ edad);
        System.out.println("Ciudad: "+ ciudad);
        System.out.println("Profesión: "+ profesion);

    }
    public void cambiarProfesion(String p)
    {
        profesion=p;
    }
    public void cambiarNombre(String n)
    {
        nombre=n;
    }
    public void modificarCiudad(String c)
    {
        ciudad=c;
    }
}