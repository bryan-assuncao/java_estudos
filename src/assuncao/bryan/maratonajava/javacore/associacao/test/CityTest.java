package assuncao.bryan.maratonajava.javacore.associacao.test;

import assuncao.bryan.maratonajava.javacore.associacao.domain.City;

public class CityTest {
    public static void main(String[] args) {
        City c1 = new City("Canoas");
        City c2 = new City("Esteio");
        City c3 = new City("Porto Alegre");

        City[] city = {c1, c2, c3};

        for(City name : city){
            name.printCity();
        }

    }
}
