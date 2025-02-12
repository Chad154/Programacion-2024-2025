package herencia;

public class AppHumano {

    public static void main(String[] args) {
        
        Humano padre1 = new Humano("Juan");
        padre1.mostrarInfo();

        Alumno hija1 = new Alumno(20, "", "Maria");
        hija1.mostrarInfo();
    }

}
