package assuncao.bryan.maratonajava.javacore.FmodificadorEstatico.domain;

public class Film {
    private String name;
    private static int[] part;


    static {
        System.out.println(01);
        part = new int[10];
        for(int i = 0; i < part.length; i++){
            System.out.print(i + " ");
        }
    }

    static {
        System.out.println("\nsó uma vez cada");
        System.out.println(02);
    }

    public void printFilm(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int[] getPart() {
        return part;
    }

    public static void setPart(int[] part) {
        Film.part = part;
    }
}
