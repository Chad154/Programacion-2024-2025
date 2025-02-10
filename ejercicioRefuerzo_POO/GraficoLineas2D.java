package ejercicioRefuerzo_POO;

import java.util.ArrayList;

public class GraficoLineas2D {

    private ArrayList<Punto> puntos;

    public GraficoLineas2D() {
        this.puntos = new ArrayList<>();
    }

    public GraficoLineas2D(ArrayList<Punto> puntos) {

    }

    public boolean esPositivo(Punto p) {
        return p.getX() >= 0 && p.getY() >= 0;
    }

    public void eliminarPunto() {
        if (!puntos.isEmpty())
            puntos.remove(puntos.size() - 1);
        System.out.println("Punto eliminado");
    }

    public void agregarPunto(Punto p){
        if(puntos.isEmpty()){
        puntos.add(p);
        System.out.println("Punto agregado correctamente");
        return;
        }

        Punto anterior = puntos.get(puntos.size() -1);

        if(esPositivo(p) && Punto.distintos(p, anterior) && p.getX() >= anterior.getX()){

        } 
    }
}
