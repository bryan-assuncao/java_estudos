package assuncao.bryan.maratonajava.javacore.testes.sistemaescolar.domain;

public class Aluno extends Pessoa{
    private double nota;

    public Aluno(String name, int idade, double nota) {
        super(name, idade);
        this.nota = nota;
    }

    public Aluno(String name, int idade) {
        super(name, idade);
    }

    public double getNota() {
        return nota;
    }
}
