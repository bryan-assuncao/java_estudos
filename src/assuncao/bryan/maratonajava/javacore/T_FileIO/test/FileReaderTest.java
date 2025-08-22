package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\bryan.assuncao\\Downloads\\java_estudos\\arquivos\\text.txt");
        try (FileReader fr = new FileReader(file)) {

            int letra;
            while ((letra = fr.read()) != -1){
                System.out.print((char)letra);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
