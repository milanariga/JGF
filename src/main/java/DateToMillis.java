import java.util.Calendar;
import java.util.Date;

public class DateToMillis {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        long today = calendar.getTimeInMillis();
        System.out.println(today);
        //calendar.set(calendar.DATE, (Calendar.DATE - 1) );
        calendar.set(calendar.HOUR_OF_DAY, 00);
        calendar.set(calendar.MINUTE, 00);
        calendar.set(calendar.SECOND, 00);
        calendar.set(Calendar.MILLISECOND, 00);
        System.out.println(calendar.getTimeInMillis());
    }
}
