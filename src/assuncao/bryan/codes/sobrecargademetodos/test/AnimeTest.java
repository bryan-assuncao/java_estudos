package assuncao.bryan.codes.sobrecargademetodos.test;

import assuncao.bryan.codes.sobrecargademetodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime = new Anime();

        anime.init("Frieren", "Adventure", 24, "Finished");


        anime.printAnime();
    }
}














