package assuncao.bryan.maratonajava.javacore.Z_Testes.classesabstratas.test;

import assuncao.bryan.maratonajava.javacore.Z_Testes.classesabstratas.domain.Bryan1v9;
import assuncao.bryan.maratonajava.javacore.Z_Testes.classesabstratas.domain.HighEnd;

public class Test {
    public static void main(String[] args) {
        HighEnd highEnd = new HighEnd("Bryan", "Mid", "Ouro");

        System.out.println(highEnd);
        highEnd.print();

        System.out.println("------------------");

        Bryan1v9 bryan1v9 = new Bryan1v9("Bryan1v9", "Platina");

        System.out.println(bryan1v9);
        bryan1v9.printBryan1v9();

    }
}
