package assuncao.bryan.codes.testes.polimorfismo.domain;

public class Eggs extends Product{
    public static final double TAX_PERCENTAGE = 0.35;

    public Eggs(String productName, double productValue) {
        super(productName, productValue);
    }

    @Override
    public double productTax() {
        return this.productValue * TAX_PERCENTAGE;
    }
}
