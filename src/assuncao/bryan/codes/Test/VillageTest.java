package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.association.domain.Ninja;
import assuncao.bryan.codes.association.domain.Village;

public class VillageTest {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("Shikamaru");
        Ninja ninja2 = new Ninja("Choji");
        Ninja ninja3 = new Ninja("Ino");

        Ninja[] shinobi = {ninja1, ninja2, ninja3};

        Village village = new Village("Konoha", shinobi);

        village.printVillage();


    }

}
