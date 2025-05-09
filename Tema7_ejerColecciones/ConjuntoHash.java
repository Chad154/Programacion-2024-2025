import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoHash {

    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums); // [2, 3, 4, 5, 8]
        System.out.println(nums.contains(1)); // false
        
        Set<Alumno> dam = new HashSet<>();
        Alumno a1 = new Alumno("Pep", "222A", 25);
        Alumno a2 = new Alumno("Sam", "666A", 18);
        Alumno a3 = new Alumno("Sam", "666A", 18);
        Alumno a4 = new Alumno("Kal", "666A", 20);
        dam.add(a1); // Pep
        dam.add(a2); // Pep, Sam
        dam.add(a3); // Pep, Sam → no inserta Sam de nuevo, hay un Alumno igual
        dam.add(a4); // Pep, Sam, Kal
        dam.add(a1); // No se inserta Pep, tienen la misma referencia
        dam.add(new Alumno("Sam", "666A", 18)); // No inserta Sam, hay un Alumno igual
    }



}
