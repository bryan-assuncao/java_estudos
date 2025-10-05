package assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo.test;

import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo.domain.Eggs;
import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo.domain.Product;
import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo.domain.Tomato;
import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo.service.CalculateProductsTax;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Eggs("Big Eggs", 15);
        Product product2 = new Tomato("Small Tomato", 8);


        CalculateProductsTax.taxProducts(product);

        System.out.println("----------------");

        CalculateProductsTax.taxProducts(product2);

    }
}
