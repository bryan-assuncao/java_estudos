package assuncao.bryan.codes.testes.polimorfismo02.domain;

public class Bovina extends Carnes{

    public static final double TAXA_BOVINA = 0.30;

    public Bovina(String tipo, double valor) {
        super(tipo, valor);
    }

    @Override
    public double imposto() {
        return this.valor * TAXA_BOVINA;
    }
}
