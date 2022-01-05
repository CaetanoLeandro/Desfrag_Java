package fundamentos.secao5.OrientacaoObj;

public class Data {

    int dia;
    int mes;
    int ano;

    public String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

}
