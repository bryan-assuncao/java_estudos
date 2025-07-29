package assuncao.bryan.codes.testes.polimorfismo.test;

import assuncao.bryan.codes.testes.polimorfismo.domain.Eggs;
import assuncao.bryan.codes.testes.polimorfismo.domain.Tomato;
import assuncao.bryan.codes.testes.polimorfismo.service.CalculateProductsTax;

public class ProductsTest {
    public static void main(String[] args) {
        Eggs eggs = new Eggs("Eggs", 15);
        Tomato tomato = new Tomato("Tomato", 9);

        CalculateProductsTax.calculateEggs(eggs);

        System.out.println("------------------");

        CalculateProductsTax.calculateTomato(tomato);
    }
}
