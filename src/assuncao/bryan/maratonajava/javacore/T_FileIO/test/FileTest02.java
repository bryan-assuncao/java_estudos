package assuncao.bryan.maratonajava.javacore.T_FileIO.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        // Criar pasta
        File fileDiretorio = new File("Nova Pasta");
        boolean pastaCriada = fileDiretorio.mkdir();
        System.out.println("Pasta criada " + pastaCriada);

        // Criar arquivo dentro da pasta
        File fileArquivoDiretorio = new File(fileDiretorio, "Novo Arquivo.txt");
        boolean arquivoCriado = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado " + arquivoCriado);

        // Renomear arquivo
        File fileRenamed = new File(fileDiretorio,"Arquivo Renomedado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo foi renomeado " + isRenamed);

        // Renomear pasta
        File diretorioRenamed = new File("Pasta Renomeada");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio renomeado" + isDiretorioRenamed);


    }
}


