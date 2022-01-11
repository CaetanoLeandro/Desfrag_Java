package fundamentos.secao6.colecoes.array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos?");
        int qtdeAlunos = sc.nextInt();

        System.out.println("Quantos notas por aluno?");
        int qtdeNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {

                System.out.printf("Informe a nota %d do alunio %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = sc.nextDouble();
                total = notasDaTurma[a][n];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é: " + media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno)); // Mostra o array físico
        }
        sc.close();
    }
}
