package assuncao.bryan.maratonajava.javacore.classesabstratas.domain;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonus() {
        this.salary = this.salary + this.salary * 0.10;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

