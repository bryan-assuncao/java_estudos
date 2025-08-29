package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now();
        Path novoPath = Paths.get("arquivos/novo_path.txt");
        Files.createFile(novoPath);

        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));

        Files.setLastModifiedTime(novoPath, fileTime);

        System.out.println(Files.isWritable(novoPath));
        System.out.println(Files.isReadable(novoPath));
        System.out.println(Files.isExecutable(novoPath));
    }
}