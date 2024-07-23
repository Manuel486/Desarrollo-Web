import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Clase50_TareaEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese la fecha de su cumpleaños con el siguiente formateo (yyyy-MM-dd): ");
        try {
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(format.parse(entrada.next()));
            Calendar fechaActual = Calendar.getInstance();

            int cumplido = fecha.after(fechaActual)? -1:0;

            System.out.println("Su edad es : "+(fechaActual.get(Calendar.YEAR) - fecha.get(Calendar.YEAR) + cumplido));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
