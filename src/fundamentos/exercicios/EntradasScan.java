package fundamentos.exercicios;

import java.util.Scanner;

public class EntradasScan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome");
        String nome = sc.next();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        System.out.println(nome);
        System.out.println(idade);

        sc.close();
    }
}
