package assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo.domain;

public abstract class Product implements ProductTax{
    protected String productName;
    protected double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
