public class Alumno extends PersonaCentroEducativo implements Comparable<Alumno> {
    private String nombre;
    private String nia;
    private int edad;

    // constructores
    public Alumno(String nombre, String nia, int edad) {
        super(nombre);
        this.nia = nia;
        this.edad = edad;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // ordenamos por edad, de menor a mayor, y luego por nombre

    @Override
    public int compareTo(Alumno a) {
        int comparacion = Integer.compare(this.edad, a.edad);
        if (comparacion == 0)
            comparacion = this.nombre.compareTo(a.nombre);
        return comparacion;
    }

    @Override
    public String toString() {
        return "Alumno: (nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + ")";
    }

}