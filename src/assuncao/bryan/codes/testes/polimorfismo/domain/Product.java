package assuncao.bryan.codes.testes.polimorfismo.domain;

public abstract class Product implements ProductTax{
    protected String productName;
    protected double productValue;

    public Product(String productName, double productValue) {
        this.productName = productName;
        this.productValue = productValue;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductValue() {
        return productValue;
    }
}
