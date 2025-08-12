package assuncao.bryan.maratonajava.javacore.Ztestes.enumeracoes.domain;

public enum Pagamento {
    DEBITO{
        @Override
        public double desconto(double desconto) {
            return desconto * 0.10;
        }
    }, CREDITO{
        @Override
        public double desconto(double desconto) {
            return desconto * 0.05;
        }
    };

    public abstract double desconto(double desconto);
}
