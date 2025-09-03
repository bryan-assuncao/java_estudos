package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFile extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            System.out.println(file.getFileName());
            return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Post Visit: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

    public class SimpleFileVisitorTest02 {
        public static void main(String[] args) throws IOException {
            Path root = Paths.get("Pasta");
            Files.walkFileTree(root, new ListAllFile());
        }
    }



