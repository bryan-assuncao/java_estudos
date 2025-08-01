package assuncao.bryan.codes.excecoes.runtime.test;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {

        try{
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Detro do ArrayIndexOutOfBoundsException");

        } catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }

    }
}
