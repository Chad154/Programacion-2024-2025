package ejercicioRefuerzo_POO;

public class punto {

    private int x;
    private int y;
    public String nombre;

    public punto(int x) {
        this.x = x;
        this.y = x;
    }

    public punto(int x, String nombre) {
        this(x);
        this.nombre = nombre;
    }

    public punto(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public punto(int x, int y, String nombre) {
        this(x, y);
        this.nombre = nombre;
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

    public void mostrarPunto() {
        if (this.nombre == null)
            System.out.println("El punto no tiene nombre, sus datos son:");
        else
            System.out.println("El punto de nombre " + nombre + " tiene los siguientes datos:");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        System.out.println("La distancia respecto al centro es " + calcularDistanciaCentro());
        System.out.println("");
    }

    public double calcularDistanciaCentro() {
        double z;
        z = Math.sqrt((x * x) + (y * y));
        return z;
    }

    public static boolean distintos(punto p1, punto p2) {
        return p1.getX() != p2.getX() || p1.getY() != p2.getY();
    }

    public static boolean distintos(punto... puntos) { 
        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                if (puntos[i].getX() == puntos[j].getX() && puntos[i].getY() == puntos[j].getY()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static double distancia(punto p1, punto p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public static double perimetro(punto... puntos) {
        double perimetro = 0;
        for (int i = 0; i < puntos.length - 1; i++) {
            perimetro += distancia(puntos[i], puntos[i + 1]);
        }
        perimetro += distancia(puntos[puntos.length - 1], puntos[0]);
        return perimetro;
    }

    public void mostrarPerimetro(punto... puntos) {
        System.out.println("El perimetro de los puntos es: " + perimetro(puntos));
    }
    
    
}
