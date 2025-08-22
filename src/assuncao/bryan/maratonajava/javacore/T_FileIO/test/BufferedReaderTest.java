package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\bryan.assuncao\\Downloads\\java_estudos\\arquivos\\text.txt";

        try (FileReader fileReader = new FileReader(path)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
