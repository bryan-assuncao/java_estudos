package assuncao.bryan.maratonajava.javacore.Z_Testes.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path novaPasta = Paths.get("C:\\Users\\bryan.assuncao\\Downloads\\java_estudos\\src\\assuncao\\bryan\\maratonajava\\javacore\\Z_Testes\\path\\NovaPasta");
        if(Files.notExists(novaPasta)){
            Files.createDirectories(novaPasta);
        }

        Path novoArquivo = Paths.get(novaPasta.toString(), "NovoArquivo.txt");
        if(Files.notExists(novoArquivo)){
            Files.createFile(novoArquivo);
        }
    }
}
