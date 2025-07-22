package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.heranca.domain.Endereco;
import assuncao.bryan.codes.heranca.domain.Funcionario;
import assuncao.bryan.codes.heranca.domain.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Barão do Ladário", "92420-370");

        Pessoa pessoa = new Pessoa("Maju", "000.000.000-00");

        pessoa.setEndereco(endereco);

        pessoa.printPessoa();

        System.out.println("----------------------");

        Funcionario funcionario = new Funcionario("Bryan", "000.000.000-00", 1650);

        funcionario.setEndereco(endereco);

        funcionario.printPessoa();



    }
}
