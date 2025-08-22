package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\bryan.assuncao\\Downloads\\java_estudos\\arquivos\\file.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}









