package assuncao.bryan.maratonajava.javacore.classesabstratas.test;

import assuncao.bryan.maratonajava.javacore.classesabstratas.domain.Manager;
import assuncao.bryan.maratonajava.javacore.classesabstratas.domain.Developer;

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

