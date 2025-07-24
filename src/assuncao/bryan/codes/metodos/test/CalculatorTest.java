package assuncao.bryan.codes.metodos.test;

import assuncao.bryan.codes.metodos.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(7, 7));
        System.out.println(calculator.subtract(7, 7));
        System.out.println(calculator.multiply(7, 7));
        System.out.println(calculator.divide(7, 0));
        
        System.out.println("----------------");


        int[] list = {10, 20, 30, 40, 50};
        calculator.SumArray(list);

        System.out.println("----------------");
        
        calculator.SumVarArgs(list);
        calculator.SumVarArgs(1, 2, 3, 4, 5);
    }

}


