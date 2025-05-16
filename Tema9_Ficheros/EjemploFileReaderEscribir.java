package Tema9_Ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileReaderEscribir {

    public static void main(String[] args) {
        String fichero = "Tema9_Ficheros/fichero.txt";
        String cadena = "\nEstamos todos aprobados del RA de ficheros";
        try {
            // Creamos el FileWriter
            FileWriter fileWriter = new FileWriter(fichero, true);
            // Escribimos la cadena entera
            fileWriter.write(cadena);

            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
            e.printStackTrace();
        }

    }

}
