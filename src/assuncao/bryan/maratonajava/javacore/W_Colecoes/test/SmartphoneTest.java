package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Smarthphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest {
    public static void main(String[] args) {
        Smarthphone sm1 = new Smarthphone("32355", "Apple");
        Smarthphone sm2 = new Smarthphone("6439", "Samsumg");
        Smarthphone sm3 = new Smarthphone("1208", "Google");

        List<Smarthphone> smarthphones = new ArrayList<>();

        smarthphones.add(sm1);
        smarthphones.add(sm2);
        smarthphones.add(1, sm3); // escolhendo a posição

        for (Smarthphone phones : smarthphones){
            System.out.println(phones);
        }

        Smarthphone sm4 = new Smarthphone("1208", "Google");
        System.out.println("Existe o sm4 na nossa lista? : " + smarthphones.contains(sm4));

        System.out.println("Existe o sm4 na nossa lista e qual a posição? : " + smarthphones.indexOf(sm4));
    }
}

