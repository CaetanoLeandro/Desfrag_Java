package fundamentos.secao6.colecoes.array;

public class ArrayEx {

    public static void main(String[] args) {

        // MODELO 1
        double notasAlunoA[] = new double[4];

        notasAlunoA[0] = 7.1;
        notasAlunoA[1] = 6.9;
        notasAlunoA[2] = 9.3;
        notasAlunoA[3] = 7.3;

        double totalA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalA += notasAlunoA[i];
        }

        System.out.println(totalA / notasAlunoA.length);

        //Dicas
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);// Captura a última nota do aluno

        ///////////////////////////////////////////////

        //MODELO 2
        double totalB = 0;

        //Dicas
        double notaCoringa = 10.0;// passando o valor de uma variável, para o array

        double notasAlunoB[] = {8.5, 7.1, 6.2, notaCoringa};
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalB += notasAlunoB[i];
        }
        System.out.println(totalB / notasAlunoB.length);
    }
}
