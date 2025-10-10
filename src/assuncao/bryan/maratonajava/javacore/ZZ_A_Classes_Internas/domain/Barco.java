package assuncao.bryan.maratonajava.javacore.ZZ_A_Classes_Internas.domain;

public class Barco {
    public String name;

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
