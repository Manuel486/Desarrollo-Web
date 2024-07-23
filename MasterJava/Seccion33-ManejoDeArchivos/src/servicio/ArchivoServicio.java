package servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    /*
    - File: La clase File representa un archivo o un directorio en el sistema de archivos. Puedes utilizar esta clase para
        realizar diversas operaciones relacionadas con archivos, como crear, leer, escribir, borrar, renombrar, entre otras.
        La clase File proporciona métodos para verificar la existencia de un archivo o directorio, obtener información sobre
        el archivo o directorio (como su ruta, nombre, tamaño, última fecha de modificación, etc.), así como también para
        realizar operaciones como crear directorios, listar los archivos en un directorio, etc.

    - FileWriter: La clase FileWriter es una subclase de Writer que se utiliza para escribir caracteres en un archivo de
        texto. Se utiliza para escribir texto en un archivo de forma secuencial. FileWriter permite escribir caracteres en
        un archivo de texto de una manera similar a como se escribiría en un flujo de salida estándar (System.out).
        Puedes escribir cadenas de caracteres, arrays de caracteres y partes de una cadena de caracteres en un archivo
        utilizando FileWriter.

     */
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            // Si el archivo no existe lo crea
            // FileWriter escritor = new FileWriter(archivo);
            FileWriter escritor = new FileWriter(archivo,true); // Quiero agregar contenido al archivo
            // El FileWrite por cada append va al disco donde esta ubicado al archivo y escribe.
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
            bufferedWriter.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo acá escribiendo un archivo...\n")
                    .append("Hasta luego lucas!\n");

            bufferedWriter.close();
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo,true))) {
            bufferedWriter.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo acá escribiendo un archivo...\n")
                    .append("Hasta luego lucas!\n");
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // Otra forma sin tener que usar el close
    public void crearArchivo3(String nombre){
        File archivo = new File(nombre);
        // PrintWrite me permite trabajar como si estuviera en consola
        try(PrintWriter buffer = new PrintWriter(new FileWriter(archivo,true))) {
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo acá escribiendo un archivo...");
            buffer.printf("Hasta luego %s!","Lucas");
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea ;
            while (( linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            Scanner s = new Scanner(archivo);
            s.useDelimiter("\n"); // El elemento por que va a estar separado cada linea
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }
}
