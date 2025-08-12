package assuncao.bryan.maratonajava.javacore.Nexcecoes.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {

        System.out.println(divisao(10, 0));
    }
    public static double divisao(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("b não pode ser igual a zero.");
        }
        return a / b;
    }
}
