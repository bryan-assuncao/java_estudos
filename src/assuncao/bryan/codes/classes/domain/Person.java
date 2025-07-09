package assuncao.bryan.codes.classes.domain;

public class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public  void setAge(int age){
        if (age < 0){
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    // just get the parameter ↓

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}


