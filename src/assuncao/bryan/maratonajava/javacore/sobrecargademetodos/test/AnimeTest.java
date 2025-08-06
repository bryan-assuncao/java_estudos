package assuncao.bryan.maratonajava.javacore.sobrecargademetodos.test;

import assuncao.bryan.maratonajava.javacore.sobrecargademetodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime = new Anime();

        anime.init("Frieren", "Adventure", 24, "Finished");


        anime.printAnime();
    }
}














