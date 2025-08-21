package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("texto.txt");
        try (FileReader fr = new FileReader(file)) {
            System.out.println(fr.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
