package assuncao.bryan.maratonajava.javacore.Q_Datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println("----------------------");

        LocalDateTime dateHour = LocalDateTime.now();
        System.out.println(dateHour.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm:ss")));

        System.out.println("----------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy - hh:mm");
        String formatterDate = LocalDateTime.now().format(formatter);
        System.out.println(formatterDate);

        System.out.println("----------------------");

        DateTimeFormatter formatterUSA = DateTimeFormatter.ofPattern("yyyy.MMMM.dd", Locale.US);
        System.out.println(LocalDate.now().format(formatterUSA));

        System.out.println("----------------------");

        DateTimeFormatter formatterChina = DateTimeFormatter.ofPattern("yyyy.MMMM.dd", Locale.CHINA);
        System.out.println(LocalDate.now().format(formatterChina));

    }
}




