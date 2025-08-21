package assuncao.bryan.maratonajava.javacore.N_Excecoes.runtime.test;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("xxx");
        } catch (RuntimeException e) {
            System.out.println("zzz");
        }

    }
}

