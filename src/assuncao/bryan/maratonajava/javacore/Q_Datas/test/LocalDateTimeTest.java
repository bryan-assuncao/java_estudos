package assuncao.bryan.maratonajava.javacore.Q_Datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        System.out.println("------------------------------");

        System.out.println(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss")));

        System.out.println("------------------------------");

        LocalDate data = LocalDate.of(2025, Month.AUGUST, 11);
        LocalTime hora = LocalTime.of(12, 00, 01);

        LocalDateTime dataCompleta = data.atTime(hora);
        System.out.println(dataCompleta);

    }
}
