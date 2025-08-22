package assuncao.bryan.maratonajava.javacore.P_String.test;

public class StringBuilderTest {
    public static void main(String[] args) {

        String name = "Bryan Conceição";

        System.out.println(name);

        StringBuilder nomeCompleto = new StringBuilder(name);
        nomeCompleto.append(" Assunção");

        System.out.println(nomeCompleto);





    }

}
