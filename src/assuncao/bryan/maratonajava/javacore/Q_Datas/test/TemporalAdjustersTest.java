package assuncao.bryan.maratonajava.javacore.Q_Datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        System.out.println("-----------");

        System.out.println(hoje.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)));
        System.out.println(hoje.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)));

        System.out.println("-----------");

        System.out.println(hoje.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
        System.out.println(hoje.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));

        System.out.println("-----------");

        System.out.println(hoje.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)));
        System.out.println(hoje.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));

        System.out.println("-----------");

        System.out.println(hoje.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(hoje.with(TemporalAdjusters.lastDayOfMonth()));

    }
}
