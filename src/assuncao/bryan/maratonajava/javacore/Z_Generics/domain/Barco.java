package assuncao.bryan.maratonajava.javacore.Z_Generics.domain;

public class Barco {
    private String name;

    public Barco(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "name='" + name + '\'' +
                '}';
    }
}
