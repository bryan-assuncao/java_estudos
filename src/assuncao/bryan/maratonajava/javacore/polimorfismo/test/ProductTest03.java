package assuncao.bryan.maratonajava.javacore.polimorfismo.test;

import assuncao.bryan.maratonajava.javacore.polimorfismo.domain.Computer;
import assuncao.bryan.maratonajava.javacore.polimorfismo.domain.Monitor;
import assuncao.bryan.maratonajava.javacore.polimorfismo.domain.Mouse;
import assuncao.bryan.maratonajava.javacore.polimorfismo.domain.Product;
import assuncao.bryan.maratonajava.javacore.polimorfismo.service.CalculateTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Product produc2 = new Monitor("SM 27", 2000);

        Mouse mouse = new Mouse("G504", 400);

        mouse.setGuarantee("30/07/2025");


        CalculateTax.calculateTax(mouse);



    }
}
