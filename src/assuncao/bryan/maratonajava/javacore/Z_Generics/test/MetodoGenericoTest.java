package assuncao.bryan.maratonajava.javacore.Z_Generics.test;

import assuncao.bryan.maratonajava.javacore.Z_Generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {
    public static void main() {
        criarArray(new Carro("BMW"));
    }
    private static <T> void criarArray(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}




