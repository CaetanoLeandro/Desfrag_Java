public class teste {


    public static void main(String[] args) {


        String frase1 = "Comprei rapadura e salsa com entusiasmo rarissimo";
        String frase2 = "Compute Word Infomation";
        String frase3 = "world wide web";

        String[] palavras1 = frase1.split(" ");
        String[] palavras2 = frase2.split(" ");
        String[] palavras3 = frase3.split(" ");

        for (int i = 0; i < palavras1.length; i++) {
            System.out.println(palavras1[i].charAt(0));
        }

        for (int i = 0; i < palavras2.length; i++) {
            System.out.println(palavras2[i].charAt(0));
        }

        for (int i = 0; i < palavras3.length; i++) {
            System.out.println(palavras3[i].charAt(0));
        }
    }
}


