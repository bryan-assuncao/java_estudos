package assuncao.bryan.maratonajava.javacore.N_Excecoes.domain;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar()throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando");
    }
}
