package assuncao.bryan.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco statico de funcionário.");
    }
    {
        System.out.println("Bloco de inicialização funcionário 1");
    }
    {
        System.out.println("Bloco de inicialização funcionário 2");
    }

    public Funcionario(String name, String cpf, double salario) {
        super(name, cpf);
        this.salario = salario;
        System.out.println("Dentro do Construtor funcionário.");
    }

    @Override
    public void printPessoa() {
        super.printPessoa();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
