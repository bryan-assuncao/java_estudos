package assuncao.bryan.codes.testes.polimorfismo02.domain;

public class Suina extends Carnes{
    public static final double TAXA_SUINA = 0.14;

    public Suina(String tipo, double valor) {
        super(tipo, valor);
    }

    @Override
    public double imposto() {
        return this.valor * TAXA_SUINA;
    }
}
