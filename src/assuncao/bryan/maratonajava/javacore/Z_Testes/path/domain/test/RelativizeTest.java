package assuncao.bryan.maratonajava.javacore.Z_Testes.path.domain.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("Pasta/Subpasta");
        Path path2 = Paths.get("Pasta/Subpasta/Subsubpasta/arquivo renomeado.txt");
        Path relativized = path1.relativize(path2);
        System.out.println(relativized);
    }
}
