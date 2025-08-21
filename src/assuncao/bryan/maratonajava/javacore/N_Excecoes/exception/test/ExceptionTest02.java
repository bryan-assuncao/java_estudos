package assuncao.bryan.maratonajava.javacore.N_Excecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        trycat();
    }

    private static void trycat(){
        File file = new File("pasta teste/arquivo teste.txt");

        try {
            boolean criarArquivo = file.createNewFile();
            System.out.println("Arquivo criado " + criarArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
