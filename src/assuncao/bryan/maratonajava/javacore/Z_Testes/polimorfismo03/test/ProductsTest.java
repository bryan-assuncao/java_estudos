package assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo03.test;

import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo03.domain.Product;
import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo03.domain.Table;
import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo03.domain.Window;
import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo03.service.CalculateTax;

public class ProductsTest {
    public static void main(String[] args) {
        Product product = new Window("Window", 2000);
        Product product2 = new Table("Table", 1200);

        CalculateTax.TaxProducts(product);

        System.out.println("----------------");

        CalculateTax.TaxProducts(product2);

    }
}
