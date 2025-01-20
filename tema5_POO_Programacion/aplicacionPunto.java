package tema5_POO_Programacion;

public class aplicacionPunto {

    public static void main(String[] args) {
        
        punto p1 = new punto();
        p1.mostrarPunto();

        p1.setX(5);
        p1.setY(5);
        p1.calcularDistancia();
        p1.mostrarPunto();

        p1.setX(4);
        p1.setY(3);
        p1.calcularDistancia();
        p1.mostrarPunto();

        
    }

}
