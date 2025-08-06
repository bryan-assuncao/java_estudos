package assuncao.bryan.maratonajava.javacore.excecoes.test;

import assuncao.bryan.maratonajava.javacore.excecoes.domain.Funcionario;
import assuncao.bryan.maratonajava.javacore.excecoes.domain.LoginInvalidoException;
import assuncao.bryan.maratonajava.javacore.excecoes.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest {
    public static void main(String[] args) throws FileNotFoundException, LoginInvalidoException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        pessoa.salvar();

        System.out.println("---------");

        funcionario.salvar();
    }

}
