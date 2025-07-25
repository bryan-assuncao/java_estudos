package assuncao.bryan.codes.enumeracoes.domain;

public class Client {
    private String name;
    private final ClientType clientType;
    private final Payment payment;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType.getRelatoryName() +
                ", clientTypeInt=" + clientType.getValor() +
                ", payment=" + payment +
                '}';
    }

    public Client(String name, ClientType clientType, Payment payment) {
        this.name = name;
        this.clientType = clientType;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public Payment getPayment() {
        return payment;
    }

}
