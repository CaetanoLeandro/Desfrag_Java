package fundamentos.secao4;

public class CondTernaria {

    public static void main(String[] args) {

        double media = 7.4;
        String resultadoParcial = media >= 5.0 ? "Em recuperação " : "Reprovado...";
        String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
        System.out.println("O aluno está: " + resultadoFinal);
    }
}
