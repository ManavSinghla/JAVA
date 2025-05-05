import java.time.*;

public class DateExample{
    public static void main(String[] args) {
        LocalDate a=LocalDate.now();
        System.out.println(a);
        LocalDate b=a.plusDays(11);
        System.out.println(b);
    }
}