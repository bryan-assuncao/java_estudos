package assuncao.bryan.codes.polimorfismo.domain;

public class Mouse extends Product {
    private String guarantee;

    public final static double TAX_PERCENTAGE = 0.20;

    public Mouse(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        return this.value * TAX_PERCENTAGE;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }
}
