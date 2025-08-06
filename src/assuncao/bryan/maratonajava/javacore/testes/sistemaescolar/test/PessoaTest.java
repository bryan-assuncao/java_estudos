package assuncao.bryan.maratonajava.javacore.testes.sistemaescolar.test;

import assuncao.bryan.maratonajava.javacore.testes.sistemaescolar.domain.Aluno;
import assuncao.bryan.maratonajava.javacore.testes.sistemaescolar.domain.Docente;
import assuncao.bryan.maratonajava.javacore.testes.sistemaescolar.domain.Pessoa;
import assuncao.bryan.maratonajava.javacore.testes.sistemaescolar.service.Prints;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Aluno("Bryan", 24, 10);
        Pessoa pessoa2 = new Docente("Guanabara", 44, "Java");

        Prints.Print(pessoa);

        System.out.println("--------------------------------------------------");

        Prints.Print(pessoa2);


    }


}
