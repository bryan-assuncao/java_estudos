package assuncao.bryan.maratonajava.javacore.Z_Generics.domain;

public class Carro {
    private String name;

    public Carro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                '}';
    }
}
