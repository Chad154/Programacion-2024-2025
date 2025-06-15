package EjerciciosParaExtraordinaria.Examen_Ordinaria;

public class Loro extends Animal {
    private String idioma;

    public Loro(String nombre, Color colorAnimal, String idioma) throws NombreInvalidoException {
        super(nombre, "Ave", colorAnimal);
        this.idioma = idioma;
    }

    public void comer() {
        System.out.println(nombre + " el loro esta comiendo algo");
    }

    @Override
    public String toString() {
        return super.toString() + ", idioma: " + idioma;
    }
}
