package PruebaExcpeciones;

public class Punto {
    private int x;
    private int y;
    private String nombre;
    private static int numPuntos = 0;

    public Punto() {
        x = 0;
        y = 0;
        numPuntos++;
    }

    public Punto(int x, String nombre) {
        this.x = x;
        this.y = x;
        this.nombre = nombre;
        numPuntos++;
    }

    public Punto(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        numPuntos++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void mostrarNumeroPuntos() {
        System.out.println("Número de puntos:" + numPuntos);
    }

    public void mostrarPunto() {
        System.out.print("(" + x + "," + y + ")");
    }

    public double calcularDistanciaCentro() {
        return Math.sqrt((x * x) + (y * y));
    }

    public static boolean distintos(Punto p1, Punto p2) {
        return p1.getX() != p2.getX() || p1.getY() != p2.getY();
    }

    /*
     * public static boolean iguales(Punto p1, Punto p2){
     * return p1.getX()==p2.getX() && p1.getY()==p2.getY();
     * }
     */

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}