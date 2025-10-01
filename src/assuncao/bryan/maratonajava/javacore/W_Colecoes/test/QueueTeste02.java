package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Mangas;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {

        Queue<Mangas> mangasQueue = new PriorityQueue<>(new MangaPrecoComparador());

        mangasQueue.add(new Mangas(100L, "One Piece", 100));
        mangasQueue.add(new Mangas(29L, "Naruto", 29.9));
        mangasQueue.add(new Mangas(31L, "Attack on Titan", 19.9));
        mangasQueue.add(new Mangas(41L, "86", 15.9));

        while (!mangasQueue.isEmpty()){
            System.out.println(mangasQueue.poll());
        }

    }
}



