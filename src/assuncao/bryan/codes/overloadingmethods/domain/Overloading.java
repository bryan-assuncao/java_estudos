package assuncao.bryan.codes.overloadingmethods.domain;

public class Overloading {
    private String name;
    private int age;
    private String power;

    public void init(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void init(String name, int age, String power){
        init(name, age);
        this.power = power;
    }

    public void printOverloading(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.power);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
