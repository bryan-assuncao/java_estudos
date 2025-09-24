package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        Integer[] listToArray = numbersList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("-----------------");

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;
        System.out.println(Arrays.asList(numbersArray));

        System.out.println("-----------------");

        List<Integer> numbers = List.of(10, 20, 30);
        List<String> names = List.of("Bryan", "Maju", "Eunice");
        System.out.println(numbers);
        System.out.println(names);
    }
}


