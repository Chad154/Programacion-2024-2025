package EjerciciosRefuerzoPOO_EXCEPCIONES;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Date;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimiento> movimientos;

    // constructores
    public Cuenta(int numeroCuenta, double saldo, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        // se crea el arrayList de movimientos vacío
        this.movimientos = new ArrayList<Movimiento>();
    }

    // getters-setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    // métodos
    public void ingresar(double cantidad) {
        // comprobamos que la cantidad >0
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser mayor que cero");
            return;
        }
        // actualizo saldo
        saldo += cantidad; // saldo= saldo+cantidad
        // creo el movimiento
        movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.INGRESO));
    }

    public void retirar(double cantidad) {
        // comprobamos que la cantidad >0
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser mayor que cero");
            return;
        }
        // comprobamos que hay saldo suficiente
        if (saldo < cantidad) {
            System.out.println("Error: no hay saldo suficiente");
            return;
        }
        // retiramos el dinero
        saldo -= cantidad;
        // creamos el movimiento
        movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.RETIRO));

    }

    private String obtenerMovimientos() {
        String s = "";
        for (Movimiento m : movimientos) {
            s += m.toString() + "\n";
        }
        return s;
    }

    public void verDatos() {
        String s = "";
        s += "Nº de Cuenta:" + numeroCuenta
                + "\n Titular: " + titular.nombreCompleto()
                + "\n Domicilio:" + titular.direccionCompleta()
                + "\n Saldo Cuenta:" + saldo + " euros"
                + "\n \t\t\tMOVIMIENTOS\n"
                + obtenerMovimientos();
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Número de cuenta: " + numeroCuenta + " - Titular: " + titular.nombreCompleto();
    }

    private class Movimiento {
        private static final byte INGRESO = 0;
        private static final byte RETIRO = 1;
        // tipo = Movimientos.INGRESO
        // tipo = 0;
        private LocalDateTime fechaHora;
        private double importe;
        private double saldoFinal;
        private byte tipo;

        // constructor
        private Movimiento(LocalDateTime fechaHora, double importe, byte tipo) {
            this.fechaHora = fechaHora;
            this.importe = importe;
            saldoFinal = saldo;
            this.tipo = tipo;
        }

        // metodo
        @Override
        public String toString() {
            return (tipo == INGRESO ? "INGRESO" : "RETIRO")
                    + " FECHA: " + fechaHora.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))
                    + " HORA: " + fechaHora.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM))
                    + " Importe:" + importe + " euros"
                    + " Saldo Final:" + saldoFinal + " euros";

        }

    }

}
