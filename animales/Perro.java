package animales;

class Perro extends Animal {

    public Perro(String color, int edad) {
        super(color, edad);
    }

    public void hacerLadrido() {
        System.out.println("El perro ladra");
    }

    @Override
    public String toString() {
        return super.toString() + " Perro";
    }
}