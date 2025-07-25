package assuncao.bryan.codes.enumeracoes.domain;

public enum Payment {
    CREDIT {
        @Override
        public double calcularDesconto(double desconto) {
            return desconto * 0.05;
        }
    },
    DEBIT {
        @Override
        public double calcularDesconto(double desconto) {
            return desconto * 0.10;
        }
    };

    public abstract double calcularDesconto(double desconto);

}
