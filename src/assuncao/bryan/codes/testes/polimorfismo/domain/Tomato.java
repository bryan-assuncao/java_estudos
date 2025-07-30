package assuncao.bryan.codes.testes.polimorfismo.domain;

public class Tomato extends Product{
    private String expiryDate ="30/07/2025";
    public static final double TAX_PERCENTAGE = 0.40;

    public Tomato(String productName, double productValue) {
        super(productName, productValue);
    }

    @Override
    public double productTax() {
        return this.productValue * TAX_PERCENTAGE;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
