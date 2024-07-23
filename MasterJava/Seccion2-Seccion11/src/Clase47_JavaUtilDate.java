import java.text.SimpleDateFormat;
import java.util.Date;

public class Clase47_JavaUtilDate {

    public static void main(String[] args) {
        Date fecha = new Date();

        // Fecha actual
        System.out.println("fecha = "+fecha);

        // Customizar el formato
        // MM -> numero del mes
        // MMMM -> nombre del mes
        // Para más información entrar a la página simpleDateFormat de java 14 u otra versión
        // Si quiero añadir un texto adicional debo usar comillas simples
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = "+fechaStr);


        // Contar milisegundos
        long j=0;
        for (int i =0; i<10000000;i++){
            j+=i;
        }
        System.out.println("j = "+j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = "+tiempoFinal);
    }

}
