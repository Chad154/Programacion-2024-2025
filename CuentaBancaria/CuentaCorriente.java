package CuentaBancaria;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int numeroCuenta, Cliente titular) {
        super(numeroCuenta, 0, titular);
    }

    public void verDatos() {
        String s = "";
        s += "Nº de Cuenta:" + numeroCuenta + "CUENTA CORRIENTE"
                + "\n Titular: " + titular.nombreCompleto()
                + "\n Domicilio:" + titular.direccionCompleta()
                + "\n Saldo Cuenta:" + saldo + " euros"
                + "\n \t\t\tMOVIMIENTOS\n"
                + obtenerMovimientos();
        System.out.println(s);
    }
}
