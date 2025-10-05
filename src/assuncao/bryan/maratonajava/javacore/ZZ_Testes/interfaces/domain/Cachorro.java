package assuncao.bryan.maratonajava.javacore.Z_Testes.interfaces.domain;

public class Cachorro implements Animal, Domesticado{
    @Override
    public void emitorSom() {
        System.out.println("Au au");
    }

    @Override
    public void domesticado() {
        System.out.println("Sim");
    }
}
