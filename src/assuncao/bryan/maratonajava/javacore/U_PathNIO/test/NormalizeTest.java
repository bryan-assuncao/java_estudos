package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest {
    public static void main(String[] args) {
        String diretorioProjeto = "home/bryan/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path.normalize());

    }
}







