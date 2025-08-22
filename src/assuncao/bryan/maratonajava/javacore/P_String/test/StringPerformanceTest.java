package assuncao.bryan.maratonajava.javacore.P_String.test;

public class StringPerformanceTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        concatString(100000);
        long end = System.currentTimeMillis();
        System.out.println("Tempo gasto " +  (end - start) + "ms");


        long start2 = System.currentTimeMillis();
        concatStringBuilder(100000);
        long end2 = System.currentTimeMillis();
        System.out.println("Tempo gasto " +  (end2 - start2) + "ms");

        long start3 = System.currentTimeMillis();
        concatStringBuffer(100000);
        long end3 = System.currentTimeMillis();
        System.out.println("Tempo gasto " +  (end3 - start3) + "ms");

    }

    private static void concatString(int size){
        String text = "";
        for(int i = 0; i < size; i++){
            text += i;
        }
    }

    private static void concatStringBuilder(int size){
        StringBuilder sb = new StringBuilder(size);
        for(int i = 0; i < size; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size){
        StringBuffer sb = new StringBuffer(size);
        for(int i = 0; i < size; i++){
            sb.append(i);
        }
    }

}
