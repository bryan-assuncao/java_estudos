package assuncao.bryan.codes.Teste;

import assuncao.bryan.codes.aulaclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Fusca Bala";
        carro.modelo = "Sport";
        carro.ano = 1969;

        carro2.nome = "Polo";
        carro2.modelo = "GTI";
        carro2.ano = 2024;

        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
