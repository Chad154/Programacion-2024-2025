public class Perro extends Animal {

    protected String raza;
    protected String color;

    public Perro(int id, String nombre, int edad, String tipo, String raza, String color) {
        super(id, nombre, edad, tipo);
        this.raza = raza;
        this.color = color;
    }

    public String toString() {
        return super.toString() + " Raza: " + raza + " Color: " + color;
    }

}