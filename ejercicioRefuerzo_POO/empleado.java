package ejercicioRefuerzo_POO;

public class empleado {

    private String nombreCompleto;
    private int permanecia;
    private double salario = 1000;

    public empleado() {

    }

    public empleado(String nombreCompleto, int permanencia, double salario) {
        this.nombreCompleto = nombreCompleto;
        setPermanecia(permanencia);
        setSalario(salario);
    }

    // metodo get y set de Nombre Completo

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // Metodo get y set de Permanencia

    public int getPermanecia() {
        return permanecia;
    }

    public void setPermanecia(int permanecia) {
        if (permanecia >= 0)
            this.permanecia = permanecia;

    }

    // metodo get y set de salario

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1000)
            this.salario = salario;
    }

    public void permanecia() {
        if (permanecia <= 3) {
            System.out.println("Usted es principiante");
        }
        if (permanecia > 3 && permanecia < 18) {
            System.out.println("Usted es intermedio");

        }
        if (permanecia >= 18)

            System.out.println("Usted es senior");
    }

    public void mostrarEmpleado() {

        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Permanencia: " + permanecia);
        System.out.println("Salario: " + salario);
    }

    public void modificarSueldo(double porcentaje) {
        setSalario(salario+salario*porcentaje/100);

    }
}
