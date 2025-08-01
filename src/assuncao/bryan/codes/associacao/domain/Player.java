package assuncao.bryan.codes.associacao.domain;

public class Player {
    private String name;
    private Team team;

    public Player(String name){
        this.name = name;
    }

    public void printPlayer(){
        System.out.println(this.name);
        if (this.team != null){
            System.out.println(this.team.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
