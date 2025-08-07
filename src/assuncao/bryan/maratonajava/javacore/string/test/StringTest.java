package assuncao.bryan.maratonajava.javacore.string.test;

public class StringTest {
    public static void main(String[] args) {
        String name = "Kakashi";  //String constant pool
        String name2 = "Jiraya";

        System.out.println(name);

        name = name.concat(" Hatake");

        System.out.println(name);

        System.out.println("------------------");

        String name3 = new String("Jiraya");
        System.out.println(name3 == name2);
        name3 = name3.intern();
        System.out.println(name3 == name2);

    }
}

