package assuncao.bryan.maratonajava.javacore.N_Excecoes.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException, ArithmeticException {
        super.salvar();
    }

}
