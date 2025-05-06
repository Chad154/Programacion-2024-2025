import java.util.Comparator;

public class NombreComparatorCentroEducativo implements Comparator<PersonaCentroEducativo> {
    @Override
    public int compare(PersonaCentroEducativo p1, PersonaCentroEducativo p2) {
        String nombre1 = null;
        String nombre2 = null;
        nombre1 = p1.getNombre();
        nombre2 = p2.getNombre();
        if (nombre1 != null && nombre2 != null) {
            return nombre1.compareToIgnoreCase(nombre2);
        } else if (nombre1 != null)
            return -1;
        else if (nombre2 != null)
            return 1;
        else
            return 0;
    }
}
