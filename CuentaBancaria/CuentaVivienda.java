package CuentaBancaria;

public class CuentaVivienda extends Cuenta {

    public CuentaVivienda(int numeroCuenta, Cliente titular) {
        super(numeroCuenta, 1000, titular);
    }

    public void verDatos() {
        String s = "";
        s += "Nº de Cuenta:" + numeroCuenta + "CUENTA VIVIENDA"
                + "\n Titular: " + titular.nombreCompleto()
                + "\n Domicilio:" + titular.direccionCompleta()
                + "\n Saldo Cuenta:" + saldo + " euros"
                + "\n \t\t\tMOVIMIENTOS\n"
                + obtenerMovimientos();
        System.out.println(s);
    }

}
