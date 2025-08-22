package assuncao.bryan.maratonajava.javacore.G_Associacao.domain;

public class Village {
    public String name;
    public Ninja[] ninja;

    public Village(String name, Ninja[] ninja) {
        this.name = name;
        this.ninja = ninja;
    }

    public Village(String name) {
        this.name = name;
    }

    public void printVillage(){
        System.out.println(this.name);
        if(ninja == null) return;
        for(Ninja shinobi : ninja){
            System.out.println(shinobi.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ninja[] getNinja() {
        return ninja;
    }

    public void setNinja(Ninja[] ninja) {
        this.ninja = ninja;
    }
}
