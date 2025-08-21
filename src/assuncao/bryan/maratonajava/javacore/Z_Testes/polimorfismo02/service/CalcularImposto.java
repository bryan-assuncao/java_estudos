package assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo02.service;

import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo02.domain.Carnes;
import assuncao.bryan.maratonajava.javacore.Ztestes.polimorfismo02.domain.Suina;

public class CalcularImposto {

    public static void imposto(Carnes carnes) {
        double imposto = carnes.imposto();
        System.out.println("Carne: " + carnes.getTipo());
        System.out.println("Preço: " + carnes.getValor());
        System.out.println("Imposto: " + imposto);

        if (carnes instanceof Suina) {
            String validade = ((Suina) carnes).getDataValidade();
            System.out.println("Validade: " + validade);
        }

    }
}