package assuncao.bryan.maratonajava.javacore.K_ClassesAbstratas.domain;

public abstract class Employee  extends Person{
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        bonus();
    }

    public abstract void bonus();

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
