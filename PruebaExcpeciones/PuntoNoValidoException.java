package PruebaExcpeciones;

public class PuntoNoValidoException extends Exception {

    private int x, y;

    public PuntoNoValidoException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Punto [" + x + "," + y + "] no valido";
    }
}
