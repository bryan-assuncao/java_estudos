package assuncao.bryan.maratonajava.javacore.A_Classes.test;

import assuncao.bryan.maratonajava.javacore.A_Classes.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.name = "Fusca Bala";
        car.model = "Sport";
        car.year = 1969;

        car2.name = "Polo";
        car2.model = "GTI";
        car2.year = 2024;

        System.out.println(car.name + " " + car.model + " " + car.year);
        System.out.println(car2.name + " " + car2.model + " " + car2.year);

    }
}
