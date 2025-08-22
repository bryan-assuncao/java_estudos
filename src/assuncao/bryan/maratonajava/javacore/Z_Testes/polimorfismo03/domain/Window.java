package assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo03.domain;

public class Window extends Product{
    public final static double TAX_PERCENTAGE = 0.30;

    public Window(String name, double price) {
        super(name, price);
    }

    @Override
    public double tax() {
        return this.price * TAX_PERCENTAGE;
    }
}
