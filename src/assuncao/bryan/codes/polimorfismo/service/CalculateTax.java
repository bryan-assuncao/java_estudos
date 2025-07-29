package assuncao.bryan.codes.polimorfismo.service;

import assuncao.bryan.codes.polimorfismo.domain.Computer;
import assuncao.bryan.codes.polimorfismo.domain.Monitor;

public class CalculateTax {

    public static void computerTax(Computer computer){
        double tax = computer.calculateTax();

        System.out.println("Name: " + computer.getName());
        System.out.println("Product: " + computer.getValue());
        System.out.println("Tax: " + tax);
    }

    public static void monitorTax(Monitor monitor){
        double tax = monitor.calculateTax();

        System.out.println("Name: " + monitor.getName());
        System.out.println("Product: " + monitor.getValue());
        System.out.println("Tax: " + tax);
    }
}
