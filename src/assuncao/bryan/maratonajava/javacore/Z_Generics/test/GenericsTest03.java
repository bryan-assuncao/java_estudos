package assuncao.bryan.maratonajava.javacore.Z_Generics.test;

import assuncao.bryan.maratonajava.javacore.Z_Generics.Service.RentavelService;
import assuncao.bryan.maratonajava.javacore.Z_Generics.domain.Barco;
import assuncao.bryan.maratonajava.javacore.Z_Generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Celta"), new Carro("Palio")));

        RentavelService<Carro> rentavelService = new RentavelService<>(carrosDisponiveis);
        Carro carro = rentavelService.buscarObjetoDisponivel();
        rentavelService.retornarCarroAlugado(carro);

        System.out.println("-----------------------------------------------------");

        List<Barco> barcosDiponiveis = new ArrayList<>(List.of(new Barco("Navio"),new Barco("Canoa")));

        RentavelService<Barco> rentavelService1 = new RentavelService<>(barcosDiponiveis);
        Barco barco = rentavelService1.buscarObjetoDisponivel();
        rentavelService1.retornarCarroAlugado(barco);
    }
}








