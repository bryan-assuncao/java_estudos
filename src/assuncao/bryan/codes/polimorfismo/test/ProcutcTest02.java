package assuncao.bryan.codes.polimorfismo.test;


import assuncao.bryan.codes.polimorfismo.domain.Computer;
import assuncao.bryan.codes.polimorfismo.domain.Monitor;
import assuncao.bryan.codes.polimorfismo.domain.Mouse;
import assuncao.bryan.codes.polimorfismo.domain.Product;
import assuncao.bryan.codes.polimorfismo.service.CalculateTax;

public class ProcutcTest02 {
    public static void main(String[] args) {

        Product product = new Computer("Ryzen 9", 3000);
        Product product2 = new Monitor("LG32K", 2000);
        Product product3 = new Mouse("G203", 100);


        CalculateTax.calculateTax(product);

        System.out.println("-------------");

        CalculateTax.calculateTax(product2);

        System.out.println("-------------");

        CalculateTax.calculateTax(product3);




    }
}
