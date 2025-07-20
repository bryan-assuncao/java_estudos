package assuncao.bryan.codes.heranca.domain;

public class Pessoa {
    private String name;
    private String cpf;
    private Endereco endereco;

    public void printPessoa(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + ", " + this.endereco.getCep());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
