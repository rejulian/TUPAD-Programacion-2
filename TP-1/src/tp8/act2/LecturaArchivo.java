package tp8.act2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer.");
        }
    }
}
