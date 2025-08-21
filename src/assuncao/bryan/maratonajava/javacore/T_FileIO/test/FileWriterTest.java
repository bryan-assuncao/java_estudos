package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Oda gênio");
            System.out.println("Arquivo criado.");
            fw.flush(); // força a gravação imediata
        } catch (IOException e){
            throw new IOException();
        }
    }
}



