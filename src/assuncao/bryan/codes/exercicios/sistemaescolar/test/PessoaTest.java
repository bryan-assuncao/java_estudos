package assuncao.bryan.codes.exercicios.sistemaescolar.test;

import assuncao.bryan.codes.exercicios.sistemaescolar.domain.Aluno;
import assuncao.bryan.codes.exercicios.sistemaescolar.domain.Docente;
import assuncao.bryan.codes.exercicios.sistemaescolar.domain.Pessoa;
import assuncao.bryan.codes.exercicios.sistemaescolar.service.Prints;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Aluno("Bryan", 24, 10);
        Pessoa pessoa2 = new Docente("Guanabara", 44, "Java");

        Prints.Print(pessoa);

        System.out.println("--------------------------------------------------");

        Prints.Print(pessoa2);


    }


}
