package assuncao.bryan.codes.blocosdeinicializacao.domain;

public class Serie {
    private String name;
    private int[] episodes;

    {
        episodes = new int[100+1];
        for(int i = 1; i < episodes.length; i++)
            System.out.print(i + " ");
    }

    public Serie(){
        System.out.println("\nConstructor");
        System.out.println("Constructor");
        System.out.println("Constructor");
    }

}



