package assuncao.bryan.codes.testes.polimorfismo04.domain;

public abstract class LanHouse  implements TaxaPcGamer{
    private final String pc;
    private final double valorHora;

    public LanHouse(String pc, double valorHora) {
        this.pc = pc;
        this.valorHora = valorHora;
    }

    public String getPc() {
        return pc;
    }

    public double getValorHora() {
        return valorHora;
    }
}
