package tema5_POO_Programacion;

public class aplicacionPersona {

    public static void main(String[] args) {
        
        //Crear objeto persona

        Persona p1 = new Persona("Antonio","123",12);
        Persona p2 = new Persona(null, null, 0);
        cuentaBancaria c1 = new cuentaBancaria(1, 200, "Antonio", "Corriente");
        cuentaBancaria c2 = new cuentaBancaria(2, 500, null, "Corriente");

        p1.obtenerDatos();
        p2.obtenerDatos();

        p2.cambiarProfesion("Charcutero");
        p2.modificarCiudad("Oslo");
        p2.cambiarNombre("Roberto");
        p2.obtenerDatos();

        c1.añadirSaldor(1000);
        c1.retirarSaldo(500);
        c1.obtenerDatos();

        c2.añadirSaldor(150.99);
        c2.retirarSaldo(0.98);
        c2.obtenerDatos();

    }
    
}
