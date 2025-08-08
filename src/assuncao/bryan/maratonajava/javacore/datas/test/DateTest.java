package assuncao.bryan.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        System.out.println(data);
        System.out.println(data.getDayOfMonth());
        System.out.println(data.getDayOfYear());
        System.out.println(data.getDayOfWeek());
        System.out.println(data.lengthOfMonth());
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yy")));

        LocalDate data2 = LocalDate.of(2001, 02, 26);
        System.out.println(data2);

    }
}
