package assuncao.bryan.maratonajava.javacore.testes.interfaces.test;

import assuncao.bryan.maratonajava.javacore.testes.interfaces.domain.Cachorro;
import assuncao.bryan.maratonajava.javacore.testes.interfaces.domain.Gato;

public class AnimalTest {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitorSom();
        cachorro.domesticado();
        gato.emitorSom();
    }
}
