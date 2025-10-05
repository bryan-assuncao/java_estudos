package assuncao.bryan.maratonajava.javacore.Z_Testes.path.domain.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributeTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivos/file.txt");

        BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime lastModifiedTime = bfa.lastModifiedTime();
        System.out.println(lastModifiedTime);
    }
}
