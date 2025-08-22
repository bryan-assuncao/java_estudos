package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) throws IOException {
        Path pastas = Paths.get("Pasta/Subpasta/Subsubpasta");
        Files.createDirectories(pastas);

        Path filePath = Paths.get(pastas.toString());
        Files.createFile(pastas);

    }
}



