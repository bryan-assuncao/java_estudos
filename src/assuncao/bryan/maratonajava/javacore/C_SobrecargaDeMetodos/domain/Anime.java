package assuncao.bryan.maratonajava.javacore.CsobrecargaDeMetodos.domain;

public class Anime {
    private  String name;
    private String type;
    private int episodes;
    private String status;

    public void init(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }
    public void init(String name, String type, int episodes, String status){
        this.init(name, type, episodes);
        this.status = status;
    }

    public void printAnime(){
        System.out.println(getName());
        System.out.println(getType());
        System.out.println(getEpisodes());
        System.out.println(getStatus());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        if (episodes <= 0){
                System.out.println("Invalid episode number");
            return;
        }
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
