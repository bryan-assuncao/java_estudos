package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Celta");
        cars.add("Clio");
        cars.add("Palio");

        List<String> cars2 = new ArrayList<>();

        cars.add("Audi");
        cars.add("BMW");
        cars.add("Ferrari");

        cars.addAll(cars2);

        System.out.println(cars);


    }

}
