package assuncao.bryan.maratonajava.javacore.datas.test;

public class LocalDateTime {
    public static void main(String[] args) {

        java.time.LocalDateTime dataHora = java.time.LocalDateTime.now();
        System.out.println(dataHora.getHour());
        System.out.println(dataHora.getDayOfMonth());
        System.out.println(dataHora.getMonth());
        System.out.println(dataHora.getYear());
        System.out.println(dataHora.getDayOfMonth());
        System.out.println(dataHora);

        java.time.LocalDateTime dataHora2 = java.time.LocalDateTime.of(2001, 02, 26, 12, 00);
        System.out.println(dataHora2);

    }
}
