package assuncao.bryan.maratonajava.javacore.Z_Testes.interfaces.test;

import assuncao.bryan.maratonajava.javacore.Z_Testes.interfaces.domain.Cachorro;
import assuncao.bryan.maratonajava.javacore.Z_Testes.interfaces.domain.Gato;

public class AnimalTest {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitorSom();
        cachorro.domesticado();
        gato.emitorSom();
    }
}
