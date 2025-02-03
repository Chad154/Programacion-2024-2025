package tema5_POO_Programacion;

public final class aplicacionPuntoInmutable {
    private final int n;
    private final String s;
    private final punto p;

    public aplicacionPuntoInmutable(int n, String s, punto p) {
    this.n = n;
    this.s = new String(s);
    this.p = new punto(p.getX(), p.getY());
    }

    public int getN() {
        return n;
    }

    public String getS() {
        return new String(s);
    }

    public punto getPunto() {
        return new punto(p.getX(), p.getY());
    }
}