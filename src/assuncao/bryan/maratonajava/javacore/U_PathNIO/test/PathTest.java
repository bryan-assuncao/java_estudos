package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest {
    public static void main(String[] args) throws IOException {
        Path pastas = Paths.get("Pasta/Subpasta/Subsubpasta");
        Path arquivo = Paths.get("Pasta/Subpasta/Subsubpasta/arquivo.txt");

        if (Files.notExists(pastas)) {
            Files.createDirectories(pastas);
            System.out.println("Pastas criadas.");
        }

        if (Files.notExists(arquivo)) {
            Files.createFile(arquivo);
            System.out.println("Arquivo criado.");
        }

        Path pastaDoArquivo = Paths.get(arquivo.getParent().toString(), "arquivo renomeado.txt");
        Files.copy(arquivo, pastaDoArquivo, StandardCopyOption.REPLACE_EXISTING);

    }
}



