package assuncao.bryan.codes.construtor.test;

import assuncao.bryan.codes.construtor.domain.Manga;

public class MangaTest {
    public static void main(String[] args) {
        Manga manga = new Manga("One Piece", 1999, "Pirata");
        Manga manga02 = new Manga("Naruto", 2001, "Ninja", 500 );
        Manga manga03 = new Manga();

        manga.printManga();

        System.out.println("--------------------");

        manga02.printManga();

        System.out.println("--------------------");

        manga03.init("Attack on Titan", 2009);
        manga03.printManga();

    }
}











