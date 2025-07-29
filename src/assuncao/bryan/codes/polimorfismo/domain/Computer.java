package assuncao.bryan.codes.polimorfismo.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.20;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        return this.value * TAX_PERCENTAGE;
    }



}
