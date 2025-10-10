package assuncao.bryan.maratonajava.javacore.ZZ_A_Classes_Internas.test;

import assuncao.bryan.maratonajava.javacore.ZZ_A_Classes_Internas.domain.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main() {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        barcoList.sort(Comparator.comparing(b -> b.name));
        System.out.println(barcoList);
    }
}


