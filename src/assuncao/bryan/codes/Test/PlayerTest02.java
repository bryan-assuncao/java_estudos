package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.association.domain.Player;
import assuncao.bryan.codes.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldinho Gaúcho");
        Team team1 = new Team("Brazil");

        player1.setTeam(team1);
        player1.printPlayer();


    }
}
