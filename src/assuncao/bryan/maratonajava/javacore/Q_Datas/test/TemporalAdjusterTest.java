package assuncao.bryan.maratonajava.javacore.Q_Datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case FRIDAY -> addDays = 3;
            case SATURDAY -> addDays = 2;
            default -> addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("_---------");

        LocalDate now2 = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now2);
        System.out.println(now2.getDayOfWeek());

        System.out.println("_---------");

        LocalDate now3 = LocalDate.of(2025, Month.AUGUST, 15).with(new ObterProximoDiaUtil());
        System.out.println(now3);
        System.out.println(now3.getDayOfWeek());

        System.out.println("_---------");

        LocalDate now4 = LocalDate.now().withDayOfMonth(20).with(new ObterProximoDiaUtil());
        System.out.println(now4);
        System.out.println(now4.getDayOfWeek());



    }
}


