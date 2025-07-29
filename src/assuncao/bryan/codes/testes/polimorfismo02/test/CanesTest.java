package assuncao.bryan.codes.testes.polimorfismo02.test;

import assuncao.bryan.codes.testes.polimorfismo02.domain.Bovina;
import assuncao.bryan.codes.testes.polimorfismo02.domain.Suina;
import assuncao.bryan.codes.testes.polimorfismo02.service.CalcularImposto;

public class CanesTest {
    public static void main(String[] args) {
        Bovina bovina = new Bovina("Bovina", 25);
        Suina suina = new Suina("Suína", 15);

        CalcularImposto.impostoBovino(bovina);

        System.out.println("-------------------");

        CalcularImposto.impostoSuino(suina);
    }
}
