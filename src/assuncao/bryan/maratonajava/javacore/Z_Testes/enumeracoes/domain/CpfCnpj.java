package assuncao.bryan.maratonajava.javacore.Ztestes.enumeracoes.domain;

public enum CpfCnpj {
    CPF(1), CNPJ(2);

    public final int valor;

    CpfCnpj(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
