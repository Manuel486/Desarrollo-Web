import servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\manue\\OneDrive\\Documents\\txtDePrueba\\java.txt";

        ArchivoServicio servicio = new ArchivoServicio();
        servicio.crearArchivo3(nombreArchivo);
    }
}
