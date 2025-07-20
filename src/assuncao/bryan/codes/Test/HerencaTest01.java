package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.heranca.domain.Endereco;
import assuncao.bryan.codes.heranca.domain.Funcionario;
import assuncao.bryan.codes.heranca.domain.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Barão do Ladário", "92420-370");

        Pessoa pessoa = new Pessoa();
        pessoa.setName("Bryan");
        pessoa.setCpf("600.511.700-94");
        pessoa.setEndereco(endereco);

        pessoa.printPessoa();

        System.out.println("----------------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setName("Maju");
        funcionario.setCpf("018.299.600-53");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2100);

        funcionario.printPessoa();
        System.out.println(funcionario.getSalario());


    }
}
