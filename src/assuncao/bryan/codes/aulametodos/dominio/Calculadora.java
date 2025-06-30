package assuncao.bryan.codes.aulametodos.dominio;

public class Calculadora {

    public void imprimirTexto(){
        System.out.println("Imprimindo texto.");
    }

    public double somar(double x, double y){
        return x + y;
    }

    public double subtrair(double x, double y){
        return x - y;
    }
    
    public double multiplicar(double x, double y){
        return x * y;
    }

    public double dividir(double x, double y){
        if (y == 0){
            return 0;
        }
        return x / y;
    }
}
