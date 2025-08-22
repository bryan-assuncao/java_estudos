package assuncao.bryan.maratonajava.javacore.Q_Datas.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class LocalTimeTest {
    public static void main(String[] args) {

        LocalTime hora = LocalTime.now();
        System.out.println(hora);
        System.out.println(hora.getHour());
        System.out.println(hora.getMinute());
        System.out.println(hora.getSecond());
        System.out.println(hora.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

        LocalTime hora2 = LocalTime.of(06, 06, 06);
        System.out.println(hora2);

    }
}



