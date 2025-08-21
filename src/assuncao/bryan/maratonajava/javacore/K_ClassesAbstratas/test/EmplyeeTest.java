package assuncao.bryan.maratonajava.javacore.KclassesAbstratas.test;

import assuncao.bryan.maratonajava.javacore.KclassesAbstratas.domain.Manager;
import assuncao.bryan.maratonajava.javacore.KclassesAbstratas.domain.Developer;

public class EmplyeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager("Nami", 4000);
        System.out.println(manager);

        Developer developer = new Developer("Zoro", 4000);
        System.out.println(developer);

        manager.print();
        developer.print();
    }

}

