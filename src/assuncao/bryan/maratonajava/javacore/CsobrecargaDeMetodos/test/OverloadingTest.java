package assuncao.bryan.maratonajava.javacore.CsobrecargaDeMetodos.test;

import assuncao.bryan.maratonajava.javacore.CsobrecargaDeMetodos.domain.Overloading;

public class OverloadingTest {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        overloading.init("Luffy", 19, "Rubber");

        overloading.printOverloading();

    }
}
