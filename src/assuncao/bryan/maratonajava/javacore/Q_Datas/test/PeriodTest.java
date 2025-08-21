package assuncao.bryan.maratonajava.javacore.Qdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest {
    public static void main(String[] args) {

        Period period = Period.between(LocalDate.now(), LocalDate.of(2025, Month.AUGUST, 10));
        System.out.println(period);

        System.out.println("--------");

        LocalDate data = LocalDate.now();
        LocalDate data02 = LocalDate.now().minusYears(7).minusDays(5);

        Period period02 = Period.between(data, data02);
        System.out.println(period02);

        System.out.println("--------");

        Period days = Period.ofWeeks(53);
        System.out.println(days);
        System.out.println(days);

        System.out.println("--------");

        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(days.getDays())));

        System.out.println("--------");

        System.out.println(LocalDate.now().until(LocalDate.now().plusDays(days.getDays()), ChronoUnit.MONTHS));


    }
}
