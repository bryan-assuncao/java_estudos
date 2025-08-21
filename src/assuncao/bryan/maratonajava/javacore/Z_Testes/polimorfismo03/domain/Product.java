package assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo03.domain;

public abstract class Product implements Tax {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
