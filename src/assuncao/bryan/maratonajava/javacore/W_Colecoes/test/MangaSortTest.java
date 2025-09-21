package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Mangas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest {
    public static void main(String[] args) {
        List<Mangas> mangas = new ArrayList<>(6);

        mangas.add(new Mangas(100L, "One Piece", 100));
        mangas.add(new Mangas(29L, "Naruto", 29.9));
        mangas.add(new Mangas(31L, "Attack on Titan", 19.9));
        mangas.add(new Mangas(41L, "86", 15.9));

        System.out.println(mangas);

        System.out.println("----------------");

        Collections.sort(mangas);

        System.out.println(mangas);
    }
}


