package assuncao.bryan.maratonajava.javacore.metodos.domain;

public class Calculator {


    public double add(double x, double y){
        return x + y;
    }

    public double subtract(double x, double y){
        return x - y;
    }
    
    public double multiply(double x, double y){
        return x * y;
    }

    public double divide(double x, double y){
        if (y == 0){
            return 0;
        }
        return x / y;
    }

    public void SumArray(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }

    
    public void SumVarArgs(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }


}


