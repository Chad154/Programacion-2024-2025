package EjerciciosRefuerzoPOO_EXCEPCIONES;

import java.time.LocalDate;

public class appPrueba {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "Rodríguez", "San Juan de la Cruz", "Madrid",
                LocalDate.of(2000, 3, 22));
        Cuenta cuenta1 = new Cuenta(111, 4000, cliente1);
        cuenta1.ingresar(200);
        cuenta1.retirar(40);
        cuenta1.verDatos();
    }
}
