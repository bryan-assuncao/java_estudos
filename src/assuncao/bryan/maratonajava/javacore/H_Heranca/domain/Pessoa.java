package assuncao.bryan.maratonajava.javacore.H_Heranca.domain;

public class Pessoa {
    private String name;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Dentro do bloco statico de pessoa.");
    }
    {
        System.out.println("Bloco de inicialização pessoa 1");
    }
    {
        System.out.println("Bloco de inicialização pessoa 2");
    }

    public Pessoa(String name, String cpf){
        System.out.println("Dentro do construtor pessoa.");
        this.name = name;
        this.cpf = cpf;
    }

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
