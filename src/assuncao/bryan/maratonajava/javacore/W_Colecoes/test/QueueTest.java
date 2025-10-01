package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        System.out.println(fila);

        System.out.println("----------");

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}


