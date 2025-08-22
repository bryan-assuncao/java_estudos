package assuncao.bryan.maratonajava.javacore.M_Polimorfismo.test;


import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.domain.Computer;
import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.domain.Monitor;
import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.domain.Mouse;
import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.domain.Product;
import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.service.CalculateTax;

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
