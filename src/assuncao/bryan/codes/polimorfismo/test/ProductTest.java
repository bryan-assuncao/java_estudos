package assuncao.bryan.codes.polimorfismo.test;

import assuncao.bryan.codes.polimorfismo.domain.Computer;
import assuncao.bryan.codes.polimorfismo.domain.Monitor;
import assuncao.bryan.codes.polimorfismo.domain.Mouse;
import assuncao.bryan.codes.polimorfismo.service.CalculateTax;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("NASA PC", 12000);
        Monitor monitor = new Monitor("LG 27NB", 2000);
        Mouse mouse = new Mouse("G304", 200);


        CalculateTax.calculateTax(computer);

        System.out.println("----------------------");

        CalculateTax.calculateTax(monitor);

        System.out.println("----------------------");

        CalculateTax.calculateTax(mouse);
    }
}
