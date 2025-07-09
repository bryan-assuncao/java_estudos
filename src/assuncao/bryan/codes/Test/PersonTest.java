package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.classes.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Bryan");
        person.setAge(12);

        System.out.println(person.getName());
        System.out.println(person.getAge());


    }
}






