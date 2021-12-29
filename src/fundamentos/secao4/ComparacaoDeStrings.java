package fundamentos.secao4;

public class ComparacaoDeStrings {

    public static void main(String[] args) {

        String s = new String("2");
        System.out.println("2" == s); // False!
        System.out.println("2".equals(s)); // True! Pois compara o conteúdo da variável

    }
}
