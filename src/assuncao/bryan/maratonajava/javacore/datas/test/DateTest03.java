package assuncao.bryan.maratonajava.javacore.datas.test;

import java.time.LocalDateTime;

public class DateTest03 {
    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora.getHour());
        System.out.println(dataHora.getDayOfMonth());
        System.out.println(dataHora.getMonth());
        System.out.println(dataHora.getYear());
        System.out.println(dataHora.getDayOfMonth());
        System.out.println(dataHora);

        LocalDateTime dataHora2 = LocalDateTime.of(2001, 02, 26, 12, 00);
        System.out.println(dataHora2);

    }
}
