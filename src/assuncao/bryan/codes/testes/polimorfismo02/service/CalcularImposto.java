package assuncao.bryan.codes.testes.polimorfismo02.service;

import assuncao.bryan.codes.testes.polimorfismo02.domain.Bovina;
import assuncao.bryan.codes.testes.polimorfismo02.domain.Suina;

public class CalcularImposto {

    public static void impostoBovino(Bovina bovina){
        double taxa = bovina.imposto();
        System.out.println("Carne: " + bovina.getTipo());
        System.out.println("Valor: " + bovina.getValor());
        System.out.println("Imposto: " + taxa);
    }

    public static void impostoSuino(Suina suina){
        double taxa = suina.imposto();
        System.out.println("Carne: " + suina.getTipo());
        System.out.println("Valor: " + suina.getValor());
        System.out.println("Taxa: " + taxa);
    }
}
