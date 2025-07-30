package assuncao.bryan.codes.testes.polimorfismo03.domain;

public class Table extends Product {
    private final boolean chair = false;

    public final static double TAX_TABLE = 0.40;

    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public double tax() {
        return this.price * TAX_TABLE;
    }

    public boolean isChair() {
        return chair;
    }
}
