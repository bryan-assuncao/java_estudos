package assuncao.bryan.maratonajava.javacore.datas.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest02 {
    public static void main(String[] args) {

        LocalTime hora = LocalTime.now();
        System.out.println(hora);
        System.out.println(hora.getHour());
        System.out.println(hora.getMinute());
        System.out.println(hora.getSecond());
        System.out.println(hora.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

        LocalTime hora2 = LocalTime.of(04, 20, 59);
        System.out.println(hora2);

    }
}
