package assuncao.bryan.codes.testes.polimorfismo03.service;

import assuncao.bryan.codes.testes.polimorfismo03.domain.Product;
import assuncao.bryan.codes.testes.polimorfismo03.domain.Table;

public class CalculateTax {

    public static void TaxProducts(Product product){
        double tax = product.tax();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax: " + tax);

        if(product instanceof Table){
            boolean chairsInclude = ((Table) product).isChair();
            System.out.println("Are chairs include? " + chairsInclude);
        }
    }
}
