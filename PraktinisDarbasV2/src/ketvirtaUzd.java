import java.util.Calendar;
import java.util.Date;


public class ketvirtaUzd {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 01, 01) ;
        int i=calendar.get(Calendar.DAY_OF_WEEK);

        if (i == 1){
            System.out.println("Monday");
        }
        if (i == 2){
            System.out.println("Tuesday");
        }
        if (i == 3){
            System.out.println("Wednesday");
        }
        if (i == 4){
            System.out.println("Thirsday");
        }
        if (i == 5){
            System.out.println("Friday");
        }
        if (i == 6){
            System.out.println("Saturday");
        }
        if (i == 7){
            System.out.println("Sunday");
        }
    }
}
