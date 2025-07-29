package assuncao.bryan.codes.testes.interfaces.test;

import assuncao.bryan.codes.testes.interfaces.domain.Animal;
import assuncao.bryan.codes.testes.interfaces.domain.Cachorro;
import assuncao.bryan.codes.testes.interfaces.domain.Gato;

public class AnimalTest {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitorSom();
        cachorro.domesticado();
        gato.emitorSom();
    }
}
