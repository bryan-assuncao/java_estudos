package assuncao.bryan.codes.classesabstratas.domain;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonus() {
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + name +
                ", salary='" + salary + '\'' +
                '}';
    }
}

