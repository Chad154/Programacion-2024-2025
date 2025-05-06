import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDam {
    public static void main(String[] args) {
        ArrayList<AlumnoDam> alumnos = new ArrayList<>();
        alumnos.add(new AlumnoDam("Papa", "Francisco", 88));
        alumnos.add(new AlumnoDam("Papa", "Negro", 17));
        alumnos.add(new AlumnoDam("Papa", "Juan Pablo II", 100));
        alumnos.add(new AlumnoDam("Papa", "Juan XXIII", 18));
        alumnos.add(new AlumnoDam("Papa", "Chino", 16));
      //listamos los alumnos
        listarAlumnos(alumnos);
        //eliminar de la lista los alumnos menores de edad
        eliminarAlumnosMenores(alumnos);   
        System.out.println("Lista sin menores");
        listarAlumnos(alumnos);
        eliminarAlumnosApellido(alumnos,'J');
        System.out.println("Lista sin J");
        listarAlumnos(alumnos); 
        eliminarAlumnosEdad(alumnos,88); 
        System.out.println("Lista sin 88");   
        listarAlumnos(alumnos); 
    }
    public static void listarAlumnos (ArrayList<AlumnoDam> alumnos){
        Iterator<AlumnoDam> iteradorAlumnoDam = alumnos.iterator();
        System.out.println("Lista alumnos");
        while(iteradorAlumnoDam.hasNext()){
            System.out.println(iteradorAlumnoDam.next());
        }
    }
    public static void eliminarAlumnosMenores(ArrayList<AlumnoDam> alumnos){
        Iterator<AlumnoDam> iteradorAlumnoDam = alumnos.iterator();
        while(iteradorAlumnoDam.hasNext()){
            if (iteradorAlumnoDam.next().getEdad()<18) iteradorAlumnoDam.remove();
        }
    }
    public static void eliminarAlumnosApellido(ArrayList<AlumnoDam> alumnos, char letra){
        Iterator<AlumnoDam> iteradorAlumnoDam = alumnos.iterator();
        while(iteradorAlumnoDam.hasNext()){
            if (iteradorAlumnoDam.next().getApellidos().charAt(0)==letra) iteradorAlumnoDam.remove();
    
        }
    }
    public static void eliminarAlumnosEdad(ArrayList<AlumnoDam> alumnos, int edad){
        Iterator<AlumnoDam> iteradorAlumnoDam = alumnos.iterator();
        while(iteradorAlumnoDam.hasNext()){
            if (iteradorAlumnoDam.next().getEdad()== edad) iteradorAlumnoDam.remove();
        }
    }
}
