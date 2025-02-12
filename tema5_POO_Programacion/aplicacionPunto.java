package tema5_POO_Programacion;

public class aplicacionPunto {

    public static void main(String[] args) {

        int num = 1;
        String nombre = "Los Strings son inmutables";
        punto1 p1 = new punto1(2, "p1");
        punto1 p2 = new punto1(1, 3, "p2");
        punto1 p3 = new punto1(1, "p3");

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

    public static void mostrarPuntos(punto1... puntos) {

        for (punto1 p : puntos) {
            p.mostrarPunto();

        }
    }

    public static void modificarPunto(punto1 p) {
        p.setX(999);

    }

    public static void modificarEntero(int n) {
        n = 999;
    }

    public static void modificarString(String s) {
        s = "String modificada";
    }

}