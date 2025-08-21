package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.File;
import java.io.IOException;

public class IOTest02 {
    public static void main(String[] args) {
        File file = new File("currículo.doc");

        try {
            boolean meuCv = file.createNewFile();
            System.out.println("Arquivo criado " + meuCv);

            boolean delete = file.delete();
            System.out.println("Arquivo deletado " + delete);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
