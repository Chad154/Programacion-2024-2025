package tema5_POO_Programacion;

public class punto {

    private double distancia, x, y;

    public punto() {
        x = 0;
        y = 0;
        distancia = 0;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
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
        System.out.println("La distancia entre el centro y su punto es: " + distancia);
        System.out.println();
    }

    public void calcularDistancia() {
        distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
