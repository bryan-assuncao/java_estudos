package assuncao.bryan.maratonajava.javacore.datas.test;

import java.time.format.DateTimeFormatter;

public class LocalTime {
    public static void main(String[] args) {

        java.time.LocalTime hora = java.time.LocalTime.now();
        System.out.println(hora);
        System.out.println(hora.getHour());
        System.out.println(hora.getMinute());
        System.out.println(hora.getSecond());
        System.out.println(hora.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

        java.time.LocalTime hora2 = java.time.LocalTime.of(04, 20, 59);
        System.out.println(hora2);

    }
}
