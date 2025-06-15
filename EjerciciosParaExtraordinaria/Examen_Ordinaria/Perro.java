package EjerciciosParaExtraordinaria.Examen_Ordinaria;

public class Perro extends Animal implements Mascota {
    private String raza;

    public Perro(String nombre, Color colorAnimal, String raza) throws NombreInvalidoException {
        super(nombre, "Mamifero - Perro", colorAnimal);
        this.raza = raza;
    }

    public void comer() {
        System.out.println(nombre + "esta comiendo pienso");
    }

    public void jugar() {
        System.out.println(nombre + " esta jugando");
    }

    @Override

    public String toString() {
        return super.toString() + ", raza: " + raza;
    }
}
