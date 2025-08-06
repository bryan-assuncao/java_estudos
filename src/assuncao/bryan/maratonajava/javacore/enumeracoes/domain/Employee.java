package assuncao.bryan.maratonajava.javacore.enumeracoes.domain;

public class Employee {
    public enum Senioridade{
        ESTAGIARIO, JUNIOR, PLENO, SENIOR
    }

    private String name;
    private Senioridade senioridade;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", senioridade=" + senioridade +
                '}';
    }

    public Employee(String name, Senioridade senioridade) {
        this.name = name;
        this.senioridade = senioridade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Senioridade getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(Senioridade senioridade) {
        this.senioridade = senioridade;
    }
}
