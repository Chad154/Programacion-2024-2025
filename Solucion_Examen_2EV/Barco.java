package Solucion_Examen_2EV;

public class Barco extends Vehiculo implements Transportable {

    double eslora;
    boolean tieneVelas;

    public Barco(String marca, String modelo, int anio, double eslora, boolean tieneVelas) {
        super(marca, modelo, anio);
        this.eslora = eslora;
        this.tieneVelas = tieneVelas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion del Barco: ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Eslora: " + eslora);
        System.out.println("Tiene velas: " + (tieneVelas ? "SI" : "NO"));
        System.out.println("");

    }

    @Override
    public void mostrarVelocidad(int velocidad) {
        System.out.println("El barco esta navegando a " + velocidad + " nudos");
    }

    @Override
    public void cargar(int peso) {
        System.out.println("Se ha cargado un peso de " + peso + "KG en el barco");
    }

    @Override
    public void descargar() {
        System.out.println("Se ha descargado el barco");
    }

    public boolean esDeportivo() {
        return eslora > 10.2 && tieneVelas;
    }
}
