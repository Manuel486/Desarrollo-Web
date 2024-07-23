import java.awt.*;
import java.io.IOException;

public class Clase54_EjecutarSO {
    public static void main(String[] args) {

        // Runtime nos permite ejecutar aplicaciones
        Runtime rt = Runtime.getRuntime();
        Process process;

        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                process = rt.exec("notepad");
            } else if(System.getProperty("os.name").startsWith("Mac")){
                process = rt.exec("textedit");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor(); // Esperar a que finalice el programa que se abrio
        } catch (Exception e) {
           System.err.println("El comando es desconocido: "+e.getMessage());
           System.exit(1);
        }

    }
}
