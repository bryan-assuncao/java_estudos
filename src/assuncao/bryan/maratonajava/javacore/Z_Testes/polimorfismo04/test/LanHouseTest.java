package assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo04.test;

import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo04.domain.LanHouse;
import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo04.domain.Pc01;
import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo04.domain.Pc02;
import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo04.service.CalcularTaxaPCsGamers;

public class LanHouseTest {
    public static void main(String[] args) {
        LanHouse lanHouse = new Pc01("01", 5);
        LanHouse lanHouse2 = new Pc02("02", 4);

        CalcularTaxaPCsGamers.taxaPcGamer(lanHouse);

        System.out.println("-------------");

        CalcularTaxaPCsGamers.taxaPcGamer(lanHouse2);
    }
}
