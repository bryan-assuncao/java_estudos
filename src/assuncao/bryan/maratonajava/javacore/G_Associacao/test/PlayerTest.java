package assuncao.bryan.maratonajava.javacore.G_Associacao.test;

import assuncao.bryan.maratonajava.javacore.G_Associacao.domain.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player p1 = new Player("Neymar");
        Player p2 = new Player("Kaka");
        Player p3 = new Player("Messi");

        Player[] players = {p1, p2, p3};

        for(Player player : players){
            player.printPlayer();
        }

    }
}
