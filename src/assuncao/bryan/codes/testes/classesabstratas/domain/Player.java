package assuncao.bryan.codes.testes.classesabstratas.domain;

public abstract class Player {
    protected String nickName;
    protected String lane;

    public Player(String nickName, String lane) {
        this.nickName = nickName;
        this.lane = lane;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }
}
