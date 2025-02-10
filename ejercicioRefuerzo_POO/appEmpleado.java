package ejercicioRefuerzo_POO;

public class appEmpleado {

    public static void main(String[] args) {
        
        empleado e1 = new empleado();
        empleado e2 = new empleado("Juan", 10, 0);


        System.out.println("e1: " + e1.getNombreCompleto() + "-" + e1.getPermanecia() + "-" + e1.getSalario());
        System.out.println("e2: " + e2.getNombreCompleto() + "-" + e2.getPermanecia() + "-" + e2.getSalario());

        e1.permanecia();

        e2.modificarSueldo(-10);
        e2.mostrarEmpleado();

        e2.modificarSueldo(10);
        e2.mostrarEmpleado();
        

    }
}
