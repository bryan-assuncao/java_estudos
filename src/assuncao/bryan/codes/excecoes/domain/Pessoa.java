package assuncao.bryan.codes.excecoes.domain;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar()throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando");
    }
}
