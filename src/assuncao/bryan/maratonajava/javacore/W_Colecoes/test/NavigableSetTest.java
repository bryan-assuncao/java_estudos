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

class MangaPrecoComparador implements Comparator<Mangas>{

    @Override
    public int compare(Mangas o1, Mangas o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smarthphone> set = new TreeSet<>(new SmarthphoneMarcaComparator());

        Smarthphone iphone17 = new Smarthphone("A19", "Apple");
        set.add(iphone17);

        NavigableSet<Mangas> mangas = new TreeSet<>(new MangaPrecoComparador());

        mangas.add(new Mangas(100L, "One Piece", 100, 0));
        mangas.add(new Mangas(29L, "Naruto", 29.9, 5));
        mangas.add(new Mangas(31L, "Attack on Titan", 19.9, 0));
        mangas.add(new Mangas(41L, "Eight Six", 15.9, 2));

        Mangas yuyu = new Mangas(19L, "Akudama Drive", 30, 79);

        System.out.println(mangas.lower(yuyu));

        // lowe <
        // flor <=
        // higher
        // ceiling >=

        System.out.println("------------------------------------------------------------------");


        for (Mangas manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------------------------------------------------");

        for (Mangas manga : mangas.descendingSet()) {   // fazer ao contrário
            System.out.println(manga);
        }

    }
}
