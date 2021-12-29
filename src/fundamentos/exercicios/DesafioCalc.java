package fundamentos.exercicios;

import javax.swing.*;
import java.util.Scanner;

public class DesafioCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;
        String operador;

        JOptionPane.showMessageDialog(null, "Calculadora");

        n1 = Double.parseDouble((JOptionPane.showInputDialog("Digitr o 1º número")));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digitr o 2º número"));
        JOptionPane.showMessageDialog(null, "Use apenas os operadores +, -, * e /");
        operador = String.valueOf(JOptionPane.showInputDialog("Didite o sinal de operação"));

        double soma = "+".equals(operador) ? n1 + n2 : 0;
        double subtracao = "-".equals(operador) ? n1 - n2 : 0;
        double multiplicacao = "*".equals(operador) ? n1 * n2 : 0;
        double divisao = "/".equals(operador) ? n1 / n2 : 0;


        // USANDO O IF
        if (soma > 0 && n1 > 0 && n2 > 0) {
            JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma);
        } else if (subtracao > 0 && n1 > 0 && n2 > 0) {
            JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + subtracao);
        } else if (multiplicacao > 0 && n1 > 0 && n2 > 0) {
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + multiplicacao);
        } else if (divisao > 0 && n1 > 0 && n2 > 0) {
            JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + divisao);
        } else {
            JOptionPane.showMessageDialog(null, "valor inclusivo");
        }
    }

}
