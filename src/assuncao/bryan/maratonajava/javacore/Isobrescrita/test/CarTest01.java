package assuncao.bryan.maratonajava.javacore.Isobrescrita.test;

import assuncao.bryan.maratonajava.javacore.Isobrescrita.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.LIMIT_SPEED);

        System.out.println(car.BUYER);

        car.BUYER.setName("Sanji");

        System.out.println(car.BUYER);

    }
}
