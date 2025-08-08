package assuncao.bryan.maratonajava.javacore.datas.test;

import java.time.format.DateTimeFormatter;

public class LocalDate {
    public static void main(String[] args) {

        java.time.LocalDate data = java.time.LocalDate.now();
        System.out.println(data);
        System.out.println(data.plusDays(2));
        System.out.println(data.getDayOfMonth());
        System.out.println(data.getDayOfYear());
        System.out.println(data.getDayOfWeek());
        System.out.println(data.lengthOfMonth());
        System.out.println(data.getYear());
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yy")));

        java.time.LocalDate data2 = java.time.LocalDate.of(2001, 02, 26);
        System.out.println(data2);

    }
}
