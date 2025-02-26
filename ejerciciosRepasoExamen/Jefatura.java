package ejerciciosRepasoExamen;

public class Jefatura extends Empleado implements Jefes {

    private double incentivo;

    public Jefatura(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public void establecerIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double dameSueldo() {
        return super.dameSueldo() + incentivo;
    }

    public double darBonus(double bonus) {
        double prima = 2000;
        return Bonus.bonus_inical + bonus;

    }
}
