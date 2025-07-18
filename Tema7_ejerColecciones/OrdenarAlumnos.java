import java.util.ArrayList;
import java.util.Collections;

public class OrdenarAlumnos {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Pep", "1111A", 15));
        alumnos.add(new Alumno("Tom", "2222A", 17));
        alumnos.add(new Alumno("Jon", "3333A", 14));
        Collections.sort(alumnos); // ordenamos en base al método compareTo de la clase Alumno
        System.out.println(alumnos); // Los muestra ordenados por edad → Jon, Pep, Tom
        alumnos.add(new Alumno("Ben", "4444A", 14));
        Collections.sort(alumnos); // ordenamos en base al método compareTo de la clase Alumno
        System.out.println(alumnos); // Los muestra ordenados por edad → Ben Jon, Pep, Tom
    }

}
