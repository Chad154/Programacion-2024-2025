public class cadenaLenght {

    public static void main(String[] args) {

        String cadena = "Curso 2024 - 2025";
        int longitud = cadena.length();

        // .lenght Devuelve la cantidad de caracteres que hay en una cadena
        System.out.println(longitud);
        System.out.println(cadena.length());

        // .charAt Devuelve el caracter que esta en esa posicion
        System.out.println(cadena.charAt(0));

        // Sacar la letra final de la cadena

        System.out.println("La letra final de la cadena [" + cadena + "] es " + cadena.charAt(longitud - 1));

        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
    }
}
