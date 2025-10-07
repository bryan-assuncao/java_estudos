package assuncao.bryan.maratonajava.javacore.Z_Generics.Service;

import assuncao.bryan.maratonajava.javacore.Z_Generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carroDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro para alugar...");
        Carro carro = carroDisponiveis.remove(0);
        System.out.println("Alugando carro " + carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carroDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro " + carro);
        carroDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carroDisponiveis);
    }
}






