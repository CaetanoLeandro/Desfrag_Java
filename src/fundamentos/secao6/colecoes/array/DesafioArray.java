package fundamentos.secao6.colecoes.array;

import java.util.Scanner;

public class DesafioArray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas notas que serão armazenadas:");
        int numPosArray = sc.nextInt();

        System.out.println("Digite as " + numPosArray + " notas");

        double notasAluno[] = new double[numPosArray];

        double total = 0;
        for (int i = 0; i < notasAluno.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notasAluno[i] = sc.nextDouble();
        }
        System.out.println(" ");

        for (double nota : notasAluno) { //foreach
            total += nota;
        }
        System.out.println("A média do aluno é: " + total / notasAluno.length);
        sc.close();
    }
}
