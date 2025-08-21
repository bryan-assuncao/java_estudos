package assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo02.domain;

public class Suina extends Carnes{
    private String dataValidade = "12/12/2025";

    public static final double TAXA_SUINA = 0.14;

    public Suina(String tipo, double valor) {
        super(tipo, valor);
    }

    @Override
    public double imposto() {
        return this.valor * TAXA_SUINA;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
