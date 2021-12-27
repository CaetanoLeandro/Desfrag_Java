package fundamentos.exercicios;

import java.util.Scanner;

public class EntradasScan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome");
        String nome = sc.next();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        sc.nextLine(); //força o pulo pra a proxima linha evitando que a próxima informação fique na linha da
        // infromação anterior

        System.out.println(nome);
        System.out.println(idade);

        sc.close();
    }
}
