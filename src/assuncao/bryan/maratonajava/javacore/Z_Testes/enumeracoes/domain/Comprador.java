package assuncao.bryan.maratonajava.javacore.Ztestes.enumeracoes.domain;

public class Comprador {
    private String name;
    private final Pagamento pagamento;
    private final CpfCnpj cpfCnpj;

    @Override
    public String toString() {
        return "Comprador{" +
                "name='" + name + '\'' +
                ", pagamento=" + pagamento +
                ", cpfCnpj=" + cpfCnpj +
                ", cpfCnpjINT=" + cpfCnpj.getValor() +
                '}';
    }

    public Comprador(String name, Pagamento pagamento, CpfCnpj cpfCnpj) {
        this.name = name;
        this.pagamento = pagamento;
        this.cpfCnpj = cpfCnpj;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public CpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
