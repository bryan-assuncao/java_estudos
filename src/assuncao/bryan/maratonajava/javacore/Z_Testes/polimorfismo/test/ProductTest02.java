package assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.test;

import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.domain.Eggs;
import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.domain.Product;
import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.domain.Tomato;
import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.service.CalculateProductsTax;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Eggs("Big Eggs", 15);
        Product product2 = new Tomato("Small Tomato", 8);


        CalculateProductsTax.taxProducts(product);

        System.out.println("----------------");

        CalculateProductsTax.taxProducts(product2);

    }
}
