package assuncao.bryan.maratonajava.javacore.testes.polimorfismo02.domain;

public abstract class Carnes implements Imposto{
    protected String tipo;
    protected double valor;

    public Carnes(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
