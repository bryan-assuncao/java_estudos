package assuncao.bryan.codes.excecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest04 {
    public static void main(String[] args) throws IOException{
        trycat();
    }

    private static void trycat() throws IOException{
        File file = new File("pasta teste/arquivo teste.txt");

        try {
            boolean criarArquivo = file.createNewFile();
            System.out.println("Arquivo criado " + criarArquivo);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
