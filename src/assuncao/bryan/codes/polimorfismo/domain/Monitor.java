package assuncao.bryan.codes.polimorfismo.domain;

public class Monitor extends Product{
    public static final double TAX_PERCENTAGE = 0.10;

    public Monitor(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        return this.value * TAX_PERCENTAGE;
    }
}
