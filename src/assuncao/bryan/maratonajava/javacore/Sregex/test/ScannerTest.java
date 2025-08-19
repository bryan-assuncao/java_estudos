package assuncao.bryan.maratonajava.javacore.Sregex.test;

public class ScannerTest {
    public static void main(String[] args) {
        String text = "Eren, Mikasa, Armin";

        String[] names = text.split(", ");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
