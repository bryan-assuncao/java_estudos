package assuncao.bryan.maratonajava.javacore.Gassociacao.domain;

public class City {
    private String name;

    public City(String name){
        this.name = name;
    }

    public void printCity(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
