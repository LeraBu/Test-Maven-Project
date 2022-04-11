import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Period;

public class MyTask {
    public static void main(String[] args) {
        LocalDate date1 = new LocalDate(2022, 1, 10);
        System.out.println(howManyDays(date1));
    }

    public static Period howManyDays(LocalDate date){
        return new Period(LocalDate.now(), date);
    }
}
