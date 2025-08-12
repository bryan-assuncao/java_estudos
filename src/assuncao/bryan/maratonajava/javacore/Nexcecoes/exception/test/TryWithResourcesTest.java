package assuncao.bryan.maratonajava.javacore.Nexcecoes.exception.test;

import assuncao.bryan.maratonajava.javacore.Nexcecoes.domain.Leitor1;
import assuncao.bryan.maratonajava.javacore.Nexcecoes.domain.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest {
    public static void main(String[] args) {

        lerArquivo();
    }

    public static void lerArquivo(){

        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
            System.out.println("foi");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
