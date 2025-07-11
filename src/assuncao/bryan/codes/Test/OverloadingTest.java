package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.overloadingmethods.domain.Overloading;

public class OverloadingTest {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        overloading.init("Luffy", 19, "Rubber");

        overloading.printOverloading();

    }
}
