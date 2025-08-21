package assuncao.bryan.maratonajava.javacore.Hheranca.test;

import assuncao.bryan.maratonajava.javacore.Hheranca.domain.Endereco;
import assuncao.bryan.maratonajava.javacore.Hheranca.domain.Funcionario;
import assuncao.bryan.maratonajava.javacore.Hheranca.domain.Pessoa;

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
