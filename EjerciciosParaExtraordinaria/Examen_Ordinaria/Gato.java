package EjerciciosParaExtraordinaria.Examen_Ordinaria;

public class Gato extends Animal implements Mascota {
    private String pelaje;

    public Gato(String nombre, Color colorAnimal, String pelaje) throws NombreInvalidoException {
        super(nombre, "Mamifero - Gato", colorAnimal);
        this.pelaje = pelaje;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo atun");
    }

    public void jugar() {
        System.out.println(nombre + " esta jugando");
    }

    @Override

    public String toString() {
        return super.toString() + " pelaje: " + pelaje;
    }
}
