package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/bryan/");
        Path arquivo = Paths.get("/home/bryan/dev/arquivo.txt");

        Path relativize = dir.relativize(arquivo);
        System.out.println(relativize);

        Path absolut01 = Paths.get("home/bryan");
        Path absolut02 = Paths.get("usr/local");
        Path absolut03 = Paths.get("home/bryan/dev/arquivo.txt");

        Path relative01 = Paths.get("temp");
        Path relative02 = Paths.get("temp/temp.2015");

        System.out.println(absolut03.relativize(absolut01));
        System.out.println(absolut01.relativize(absolut02));
        System.out.println(relative02.relativize(relative01));
    }
}








