package fundamentos.exercicios;

import javax.swing.*;

public class ConverNumericosPrimitivos {

    public static void main(String[] args) {

        double d = 1;// Conversão implicita
        System.out.println(d);

        float b = (float) 2.33335555; //Explicita (CASTING)
        System.out.println(b);

       // Integer para String
        Integer num1 = 898098;
        int  num2 = 909099;
        System.out.println(num1.toString().length());
        // OU
        System.out.println(Integer.toString(num2).length());

        // String para Integer
        String v1 = JOptionPane.showInputDialog("Digitr o 1º número");
        String v2 = JOptionPane.showInputDialog("Digitr o 2º número");

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);

        double soma = n1+n2;
        System.out.println("A soma é: "+ soma);

        //OU
        System.out.println("A soma é: "+(n1+n2));
    }
}
