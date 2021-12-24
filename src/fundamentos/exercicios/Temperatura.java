package fundamentos.exercicios;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        double fahrenheit = 0.0;
        double celsius = 0.0;
        final int AJUSTE = 32;
        final double FATOR = 5/9.0;

        fahrenheit = 85;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("Temperatura: " + celsius +" ºC");

    }
}
