package assuncao.bryan.maratonajava.javacore.G_Associacao.test;

import assuncao.bryan.maratonajava.javacore.G_Associacao.domain.Cla;

public class ClaTest {
    public static void main(String[] args) {
        Cla cla = new Cla("Uchiha", 01);
        Cla cla2 = new Cla("Uzumaki", 02);
        Cla cla3 = new Cla("Hatake", 03);

        Cla[] konoha = {cla, cla2, cla3};

        for(Cla nameNumber : konoha){
            nameNumber.printCla();
        }
    }
}
