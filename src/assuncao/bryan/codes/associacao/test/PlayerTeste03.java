package assuncao.bryan.codes.associacao.test;

import assuncao.bryan.codes.associacao.domain.Player;
import assuncao.bryan.codes.associacao.domain.Team;

public class PlayerTeste03 {
    public static void main(String[] args) {
        Player player = new Player("Falen");
        Player player02 = new Player("Coldzera");
        Team team = new Team("Brazil");
        Player[] players = {player, player02};

        System.out.println("--- Player ---");
        player.setTeam(team);
        player.printPlayer();

        System.out.println("--- Player ---");
        team.setPlayers(players);
        team.printTeam();

    }
}
