package assuncao.bryan.maratonajava.javacore.excecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        criarArquivo();
    }

    private static void criarArquivo(){
        File file = new File("pasta teste/novo arquivo criado.doc");

        try{
            boolean novoArquivo = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
