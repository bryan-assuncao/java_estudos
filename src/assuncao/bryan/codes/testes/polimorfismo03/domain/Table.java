package assuncao.bryan.codes.testes.polimorfismo03.domain;

public class Table extends Product {
    private boolean chair = false;

    public final static double TAX_TABLE = 0.40;

    public Table(String name, double value) {
        super(name, value);
    }

    @Override
    public double tax() {
        return this.value * TAX_TABLE;
    }

    public boolean isChair() {
        return chair;
    }
}
