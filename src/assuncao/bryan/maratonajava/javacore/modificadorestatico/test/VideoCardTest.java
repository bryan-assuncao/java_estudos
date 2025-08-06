package assuncao.bryan.maratonajava.javacore.modificadorestatico.test;

import assuncao.bryan.maratonajava.javacore.modificadorestatico.domain.VideoCard;

public class VideoCardTest {
    public static void main(String[] args) {
        VideoCard video1 = new VideoCard("RTX 4060TI", "NVIDIA");
        VideoCard video2 = new VideoCard("RTX 4090", "NVIDIA");
        VideoCard video3 = new VideoCard("RX 7600", "AMD");

        video1.printVideoCard();
        video2.printVideoCard();

        VideoCard.setYear(2023);

        video3.printVideoCard();
    }
}


