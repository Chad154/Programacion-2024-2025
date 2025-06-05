public class Gato extends Animal {

    protected String raza;
    protected String color;

    public Gato(int id, String nombre, int edad, String tipo, String raza, String color) {
        super(id, nombre, edad, tipo);
        this.raza = raza;
        this.color = color;
    }

    @Override

    public String toString() {
        return super.toString() + " Raza: " + raza + " Color: " + color;
    }

}
