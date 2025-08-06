package assuncao.bryan.codes.excecoes.test;

import assuncao.bryan.codes.excecoes.domain.Funcionario;
import assuncao.bryan.codes.excecoes.domain.LoginInvalidoException;
import assuncao.bryan.codes.excecoes.domain.Pessoa;

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
