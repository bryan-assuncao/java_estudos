package assuncao.bryan.maratonajava.javacore.Nexcecoes.test;

import assuncao.bryan.maratonajava.javacore.Nexcecoes.domain.Funcionario;
import assuncao.bryan.maratonajava.javacore.Nexcecoes.domain.LoginInvalidoException;
import assuncao.bryan.maratonajava.javacore.Nexcecoes.domain.Pessoa;

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
