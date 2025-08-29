package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Pasta/test.txt");

        if (Files.notExists(path)){
            Files.createFile(path);
        }

        Files.setAttribute(path, "dos:hidden", true); // faz o arquivo ser oculto
        Files.setAttribute(path, "dos:readonly", true); // podemos apenas ler o arquivo

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);

        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

    }
}




