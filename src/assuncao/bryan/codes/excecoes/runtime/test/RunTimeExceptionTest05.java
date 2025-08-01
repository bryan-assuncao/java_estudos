package assuncao.bryan.codes.excecoes.runtime.test;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {
        try{

        } catch (ArrayIndexOutOfBoundsException){
            System.out.println("Detro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException){
            System.out.println("Dentro do IllegalArgumentException");
        }
}
