package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Mangas;
import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Smarthphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmarthphoneMarcaComparator implements Comparator<Smarthphone>{
    @Override
    public int compare(Smarthphone o1, Smarthphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smarthphone> set = new TreeSet<>(new SmarthphoneMarcaComparator());

        Smarthphone iphone17 = new Smarthphone("A19", "Apple");
        set.add(iphone17);

        NavigableSet<Mangas> mangas = new TreeSet<>();

        mangas.add(new Mangas(100L, "One Piece", 100, 0));
        mangas.add(new Mangas(29L, "Naruto", 29.9, 5));
        mangas.add(new Mangas(31L, "Attack on Titan", 19.9, 0));
        mangas.add(new Mangas(41L, "Eight Six", 15.9, 2));
        for (Mangas manga : mangas) {
            System.out.println(manga);
        }

    }
}
