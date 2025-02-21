package ejercicioRefuerzo_POO;


public class appGrafico2D {

    public static void main(String[] args) {

        punto p1 = new punto(1, 1, "p1");
        punto p2 = new punto(2, 2,"p2");
        punto p3 = new punto(3, 3,"p3");
        punto p4 = new punto(4, 4,"p4");
        GraficoLineas2D grafico = new GraficoLineas2D();


        grafico.agregarPunto(p1);
        p1.mostrarPerimetro(p1,p2); 
        
    }

}
