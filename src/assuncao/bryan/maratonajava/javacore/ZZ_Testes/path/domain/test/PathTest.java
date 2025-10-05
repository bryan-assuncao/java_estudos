package assuncao.bryan.maratonajava.javacore.Z_Testes.path.domain.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) throws IOException {
        Path pastas = Paths.get("C:\\Users\\bryan.assuncao\\Downloads\\java_estudos\\src\\assuncao\\bryan\\maratonajava\\javacore\\Z_Testes\\path\\domain\\test");
        if (Files.notExists(pastas)){
            Path criarPasta = Files.createDirectories(pastas);
            System.out.println("Pastas criadas.");
        } else {
            System.out.println("Pastas já existem.");
        }
    }
}
