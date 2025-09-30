package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        navigableMap.put("A", "Letra A");
        navigableMap.put("E", "Letra E");
        navigableMap.put("I", "Letra I");
        navigableMap.put("O", "Letra O");
        navigableMap.put("U", "Letra U");

        for(Map.Entry<String, String> entry : navigableMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(navigableMap.headMap("I"));  // todo mundo que esta acima do I
    }
}


