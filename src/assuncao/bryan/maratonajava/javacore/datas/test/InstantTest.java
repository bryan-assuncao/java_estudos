package assuncao.bryan.maratonajava.javacore.datas.test;

import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {
        Instant agora = Instant.now();
        System.out.println(agora);
        System.out.println("-------------------------------");
        System.out.println(agora.getNano());
        System.out.println(agora.getEpochSecond());
    }
}
