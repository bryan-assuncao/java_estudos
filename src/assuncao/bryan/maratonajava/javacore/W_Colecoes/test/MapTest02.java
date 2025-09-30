package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Consumidor;
import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Mangas;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor(null,"Bryan");
        Consumidor consumidor02 = new Consumidor(null,"Maju");

        Mangas onePiece = new Mangas(100L, "One Piece", 100);
        Mangas naruto = new Mangas(29L, "Naruto", 29.9);
        Mangas attackOnTitan = new Mangas(31L, "Attack on Titan", 19.9);
        Mangas eightSix = new Mangas(41L, "Eight Six", 15.9);

        Map<Consumidor, Mangas> consumidorMangasMap = new HashMap<>();

        consumidorMangasMap.put(consumidor01, onePiece);
        consumidorMangasMap.put(consumidor02, attackOnTitan);

        for(Map.Entry<Consumidor, Mangas> entry : consumidorMangasMap.entrySet()){
            System.out.println(entry.getKey().getName() + " : " + entry.getValue().getName());
        }


    }
}

