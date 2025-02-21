package animales;

class Animal {

    private String color;
    private int edad;

    public Animal(String color, int edad) {
        this.color = color;
        this.edad = edad;
    }

    public void hacerRuido() {
        System.out.println("El animal hace ruido");
    }

    @Override
    public String toString() {
        return "Animal";
    }



}
