package assuncao.bryan.maratonajava.javacore.datas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime after2Years = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime minus7Hours = LocalTime.now().minusHours(7);

        System.out.println(Duration.between(now, after2Years));
        System.out.println(Duration.between(timeNow, minus7Hours));

        System.out.println("-------------------------");

        System.out.println(LocalTime.now());
        System.out.println(Duration.between(LocalTime.now(), LocalTime.now().minusHours(2)));

        System.out.println("-------------------------");

        System.out.println(Duration.ofDays(1));
        System.out.println(Duration.ofDays(3));
    }
}




