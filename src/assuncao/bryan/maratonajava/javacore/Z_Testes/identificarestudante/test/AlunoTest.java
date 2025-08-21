package assuncao.bryan.maratonajava.javacore.Ztestes.identificarestudante.test;

import assuncao.bryan.maratonajava.javacore.Ztestes.identificarestudante.domain.Aluno;
import assuncao.bryan.maratonajava.javacore.Ztestes.identificarestudante.domain.Bolsista;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bryan", "Regular");

        Bolsista aluno2 = new Bolsista("Bryan");

        aluno.identificar();

        aluno2.identificar();
    }
}
