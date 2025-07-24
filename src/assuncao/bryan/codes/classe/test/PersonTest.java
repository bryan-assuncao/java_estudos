package assuncao.bryan.codes.classe.test;

import assuncao.bryan.codes.classe.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Bryan");
        person.setAge(24);

        String name = person.getName();
        int age = person.getAge();

        System.out.println(name);
        System.out.println(age);

        person.printPerson();

    }
}






    