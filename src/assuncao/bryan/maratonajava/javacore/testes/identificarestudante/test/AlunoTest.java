package assuncao.bryan.maratonajava.javacore.testes.identificarestudante.test;

import assuncao.bryan.maratonajava.javacore.testes.identificarestudante.domain.Aluno;
import assuncao.bryan.maratonajava.javacore.testes.identificarestudante.domain.Bolsista;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bryan", "Regular");

        Bolsista aluno2 = new Bolsista("Bryan");

        aluno.identificar();

        aluno2.identificar();
    }
}
