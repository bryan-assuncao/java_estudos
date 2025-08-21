package assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo02.domain;

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
