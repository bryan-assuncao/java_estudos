package assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo04.domain;

public class Pc01 extends LanHouse {
    private final static double TAXA_PC01 = 0.20;

    public Pc01(String pc, double valorHora) {
        super(pc, valorHora);
    }

    @Override
    public double taxa() {
        return this.getValorHora() * TAXA_PC01;
    }
}
