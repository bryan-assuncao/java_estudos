package assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo04.service;

import assuncao.bryan.maratonajava.javacore.Z_Testes.polimorfismo04.domain.LanHouse;

public class CalcularTaxaPCsGamers {
    public static void taxaPcGamer(LanHouse lanHouse){
        double taxaGamer = lanHouse.taxa();
        System.out.println("PC: " + lanHouse.getPc());
        System.out.println("Valor Hora: R$ " + lanHouse.getValorHora());
        if(taxaGamer > 0) {
            System.out.println("Taxa PC Gamer: R$ " + taxaGamer);
        }
    }
}
