package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.List;

public class ListTest03 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(24, 24, 62, 43);
        List<String> names = List.of("Naruto", "Kakashi", "Sakura", "Sasuke");

        for(Integer number : numbers){
            System.out.print(number + " ");
        }

        System.out.println("\n-------------------------------");

        for (String name : names) {
            System.out.print(name + " ");
        }


    }
}
