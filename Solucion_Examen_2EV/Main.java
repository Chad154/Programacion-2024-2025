package Solucion_Examen_2EV;

public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Coche("Toyota", "Corolla", 2020, 4, false);
        vehiculos[1] = new Barco("Yamaha", "Speedboat", 2018, 10.5, true);

        // Recorrer Array

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
            System.out.println();
        }
        System.out.println("Velocidad y carga del coche: ");
        vehiculos[0].mostrarVelocidad(100);
        Coche coche = (Coche) vehiculos[0];
        coche.cargar(200);
        coche.descargar();
        System.out.println();

        System.out.println("Velocidad y carga del barco: ");
        vehiculos[1].mostrarVelocidad(50);
        Barco barco = (Barco) vehiculos[1];
        barco.cargar(500);
        barco.descargar();
        System.out.println();

        System.out.println("Ver si el barco es deportivo: ");
        System.out.println("El barco " + (barco.esDeportivo() ? "SI" : "NO") + " es deportivo");

    }

}
