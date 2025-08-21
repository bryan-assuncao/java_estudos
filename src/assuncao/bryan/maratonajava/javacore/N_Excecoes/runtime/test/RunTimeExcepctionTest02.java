package assuncao.bryan.maratonajava.javacore.N_Excecoes.runtime.test;

public class RunTimeExcepctionTest02 {
    public static void main(String[] args) {

        System.out.println(divisao(10, 0));
    }

    /**
     *
     * @param x
     * @param y não poder ser zero.
     * @return
     */
    private static int divisao(int x, int y){
        if(y == 0){
            throw new IllegalArgumentException("Y não pode ser igual a 0.");
        }
        return x / y;
    };
}
