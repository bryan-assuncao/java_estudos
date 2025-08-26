package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {

        Path path1 = Paths.get("home/bryan");
        Path path2 = Paths.get("../../Pasta/Subpasta/Subsubpasta/arquivo.txt");
        Path pathMescaldo = Paths.get(path1.resolve(path2).toString());
        System.out.println(pathMescaldo);
        System.out.println(pathMescaldo.normalize());

    }
}



