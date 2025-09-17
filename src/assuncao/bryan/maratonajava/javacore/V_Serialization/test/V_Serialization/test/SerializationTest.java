package assuncao.bryan.maratonajava.javacore.V_Serialization.test.V_Serialization.test;

import assuncao.bryan.maratonajava.javacore.V_Serialization.test.V_Serialization.domain.Aluno;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Bryan", "adsadadasda");
        serializar(aluno);
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("Pasta/aluno.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
