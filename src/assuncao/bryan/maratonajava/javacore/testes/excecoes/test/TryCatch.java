package assuncao.bryan.maratonajava.javacore.testes.excecoes.test;

import assuncao.bryan.maratonajava.javacore.testes.excecoes.domain.Calculos;

import javax.swing.*;

public class TryCatch {
    public static void main(String[] args) {
        Calculos calculos = new Calculos();

        int[] numeros = {10, 20, 30, 40, 50};
        int[] divisores = {2, 5, 0, 20};

        for (int i = 0; i < numeros.length; i++) {
            try {
                calculos.divisao(numeros[i], divisores[i]);
            } catch (ArithmeticException e) {
                System.out.println("Erro de calculo: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro de calculo: " + e.getMessage()); // cria uma caixa de dialogo
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro de vetor: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro de vetor: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro genérico: " + e.getMessage());
            }
        }

    }

}


