package assuncao.bryan.codes.Teste;

import assuncao.bryan.codes.aulametodos.dominio.Calculator;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(7, 7));
        System.out.println(calculator.subtract(7, 7));
        System.out.println(calculator.multiply(7, 7));
        System.out.println(calculator.divide(7, 0));
    }

}


