package assuncao.bryan.codes.testes.excecoes.test;

import assuncao.bryan.codes.testes.excecoes.domain.Calculos;

import javax.swing.*;

public class TryCatch02 {
    public static void main(String[] args) {
        Calculos calculos = new Calculos();

        int[] numeros = {20, 30, 40, 50, 60};
        int[] divisores = {2, 5, 0, 20};

        for (int i = 0; i < numeros.length; i++) {
            try {
                calculos.divisao(numeros[i], divisores[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro genérico: " + e.getMessage());
            }
        }

    }

}





