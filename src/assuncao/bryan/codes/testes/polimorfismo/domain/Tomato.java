package assuncao.bryan.codes.testes.polimorfismo.domain;

public class Tomato extends Product{
    private final String expiryDate ="30/07/2025";
    private static final double TAX_PERCENTAGE = 0.40;

    public Tomato(String productName, double productPrice) {
        super(productName, productPrice);
    }

    @Override
    public double productTax() {
        return this.productPrice * TAX_PERCENTAGE;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
