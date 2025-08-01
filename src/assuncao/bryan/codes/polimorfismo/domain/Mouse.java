package assuncao.bryan.codes.polimorfismo.domain;

public class Mouse extends Product {
    private String guarantee;

    public final static double TAX_PERCENTAGE = 0.20;

    public Mouse(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX_PERCENTAGE;
    }

    public String getGuarantee() {
        return guarantee;
    }
}
