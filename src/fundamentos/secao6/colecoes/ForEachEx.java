package fundamentos.secao6.colecoes;

public class ForEachEx {

    public static void main(String[] args) {

        double[] notas = {8.0, 7.4, 9.4, 6.1};

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }

        System.out.println(" ");

        for (double nota : notas) { //foreach
            System.out.println(nota + " ");
        }
    }
}
