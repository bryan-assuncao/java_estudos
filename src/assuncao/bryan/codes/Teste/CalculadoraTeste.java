package assuncao.bryan.codes.Teste;

import assuncao.bryan.codes.aulametodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        calculadora.imprimirTexto();

        System.out.println(calculadora.somar(7, 7));
        System.out.println(calculadora.subtrair(7, 7));
        System.out.println(calculadora.multiplicar(7, 7));
        System.out.println(calculadora.dividir(7, 0));
    }

}


