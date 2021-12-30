package fundamentos.secao4.estruturasDeRepeticao;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Karatê do Mestre Miaygi");
        System.out.println("Digite a cor da faixa:");

        String faixa = sc.next();

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassi-Dai");
                break;
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
                break;
            case "roxa":
                System.out.println("Sei o Heian Godan");
                break;
            case "verde":
                System.out.println("Sei o Heian Yodan");
                break;
            case "laranja":
                System.out.println("Sei o Heian Sandan");
                break;
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
                break;
            case "amarela":
                System.out.println("Sei o Heian Godan");
                break;
        }
        System.out.println("終わり");
        sc.close();
    }
}
