package assuncao.bryan.codes.polimorfismo.test;

import assuncao.bryan.codes.polimorfismo.domain.Computer;
import assuncao.bryan.codes.polimorfismo.domain.Monitor;
import assuncao.bryan.codes.polimorfismo.service.CalculateTax;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("NASA PC", 12000);
        Monitor monitor = new Monitor("LG 27NB", 2000);


        CalculateTax.computerTax(computer);

        System.out.println("----------------------");

        CalculateTax.monitorTax(monitor);
    }
}
