package assuncao.bryan.maratonajava.javacore.W_Colecoes.test;

import assuncao.bryan.maratonajava.javacore.W_Colecoes.domain.Smarthphone;

public class EqualsTest {
    public static void main(String[] args) {
        Smarthphone sm1 = new Smarthphone("12345", "Apple");
        Smarthphone sm2 = new Smarthphone("12345", "Apple");

        System.out.println(sm1.equals(sm2));

        Smarthphone sm3 = new Smarthphone("54321", "Motorola");
        Smarthphone sm4 = sm3;
        System.out.println(sm3.equals(sm4));

    }
}



