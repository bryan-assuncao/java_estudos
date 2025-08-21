package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest02 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\bryan.assuncao\\Downloads\\java_estudos\\arquivos\\text.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
            br.write("Zoro");
            br.newLine();
            br.write("Sola");
            br.flush();

            System.out.println("Arquivo criado.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}











