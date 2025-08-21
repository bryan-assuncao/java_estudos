package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class IOTest {
    public static void main(String[] args) {
        File file = new File("file.doc");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);

            System.out.println("--------------");

            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());

            System.out.println("--------------");

            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println(new Date(file.lastModified()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
