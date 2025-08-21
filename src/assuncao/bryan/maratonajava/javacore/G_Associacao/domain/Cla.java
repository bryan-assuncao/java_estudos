package assuncao.bryan.maratonajava.javacore.Gassociacao.domain;

public class Cla {
    private String name;
    private int number;

    static {
        System.out.println("Salve");
        System.out.println("-------");
    }

    public Cla(String name, int number) {
    this.name = name;
    this.number = number;
    }

    public void printCla(){
        System.out.println(this.name);
        System.out.println(this.number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
