package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.staticmodifier.domain.VideoCard;

public class VideoCardTest {
    public static void main(String[] args) {
        VideoCard video1 = new VideoCard("RTX 4060TI", "NVIDIA");
        VideoCard video2 = new VideoCard("RTX 4090", "NVIDIA");
        VideoCard video3 = new VideoCard("RX 7600", "AMD");

        VideoCard.year= 300;

        video1.printVideoCard();
        video2.printVideoCard();
        video3.printVideoCard();
    }
}
