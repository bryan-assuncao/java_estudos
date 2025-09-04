package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.nio.file.*;

public class PathMatcherTest {
    public static void main(String[] args) {
        Path path = Paths.get("Pasta/file.bkp");
        Path path1 = Paths.get("Pasta/file.txt");
        Path path2 = Paths.get("Pasta/file.java");
        matches(path, "glob:**/file.bkp");
    }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}



