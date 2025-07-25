package assuncao.bryan.codes.enumeracoes.domain;

public enum ClientType {
    CPF(1, "Pessoa Física"),
    MEI(2, "Pessoa Jurídica");

    public final int valor;
    public final String nomeRelatorio;

    ClientType(int valor, String nomeRelatorio ) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
