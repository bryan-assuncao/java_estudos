package assuncao.bryan.maratonajava.javacore.string.test;

public class StringBuilderTest {
    public static void main(String[] args) {

        String name = "Bryan Conceição";

        System.out.println(name);

        StringBuilder sb = new StringBuilder(name);
        sb.append(" Assunção");

        System.out.println(sb);





    }

}
