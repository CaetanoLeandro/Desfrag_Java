package fundamentos.secao4.estruturasDeRepeticao;

public class For {

    public static void main(String[] args) {

        //For
        for (int contadorF = 0; contadorF <= 20; contadorF += 2) {
            System.out.println("if= " + contadorF);
        }

        //For dentro fe for
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }

        //Usando String
        for (String k = "$"; !k.equals("$$$$$$$"); k += "k") {
            System.out.println(k);
        }
    }
}
