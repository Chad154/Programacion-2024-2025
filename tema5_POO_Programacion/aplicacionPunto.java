package tema5_POO_Programacion;

public class aplicacionPunto {

    public static void main(String[] args) {

        int num = 1;
        String nombre = "Los Strings son inmutables";
        punto p1 = new punto(2, "p1");
        punto p2 = new punto(1, 3, "p2");
        punto p3 = new punto(1, "p3");

        p1.mostrarPunto();
        p2.mostrarPunto();
        p3.mostrarPunto();

        modificarPunto(p1);
        modificarEntero(num);
        modificarString(nombre);

        System.out.println("Punto.x=" + p1.getX());
        System.out.println("num=" + num);
        System.out.println("nombre=" + nombre);

        System.out.println(p1);

    }

    public static void mostrarPuntos(punto... puntos) {

        for (punto p : puntos) {
            p.mostrarPunto();

        }
    }

    public static void modificarPunto(punto p) {
        p.setX(999);

    }

    public static void modificarEntero(int n) {
        n = 999;
    }

    public static void modificarString(String s) {
        s = "String modificada";
    }

}