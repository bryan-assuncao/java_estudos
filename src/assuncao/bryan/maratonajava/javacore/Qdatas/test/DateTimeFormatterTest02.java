package assuncao.bryan.maratonajava.javacore.Qdatas.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest02 {
    public static void main(String[] args) {

        DateTimeFormatter formatterChina = DateTimeFormatter.ofPattern("yyyy.MMMM.dd", Locale.CHINA);
        System.out.println(LocalDate.now().format(formatterChina));

        DateTimeFormatter formatterGR= DateTimeFormatter.ofPattern("yyyy/MM/dd", Locale.GERMANY);
        System.out.println(LocalDate.now().format(formatterGR));

    }
}




