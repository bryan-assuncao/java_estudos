package assuncao.bryan.maratonajava.javacore.Z_Generics.test;

import assuncao.bryan.maratonajava.javacore.Z_Generics.Service.BarcoRentavelService;
import assuncao.bryan.maratonajava.javacore.Z_Generics.Service.CarroRentavelService;
import assuncao.bryan.maratonajava.javacore.Z_Generics.domain.Barco;
import assuncao.bryan.maratonajava.javacore.Z_Generics.domain.Carro;

public class GenericsTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();

        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando carro por 1 mês");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}

