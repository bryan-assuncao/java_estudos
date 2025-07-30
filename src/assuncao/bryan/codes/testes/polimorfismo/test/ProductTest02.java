package assuncao.bryan.codes.testes.polimorfismo.test;

import assuncao.bryan.codes.testes.polimorfismo.domain.Eggs;
import assuncao.bryan.codes.testes.polimorfismo.domain.Product;
import assuncao.bryan.codes.testes.polimorfismo.domain.Tomato;
import assuncao.bryan.codes.testes.polimorfismo.service.CalculateProductsTax;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Eggs("Big Eggs", 15);
        Product product2 = new Tomato("Small Tomato", 8);


        CalculateProductsTax.taxProducts(product);

        System.out.println("----------------");

        CalculateProductsTax.taxProducts(product2);

    }
}
