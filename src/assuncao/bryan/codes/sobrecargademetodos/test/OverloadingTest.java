package assuncao.bryan.codes.sobrecargademetodos.test;

import assuncao.bryan.codes.sobrecargademetodos.domain.Overloading;

public class OverloadingTest {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        overloading.init("Luffy", 19, "Rubber");

        overloading.printOverloading();

    }
}
