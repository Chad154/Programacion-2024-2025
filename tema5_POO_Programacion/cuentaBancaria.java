package tema5_POO_Programacion;

public class CuentaBancaria {
    private String id;
    private double saldo;
    private String propietario;
    private String tipo;

    // constructor
    public CuentaBancaria(String i, String p, String t) {
        id = i;
        propietario = p;
        tipo = t;

    }

    // depositar
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    // retirar
    public void mostrarCuenta() {
        System.out.println("\t-----------------------");
        System.out.println("\t Datos Cuenta Bancaria");
        System.out.println("\t-----------------------");
        System.out.println("Id: " + id);
        System.out.println("Propietario: " + propietario);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo: " + tipo);

    }

}
