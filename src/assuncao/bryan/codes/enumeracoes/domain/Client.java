package assuncao.bryan.codes.enumeracoes.domain;

public class Client {
    private String name;
    private ClientType clientType;
    private Days days;

    public Client(String name, ClientType clientType, Days days) {
        this.name = name;
        this.clientType = clientType;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType +
                ", days=" + days +
                '}';
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

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
    }
}
