package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Maju");
        names.add("Nome 3");

        System.out.println("Tamanho da lista:" + names.size());

        System.out.println("-------------");

        System.out.println(names);

        System.out.println("-------------");

        System.out.println(names.get(1));

        System.out.println("-------------");

        for(String name : names){
            System.out.println(name);
        }

        System.out.println("-------------");

        names.remove("Bryan");
        System.out.println(names);

        System.out.println("-------------");

        names.remove(0);
        System.out.println(names);

    }

}
