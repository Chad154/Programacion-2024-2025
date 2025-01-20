package tema5_POO_Programacion;

public class punto {

    private double x, y;

    public punto() {
        x = 0;
        y = 0;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void mostrarPunto() {

        System.out.println("Cordenada X: " + x);
        System.out.println("Coordenada Y: " + y);
        System.out.println();
    }

    public double calcularDistancia() {

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
