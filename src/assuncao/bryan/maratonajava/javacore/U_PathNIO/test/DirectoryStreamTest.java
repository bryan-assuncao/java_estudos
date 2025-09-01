package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\bryan.assuncao\\Downloads\\java_estudos");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
            for(Path path1: stream){
                System.out.println(path1);
            }
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



