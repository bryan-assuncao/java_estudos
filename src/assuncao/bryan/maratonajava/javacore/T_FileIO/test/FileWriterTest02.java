package assuncao.bryan.maratonajava.javacore.T_FileIO.test;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest02 {
    public static void main(String[] args) throws IOException {
        File file = new File("arquivo_de_texto.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("One Piece é arte.");
            fileWriter.flush();
            System.out.printf("Arquivo criado e escrito.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



