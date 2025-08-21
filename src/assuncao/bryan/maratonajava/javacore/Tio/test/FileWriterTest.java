package assuncao.bryan.maratonajava.javacore.Tio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Oda gênio");
            System.out.println("Arquivo criado.");
            fw.flush();
        } catch (IOException e){
            throw new IOException();
        }
    }
}



