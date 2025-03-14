package Solucion_Examen_2EV;

public class Coche extends Vehiculo implements Transportable {

    private int numeroPuertas;
    private boolean esElectrico;

    public Coche(String marca, String modelo, int anio, int numeroPuertas, boolean esElectrico) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
        this.esElectrico = esElectrico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion del coche: ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Numero de puertas: " + numeroPuertas);
        System.out.println("Es electrico: " + (esElectrico ? "SI" : "NO"));
    }

    @Override
    public void mostrarVelocidad(int velocidad) {
        System.out.println("El coche esta circulando a velocidad " + velocidad + " KM/H");
    }

    @Override
    public void cargar(int peso) {
        System.out.println("Se ha cargado un peso de " + peso + "KG en el coche");
    }

    @Override
    public void descargar() {
        System.out.println("Se ha descargado el peso");
    }
}
