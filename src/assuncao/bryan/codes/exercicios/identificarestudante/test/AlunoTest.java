package assuncao.bryan.codes.exercicios.identificarestudante.test;

import assuncao.bryan.codes.exercicios.identificarestudante.domain.Aluno;
import assuncao.bryan.codes.exercicios.identificarestudante.domain.Bolsista;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bryan", "Regular");

        Bolsista aluno2 = new Bolsista("Bryan");

        aluno.identificar();

        aluno2.identificar();
    }
}
