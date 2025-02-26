package ejerciciosRepasoExamen;

public class Empleado implements Jefes {

    private String nombre;
    protected double sueldo;
    private static int IDsiguiente = 1;
    private int ID;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        ID = IDsiguiente++;
    }

    public Empleado(String nombre) {
        this(nombre, 1200);
    }

    // Métodos get

    public String dameNombre() {
        return nombre;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public int DameID() {
        return ID;
    }

    // Métodos set

    public void setID(int iD) {
        ID = iD;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        }
    }

    @Override
    public void darOrdenes(String orden) {
        String respuesta = "Orden recibida: " + orden;
        System.out.println(respuesta);
    }

    public double darBonus(double bonus) {
        return Bonus.bonus_inical + bonus;
    }
}
