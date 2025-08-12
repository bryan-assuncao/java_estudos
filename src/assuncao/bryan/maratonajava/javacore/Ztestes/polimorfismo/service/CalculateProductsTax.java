package assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.service;

import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.domain.Product;
import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo.domain.Tomato;

public class CalculateProductsTax {

    public static void taxProducts(Product product){
        double tax = product.productTax();
        System.out.println("Product: " + product.getProductName());
        System.out.println("Product: " + product.getProductPrice());
        System.out.println("Product: " + tax);

        if(product instanceof Tomato){
            String expiryDate = ((Tomato) product).getExpiryDate();
            System.out.println("Expiry date: " + expiryDate);
        }
    }
}
