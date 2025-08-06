package assuncao.bryan.maratonajava.javacore.excecoes.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException, ArithmeticException {
        super.salvar();
    }

}
