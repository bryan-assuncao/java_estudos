package assuncao.bryan.codes.testes.classesabstratas.domain;

public class HighEnd extends Player {
    private String elo;

    public HighEnd(String nickName, String lane, String elo) {
        super(nickName, lane);
        this.elo = elo;
    }

    public void print(){
        System.out.println("Nick: " + this.nickName);
        System.out.println("Nick: " + this.lane);
        System.out.println("Elo: " + this.elo);
        dive();
    }

    @Override
    public void dive() {
        System.out.println("dive");
    }

    @Override
    public String toString() {
        return "HighEnd{" +
                "elo='" + elo + '\'' +
                ", nickName='" + nickName + '\'' +
                ", lane='" + lane + '\'' +
                '}';
    }

    public String getElo() {
        return elo;
    }

    public void setElo(String elo) {
        this.elo = elo;
    }
}
