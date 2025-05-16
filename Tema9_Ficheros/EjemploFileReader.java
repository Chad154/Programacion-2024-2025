package Tema9_Ficheros;

import java.io.FileReader;
import java.io.IOException;

public class EjemploFileReader {

    public static void main(String[] args) {
        String fichero = "Tema9_Ficheros/fichero.txt";
        try {
            // Creamos el FileReader
            FileReader fileReader = new FileReader(fichero);
            // Leemos caracter a caracter
            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char) caracter);
            }

            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo"); 
            e.printStackTrace();
        }
    }

}
