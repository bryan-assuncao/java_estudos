package assuncao.bryan.codes.tipoprimitivo.test;

import assuncao.bryan.codes.tipoprimitivo.domain.Buyer;
import assuncao.bryan.codes.tipoprimitivo.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.LIMIT_SPEED);

        System.out.println(car.BUYER);

        car.BUYER.setName("Sanji");

        System.out.println(car.BUYER);

    }
}
