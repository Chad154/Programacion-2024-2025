package CuentaBancaria;

public class FondoInversion extends Cuenta {
    public double interes;

    public FondoInversion(int numeroCuenta, Cliente titular) {
        super(numeroCuenta, 5000, titular);
        calcularInteres();

    }

    public double getInteres() {
        return interes;
    }

    private void calcularInteres() {
        if (saldo >= 100000)
            interes = 5;
        else if (saldo >= 50000)
            interes = 4;
        else
            interes = 2;
    }

    @Override
    public void verDatos() {
        String s = "";
        s += "Nº de Cuenta:" + numeroCuenta + "FONDO INVERSIÓN AL " + interes + " %"
                + "\n Titular: " + titular.nombreCompleto()
                + "\n Domicilio:" + titular.direccionCompleta()
                + "\n Saldo Cuenta:" + saldo + " euros"
                + "\n \t\t\tMOVIMIENTOS\n"
                + obtenerMovimientos();
        System.out.println(s);
    }
}
