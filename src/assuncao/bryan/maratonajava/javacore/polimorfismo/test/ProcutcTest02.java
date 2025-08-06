package assuncao.bryan.maratonajava.javacore.polimorfismo.test;


import assuncao.bryan.maratonajava.javacore.polimorfismo.domain.Computer;
import assuncao.bryan.maratonajava.javacore.polimorfismo.domain.Monitor;
import assuncao.bryan.maratonajava.javacore.polimorfismo.domain.Mouse;
import assuncao.bryan.maratonajava.javacore.polimorfismo.domain.Product;
import assuncao.bryan.maratonajava.javacore.polimorfismo.service.CalculateTax;

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
