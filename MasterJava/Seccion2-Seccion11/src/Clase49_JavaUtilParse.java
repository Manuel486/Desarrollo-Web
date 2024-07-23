import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Clase49_JavaUtilParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese una fecha con formato 'yyyy-MM-dd' : ");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("Fecha = "+fecha);
            System.out.println("Formateado = "+format.format(fecha));

            // Usando equals
            Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despúes que fecha2");
            } else if(fecha.before((fecha2))){
                System.out.println("Fecha es anterior que fecha2");
            } else if(fecha.equals(fecha2)){
                System.out.println("Las fecha son iguales");
            }

            // Usando compareTo
            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es despúes que fecha2");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Las fecha son iguales");
            }

        } catch (ParseException e) {
//            throw new RuntimeException(e);
            System.err.println("La fecha tiene un formato erroneo: "+e.getMessage());
            System.out.println("El formato es yyyy-MM-dd");
            ///System.exit(1);
            main(args);
        }
    }
}
