package assuncao.bryan.maratonajava.javacore.I_Sobrescrita.test;

import assuncao.bryan.maratonajava.javacore.I_Sobrescrita.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Demon Slayer");

        System.out.println(anime.toString());
    }
}
