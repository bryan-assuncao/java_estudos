package assuncao.bryan.codes.testes.polimorfismo.domain;

public class Tomato extends Product{
    public static final double TAX_PERCENTAGE = 0.40;

    public Tomato(String productName, double productValue) {
        super(productName, productValue);
    }

    @Override
    public double productTax() {
        return this.productValue * TAX_PERCENTAGE;
    }
}
