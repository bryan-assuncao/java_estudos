package assuncao.bryan.maratonajava.javacore.U_PathNIO.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest {
    public static void main(String[] args) {
        Path arquivoZipado = Paths.get("pasta/arquivo.zip");
        Path arquivoParaZipar = Paths.get("pasta/Subpasta01");
        zip(arquivoZipado, arquivoParaZipar);
    }

    private static void zip(Path arquivoZipado, Path arquivoParaZipar){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZipado));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)){
            for (Path file: directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo zipado com sucesso!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}







