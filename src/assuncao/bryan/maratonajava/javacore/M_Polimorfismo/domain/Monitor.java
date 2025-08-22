package assuncao.bryan.maratonajava.javacore.M_Polimorfismo.domain;

public class Monitor extends Product{
    public static final double TAX_PERCENTAGE = 0.10;

    public Monitor(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX_PERCENTAGE;
    }
}
