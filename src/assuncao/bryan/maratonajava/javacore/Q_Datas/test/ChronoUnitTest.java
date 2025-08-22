package assuncao.bryan.maratonajava.javacore.Q_Datas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(2001, Month.FEBRUARY, 26, 10, 05, 00);

        System.out.println(birthday);

        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.YEARS.between(birthday, now) + " anos.");
        System.out.println(ChronoUnit.MONTHS.between(birthday, now) + " meses.");
        System.out.println(ChronoUnit.WEEKS.between(birthday, now) + " semanas");
        System.out.println(ChronoUnit.DAYS.between(birthday, now) + " dias");
        System.out.println(ChronoUnit.HOURS.between(birthday, now) + " horas");




    }
}
