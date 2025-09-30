package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Consumidor;
import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Mangas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor(null,"Bryan");

        Mangas onePiece = new Mangas(100L, "One Piece", 100);
        Mangas naruto = new Mangas(29L, "Naruto", 29.9);
        Mangas attackOnTitan = new Mangas(31L, "Attack on Titan", 19.9);

        List<Mangas> mangaConsumidor01List = List.of(onePiece, naruto, attackOnTitan);
        Map<Consumidor, List<Mangas>> consumidorMangasMap = new HashMap<>();

        consumidorMangasMap.put(consumidor01, mangaConsumidor01List);

        for (Map.Entry<Consumidor, List<Mangas>> entry : consumidorMangasMap.entrySet()){
            System.out.println(entry.getKey().getName());
            for (Mangas mangas : entry.getValue()) {
                System.out.println(mangas.getName());
            }

        }



    }
}

