package assuncao.bryan.maratonajava.javacore.testes.identificarestudante.domain;

public class Aluno {
    private final String name;
    private final String type;

    public Aluno(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void identificar(){
        System.out.println("Aluno " + this.name + "- Tipo: " + this.type);
    }


}
