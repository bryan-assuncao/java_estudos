package assuncao.bryan.maratonajava.javacore.testes.sistemaescolar.domain;

public class Docente extends Pessoa{
    private String disciplina;

    public Docente(String name, int idade, String disciplina) {
        super(name, idade);
        this.disciplina = disciplina;
    }

    public Docente(String name, int idade) {
        super(name, idade);
    }

    public String getDisciplina() {
        return disciplina;
    }
}
