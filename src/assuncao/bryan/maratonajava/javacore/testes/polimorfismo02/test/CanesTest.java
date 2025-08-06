package assuncao.bryan.maratonajava.javacore.testes.polimorfismo02.test;

import assuncao.bryan.maratonajava.javacore.testes.polimorfismo02.domain.Bovina;
import assuncao.bryan.maratonajava.javacore.testes.polimorfismo02.domain.Carnes;
import assuncao.bryan.maratonajava.javacore.testes.polimorfismo02.domain.Suina;
import assuncao.bryan.maratonajava.javacore.testes.polimorfismo02.service.CalcularImposto;

public class CanesTest {
    public static void main(String[] args) {
        Carnes carne = new Bovina("Bovina", 25);
        Carnes carne2 = new Suina("Suína", 15);

        CalcularImposto.imposto(carne);

        System.out.println("-------------------");

        CalcularImposto.imposto(carne2); 

    }
}
