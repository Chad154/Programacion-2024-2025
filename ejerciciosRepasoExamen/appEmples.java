package ejerciciosRepasoExamen;

public class appEmples {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[7];
        Jefatura jefe = new Jefatura("Pop", 2000);
        empleados[0] = new Empleado("Roberto", 1200);
        empleados[1] = new Empleado("Thomas", 1200);
        empleados[2] = new Empleado("Tommy");
        empleados[3] = new Empleado("Sara", 5000);
        empleados[4] = new Jefatura("Chad", 100000);
        empleados[5] = jefe;
        jefe.establecerIncentivo(5);

        Jefatura jefeChad = (Jefatura) empleados[4];

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + "ID: " + e.DameID() + "\n Nombre:" + e.dameNombre() + "\n Sueldo: "
                    + e.dameSueldo());
        }
    }

}
