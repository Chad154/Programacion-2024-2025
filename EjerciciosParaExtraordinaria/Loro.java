package EjerciciosParaExtraordinaria;

public class Loro extends Animal {
    private String idioma;

    public Loro(String nombre, String tipo, Color colorAnimal, String idioma) throws NombreInvalidoException {
        super(nombre, tipo, colorAnimal);
        this.idioma = idioma;
    }

    public void comer() {
        System.out.println(nombre + " el loro esta comiendo algo");
    }
}
