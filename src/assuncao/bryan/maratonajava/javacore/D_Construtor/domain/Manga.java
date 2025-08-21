package assuncao.bryan.maratonajava.javacore.Dconstrutor.domain;

public class Manga {
    private String name;
    private int year;
    private String profession;
    private int episodes;

    public Manga(String name, int year, String profession){
        this.name = name;
        this.year = year;
        this.profession = profession;
    }

    public Manga(String name, int year, String profession, int episodes){
        this(name, year, profession);
        this.episodes = episodes;
    }

    public Manga (){

    }

    public void init(String name, int year){
        this.name = name;
        this.year = year;
    }

    public void printManga(){
        System.out.println(getName());
        System.out.println(getYear());
        System.out.println(getProfession());
        System.out.println(getEpisodes());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
