package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> mymap = new HashMap<>();

        mymap.put("teklado", "teclado");
        mymap.put("mouze", "mouse");
        mymap.put("vc", "você");

        for (String key : mymap.keySet()) {
            System.out.println(key);
        }

        System.out.println("--------");

        for (String value : mymap.values()) {
            System.out.println(value);










        }

        System.out.println("-------------------");

        for (Map.Entry <String, String> entry : mymap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

