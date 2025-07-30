package assuncao.bryan.codes.testes.polimorfismo03.domain;

public class Window extends Product{
    public final static double TAX_PERCENTAGE = 0.30;

    public Window(String name, double value) {
        super(name, value);
    }

    @Override
    public double tax() {
        return this.value * TAX_PERCENTAGE;
    }
}
