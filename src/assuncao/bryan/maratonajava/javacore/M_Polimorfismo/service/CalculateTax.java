package assuncao.bryan.maratonajava.javacore.Mpolimorfismo.service;

import assuncao.bryan.maratonajava.javacore.Mpolimorfismo.domain.Mouse;
import assuncao.bryan.maratonajava.javacore.Mpolimorfismo.domain.Product;

public class CalculateTax {

    public static void calculateTax(Product product) {
        double tax = product.calculateTax();
        System.out.println("Name: " + product.getName());
        System.out.println("Product: " + product.getPrice());
        System.out.println("Tax: " + tax);

        if (product instanceof Mouse) {
            String mouseGuarantee = ((Mouse) product).getGuarantee();
            System.out.println("Guarantee: " + mouseGuarantee);
        }
    }
}
