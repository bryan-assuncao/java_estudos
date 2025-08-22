package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\bryan.assuncao\\Downloads\\java_estudos\\arquivos\\file.txt");
        System.out.println(p1.getFileName());


    }
}
