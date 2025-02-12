package ejercicioRefuerzo_POO;

import java.util.ArrayList;
import tema5_POO_Programacion.punto1;

public class GraficoLineas2D {

    private ArrayList<punto> puntos;

    public GraficoLineas2D() {
        this.puntos = new ArrayList<>();
    }

    public GraficoLineas2D(ArrayList<punto1> puntos) {

    }

    public boolean esPositivo(punto p) {
        return p.getX() >= 0 && p.getY() >= 0;
    }

    public void eliminarPunto() {
        if (!puntos.isEmpty())
            puntos.remove(puntos.size() - 1);
        System.out.println("Punto eliminado");
    }

    public void agregarPunto(punto p){
        if(puntos.isEmpty()){
        puntos.add(p);
        System.out.println("Punto agregado correctamente");
        return;
        }

        punto anterior = puntos.get(puntos.size() -1);

        if(esPositivo(p) && punto.distintos(p, anterior) && p.getX() >= anterior.getX()){

        } 
    }
}
