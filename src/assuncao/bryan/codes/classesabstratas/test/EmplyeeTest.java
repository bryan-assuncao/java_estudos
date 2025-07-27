package assuncao.bryan.codes.classesabstratas.test;

import assuncao.bryan.codes.classesabstratas.domain.Manager;
import assuncao.bryan.codes.classesabstratas.domain.Developer;

public class EmplyeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager("Nami", 4000);
        System.out.println(manager);

        Developer developer = new Developer("Zoro", 4000);
        System.out.println(developer);
    }

}

