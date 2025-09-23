package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Mangas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Mangas> mangas = new ArrayList<>(6);

        mangas.add(new Mangas(100L, "One Piece", 100));
        mangas.add(new Mangas(29L, "Naruto", 29.9));
        mangas.add(new Mangas(31L, "Attack on Titan", 19.9));
        mangas.add(new Mangas(41L, "Eight Six", 15.9));

        Collections.sort(mangas);

        for (Mangas manga: mangas){
            System.out.println(manga);
        }

        System.out.println("-------------------------------------------------");

        Mangas mangaToSearch = new Mangas(100L, "Attack on Titan", 100);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

    }
}

