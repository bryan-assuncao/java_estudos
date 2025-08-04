package assuncao.bryan.codes.excecoes.exception.test;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest {
    public static void main(String[] args) {

    }
    public void lerArquivo(){

        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
