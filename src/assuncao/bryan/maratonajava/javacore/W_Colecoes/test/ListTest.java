package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Maju");

        System.out.println(names);
        System.out.println("-------------");

        System.out.println(names.get(1));

        System.out.println("-------------");

        for(String name : names){
            System.out.println(name);
        }
    }

}
