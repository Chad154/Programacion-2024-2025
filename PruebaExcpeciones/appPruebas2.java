package PruebaExcpeciones;

public class appPruebas2 {

    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Error division por cero");
        } finally {
            System.out.println("Estoy en el finally");
        }
        System.out.println("El programa sigue ejecutandose");
    }
    

}
