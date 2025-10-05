package assuncao.bryan.maratonajava.javacore.Z_Testes.filesIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\bryan.assuncao\\Downloads\\java_estudos\\arquivos\\file.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write("Narutoooooooooooooooo");
            bufferedWriter.newLine();
            bufferedWriter.write("Sasukeeeeeeeeeeeeeeee");
            bufferedWriter.flush();
            System.out.println("Arquivo criado.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
