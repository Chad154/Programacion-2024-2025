package ejerciciosRepasoExamen;

public class Jefatura extends Empleado {

    private double incentivo;

    public Jefatura(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public void establecerIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double dameSueldo(){
        return super.dameSueldo() + incentivo;
    }
}
