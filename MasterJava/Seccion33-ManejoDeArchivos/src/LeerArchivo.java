import servicio.ArchivoServicio;

public class LeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\manue\\OneDrive\\Documents\\txtDePrueba\\java.txt";
        ArchivoServicio archivoServicio = new ArchivoServicio();

        System.out.println(archivoServicio.leerArchivo2(nombreArchivo));
    }
}
