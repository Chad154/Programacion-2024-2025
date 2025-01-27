package tema5_POO_Programacion;

public class AplicacionPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Antonio", "111B", 19);
        Persona p2 = new Persona("Laura", "222B", 18);
        /*
         * mostramos sus datos
         * p1.obtenerDatos();
         * p1.cambiarNombre("Aitor");
         * p1.obtenerDatos();
         * p2.obtenerDatos();
         * //p2.cambiarProfesion("Programadora");
         * //p1.obtenerDatos();
         * //p2.modificarCiudad("Silicon Valley");
         * //p2.obtenerDatos();
         */
        CuentaBancaria c1 = new CuentaBancaria("1234", "Aitor", "Cuenta Corriente");
        c1.depositar(500);
        c1.mostrarCuenta();
        CuentaBancaria c2 = new CuentaBancaria("4321", "Juan", "Cuenta Corriente");
        c2.depositar(200);
        c2.mostrarCuenta();

        p1.obtenerDatos();
        p2.obtenerDatos();

    }

}
