package assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.domain;

public class Eggs extends Product{
    private static final double TAX_PERCENTAGE = 0.35;

    public Eggs(String productName, double productPrice) {
        super(productName, productPrice);
    }

    @Override
    public double productTax() {
        return this.productPrice * TAX_PERCENTAGE;
    }
}
