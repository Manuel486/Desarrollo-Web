import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Clase48_JavaUtilCalendar {
    public static void main(String[] args) {

        // Calendar es una clase abstracta
        Calendar calendario = Calendar.getInstance(); // Se encarga de crear el objeto Calendar

        // 0 -> Enero
        // 1 -> Febrero
        // 11 -> Diciembre
        // calendario.set(2020,0,31,24,20,10);
        // calendario.set(2019, Calendar.SEPTEMBER,31,24,20,10);
        calendario.set(Calendar.YEAR,2020);
        calendario.set(Calendar.MONTH,Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH,25);
        //calendario.set(Calendar.HOUR_OF_DAY,21); // VA DE 0 A 24, si uso HOUR va de a 0 a 12 y especifico am o pm
        calendario.set(Calendar.HOUR,7);
        calendario.set(Calendar.AM_PM,Calendar.PM);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.MILLISECOND,125);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = "+fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a"); // Con el hh lo muestro a formato de 24 horas,
                                                                                             // si quiero formato de 12 horas debo poner el hh en minuscula
        String fechaConFormato = formato.format(fecha);

        System.out.println("Fecha con formato = "+fechaConFormato);

    }
}
