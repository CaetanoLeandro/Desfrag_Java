package fundamentos.secao5.OrientacaoObj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        //Data
//        System.out.println("Digite o dia:");
//        Data d1 = new Data();
//        d1.dia = sc.nextInt();
//        System.out.println("Digite o mes:");
//        d1.mes = sc.nextInt();
//        System.out.println("Digite o ano:");
//        d1.ano = sc.nextInt();
//
//        //System.out.println("Data: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
//        System.out.println(d1.obterDataFormatada());


        //Produto
        //P1
        System.out.println("Digite o primeiro produto que deseja comprar:");
        Produto p1 = new Produto("Caneta", 4.00);

        //P2
        Produto p2 = new Produto();
        p2.nome = "Caderno";
        p2.preco = 10.00;

        Produto.desconto = 0.25;

        double precoFinal1 = p1.precoDesconto();
        double precoFinal2 = p2.precoDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println(p1.nome + " " + p1.precoDesconto());
        System.out.println(p2.nome + " " + p2.precoDesconto());

        System.out.println("Total: R$ " + mediaCarrinho);
        sc.close();
    }
}

