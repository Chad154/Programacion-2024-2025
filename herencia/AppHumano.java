package herencia;

public class AppHumano {

    public static void main(String[] args) {
        
        Humano padre1 = new Humano("Juan", 40);
        padre1.mostrarInfo();

        Alumno hija1 = new Alumno("Maria", 20, 7);
        hija1.mostrarInfo(); 
    }

}
