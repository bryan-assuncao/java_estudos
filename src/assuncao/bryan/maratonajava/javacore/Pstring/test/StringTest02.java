package assuncao.bryan.maratonajava.javacore.Pstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "   Luffy   ";
        String num = "012345";

        System.out.println(name.charAt(0));

        System.out.println(name.length());

        System.out.println(name.replace("f", "c"));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(num.substring(0, 4));
        System.out.println(num.substring(1));

        System.out.println(name.trim());







    }
}
