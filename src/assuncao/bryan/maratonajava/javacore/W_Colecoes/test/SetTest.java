package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Mangas;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Mangas> mangas = new LinkedHashSet<>();

        mangas.add(new Mangas(100L, "One Piece", 100, 0));
        mangas.add(new Mangas(29L, "Naruto", 29.9, 5));
        mangas.add(new Mangas(31L, "Attack on Titan", 19.9, 0));
        mangas.add(new Mangas(41L, "Eight Six", 15.9, 2));

        for (Mangas manga : mangas) {
            System.out.println(manga);
        }

    }
}
