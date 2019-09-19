import java.util.*;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Date fechaInicial = new GregorianCalendar(2010, Calendar.FEBRUARY, 11).getTime();
        Date fechaFinal = new GregorianCalendar(2015, Calendar.FEBRUARY, 25).getTime();
        System.out.println("Número de años entre las fechas: " + obtenerAnios(fechaInicial, fechaFinal));
    }

    public static int obtenerAnios(Date fechaInicial, Date fechaFinal) {
        Calendar fechaInicialCalendar = getCalendar(fechaInicial);
        Calendar fechaFinalCalendar = getCalendar(fechaFinal);
        int mesFechaInicial = fechaInicialCalendar.get(Calendar.MONTH);
        int mesFechaFinal = fechaFinalCalendar.get(Calendar.MONTH);
        int anios = fechaFinalCalendar.get(Calendar.YEAR) - fechaInicialCalendar.get(Calendar.YEAR);
        if (mesFechaInicial > mesFechaFinal ||
                (mesFechaInicial == mesFechaFinal &&
                        fechaInicialCalendar.get(Calendar.DATE) > fechaFinalCalendar.get(Calendar.DATE))) {
            anios--;
        }
        return anios;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }
}
