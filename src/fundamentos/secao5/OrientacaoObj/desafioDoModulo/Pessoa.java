package fundamentos.secao5.OrientacaoObj.desafioDoModulo;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.pesoPessoa += comida.pesoComida;
        }
    }

    String apresentar() {
        return "Olá me chamo " + nomePessoa + " e peso " + pesoPessoa + " Kgs.";
    }
}
