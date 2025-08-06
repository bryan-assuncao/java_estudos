package assuncao.bryan.maratonajava.javacore.enumeracoes.domain;

public enum ClientType {
    CPF(1, "Pessoa Física"),
    MEI(2, "Pessoa Jurídica");

    public final int valor;
    public final String relatoryName;

    ClientType(int valor, String relatoryName ) {
        this.valor = valor;
        this.relatoryName = relatoryName;
    }
        

    public int getValor() {
        return valor;
    }

    public String getRelatoryName() {
        return relatoryName;
    }
}
