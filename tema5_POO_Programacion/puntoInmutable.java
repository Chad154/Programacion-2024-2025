package tema5_POO_Programacion;

public final class puntoInmutable {

    private final int x;
    private final int y;
    private final String nombre;

    public puntoInmutable(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }

  
    public puntoInmutable() {
        this.x = 0;                   
        this.y = 0;                   
        this.nombre = "Sin nombre";   
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getNombre() {
        return nombre;
    }
}
