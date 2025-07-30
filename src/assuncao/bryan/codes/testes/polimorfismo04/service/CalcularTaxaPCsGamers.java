package assuncao.bryan.codes.testes.polimorfismo04.service;

import assuncao.bryan.codes.testes.polimorfismo04.domain.LanHouse;

public class CalcularTaxaPCsGamers {
    public static void taxaPcGamer(LanHouse lanHouse){
        double taxaGamer = lanHouse.taxa();
        System.out.println("PC: " + lanHouse.getPc());
        System.out.println("Valor Hora: " + lanHouse.getValorHora());
        if(taxaGamer > 0) {
            System.out.println("Taxa PC Gamer: " + taxaGamer);
        }
    }
}
