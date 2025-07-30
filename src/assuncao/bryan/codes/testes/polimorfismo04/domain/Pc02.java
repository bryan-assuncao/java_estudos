package assuncao.bryan.codes.testes.polimorfismo04.domain;

public class Pc02 extends LanHouse{

    public Pc02(String pc, double valorHora) {
        super(pc, valorHora);
    }

    @Override
    public double taxa() {
        return 0;
    }
}
