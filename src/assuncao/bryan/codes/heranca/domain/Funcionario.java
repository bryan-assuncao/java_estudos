package assuncao.bryan.codes.heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

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
