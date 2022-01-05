package fundamentos.secao5.OrientacaoObj;


public class Produto {

    static double desconto = 0.25;
    String nome;
    double preco;

    Produto(String nomeInicial, double precoIncial) {
        nome = nomeInicial;
        preco = precoIncial;
    }

    Produto() {
    }

    double precoDesconto() {
        return preco * (1 - desconto);
    }

    double precoDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

}
