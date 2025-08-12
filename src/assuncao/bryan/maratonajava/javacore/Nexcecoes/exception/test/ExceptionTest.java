package assuncao.bryan.maratonajava.javacore.Nexcecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo/teste.txt");

        File file02 = new File("arquivo/teste02.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);

            boolean isCriado2 = file02.createNewFile();
            System.out.println("Arquivo 02 criado " + isCriado2);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}



