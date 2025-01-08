package tema5_POO_Programacion;

public class cuentaBancaria {

    private int id;
    private double saldo;
    private String propietario;
    private String tipo;

    //Constructor

    public cuentaBancaria(int i, double s, String p, String t){
        id = i;
        saldo = s;
        propietario = p;
        tipo = t;

    }

    public void obtenerDatos(){
        System.out.println("ID es " + id);
        System.out.println("Su saldo es: " + saldo);
        System.out.println("El propietario es " + propietario);
        System.out.println("El tipo de cuenta es " + tipo);
        System.out.println();
    }

    public void retirarSaldo(double s){
        saldo = saldo - s;
    }

    public void añadirSaldor(double s){
        saldo = saldo + s;
    }

 
    
}
