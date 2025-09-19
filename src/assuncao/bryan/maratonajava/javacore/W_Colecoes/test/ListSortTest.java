package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("AOT");
        mangas.add("OP");
        mangas.add("SAO");
        mangas.add("DBZ");
        mangas.add("HxH");

        System.out.println(mangas);
        Collections.sort(mangas);  // organiza a lista  de A a Z ou do Menor número para o Maior número
        System.out.println(mangas);

        System.out.println("-------------------------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(19);
        numeros.add(2);
        numeros.add(7);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}

