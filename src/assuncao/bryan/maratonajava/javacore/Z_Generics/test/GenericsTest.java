package assuncao.bryan.maratonajava.javacore.Z_Generics.test;

import assuncao.bryan.maratonajava.javacore.Z_Generics.Service.CarroRentavelService;
import assuncao.bryan.maratonajava.javacore.Z_Generics.domain.Carro;

public class GenericsTest {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por 1 mês");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}

