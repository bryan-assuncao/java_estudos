package assuncao.bryan.maratonajava.javacore.testes.sistemaescolar.domain;

public abstract class Pessoa {
    private final String name;
    private final int idade;

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }
}
