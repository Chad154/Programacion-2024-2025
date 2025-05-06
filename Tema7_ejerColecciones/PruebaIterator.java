import java.util.ArrayList;
import java.util.Iterator;

public class PruebaIterator {

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("New York");
        ciudades.add("Tokyo");
        ciudades.add("París");
        ciudades.add("Pozuelo");
        //recorremos el array list buscando Tokyo y lo eliminamos cuando lo encontremos
        System.out.println("Ciudades");
        for (String ciudad : ciudades) {
            //if(ciudad.equals("Tokyo")) ciudades.remove(ciudad); esto daría error
            System.out.println(ciudad);
        }   
        Iterator<String> it = ciudades.iterator();
        System.out.println("ciudades con iterator debería borrar Tokyo ");
     
        //mientras tenga datos
        while (it.hasNext()) {
            String ciudad=it.next();
            if(ciudad.equals("Tokyo"))  it.remove();
            else System.out.println(ciudad);
        }
        
    }
}