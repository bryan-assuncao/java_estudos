package assuncao.bryan.codes.testes.polimorfismo.service;

import assuncao.bryan.codes.testes.polimorfismo.domain.Eggs;
import assuncao.bryan.codes.testes.polimorfismo.domain.Tomato;

public class CalculateProductsTax {

    public static void calculateEggs(Eggs eggs){
        double tax = eggs.productTax();
        System.out.println("Product: " + eggs.getProductName());
        System.out.println("Value: " + eggs.getProductValue());
        System.out.println("Tax: " + tax);
    }

    public static void calculateTomato(Tomato tomato){
        double tax = tomato.productTax();
        System.out.println("Product: " + tomato.getProductName());
        System.out.println("Value: " + tomato.getProductValue());
        System.out.println("Tax: " +  tax);
    }
}
