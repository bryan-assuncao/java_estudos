package assuncao.bryan.codes.polimorfismo.service;

import assuncao.bryan.codes.polimorfismo.domain.Mouse;
import assuncao.bryan.codes.polimorfismo.domain.Product;

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
