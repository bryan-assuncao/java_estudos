package assuncao.bryan.maratonajava.javacore.N_Excecoes.error.test;

public class StackOverFlowTest {
    public static void main(String[] args) {

        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
