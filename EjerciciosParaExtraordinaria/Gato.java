package EjerciciosParaExtraordinaria;

public class Gato extends Animal implements Mascota {
    private String pelaje;

    public Gato(String nombre, String tipo, Color colorAnimal, String pelaje) throws NombreInvalidoException {
        super(nombre, "Mamifero - Gato", colorAnimal);
        this.pelaje = pelaje;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo atun");
    }

    public void jugar() {
        System.out.println(nombre + " esta jugando");
    }
}
