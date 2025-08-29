package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;


public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path novoPath = Paths.get("arquivos/novo_path.txt");

        BasicFileAttributes basicFileAttributes = Files.readAttributes(novoPath, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime modifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime accessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Criado em "+ creationTime);
        System.out.println("Útima modificação em "+modifiedTime);
        System.out.println("Último acesso em "+ accessTime);

        System.out.println("-------------------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(novoPath, BasicFileAttributeView.class);

        FileTime newAcessTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(creationTime, modifiedTime, newAcessTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        modifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        accessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Criado em " + creationTime);
        System.out.println("Útima modificação em " + modifiedTime);
        System.out.println("Último acesso em " + accessTime);


    }
}
