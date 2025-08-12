package assuncao.bryan.maratonajava.javacore.Nexcecoes.runtime.test;

public class RunTimeExceptionTest04  {
    public static void main(String[] args) {

        abrirConexao();

    }

    public static void abrirConexao() {
        try {
            System.out.println("Abrir arquivo");
            throw new RuntimeException();
            // System.out.println("Escrever dados.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechar arquivo.");
        }
    }
}
