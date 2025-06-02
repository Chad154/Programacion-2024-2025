package EjerciciosParaExtraordinaria;

public abstract class Animal {

    protected String nombre;
    protected String tipo;
    protected Color colorAnimal;

    public Animal(String nombre, String tipo, Color colorAnimal) throws NombreInvalidoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new NombreInvalidoException("Nombre no valido");
        }
        this.nombre = nombre;
        this.tipo = tipo;
        this.colorAnimal = colorAnimal;
    }

    public abstract void comer();

    @Override

    public String toString() {
        return tipo + " - Nombre: " + nombre + ", Color: " + colorAnimal;
    }

}
