package assuncao.bryan.codes.testes.classesabstratas.domain;

public class Bryan1v9 extends Player{

    public Bryan1v9(String nickName, String lane) {
        super(nickName, lane);
    }

    public void printBryan1v9(){
        System.out.println("Nick: " + this.nickName);
        System.out.println("Lane: " + this.lane);
    }

    @Override
    public String toString() {
        return "Bryan1v9{" +
                "nickName='" + nickName + '\'' +
                ", lane='" + lane + '\'' +
                '}';
    }
}
