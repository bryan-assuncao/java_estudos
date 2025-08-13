package assuncao.bryan.maratonajava.javacore.CsobrecargaDeMetodos.test;

import assuncao.bryan.maratonajava.javacore.CsobrecargaDeMetodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime = new Anime();

        anime.init("Frieren", "Adventure", 24, "Finished");


        anime.printAnime();
    }
}














