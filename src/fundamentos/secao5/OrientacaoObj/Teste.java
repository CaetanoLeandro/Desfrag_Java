package fundamentos.secao5.OrientacaoObj;

public class Teste {

    public static void main(String[] args) {

        String[] timesBasket = {"Lakers", "Bulls", "Celtics", "Warriors"};
        String todos = "";
        int i;
        for (i = 0; (i < timesBasket.length); i++) {
            todos = timesBasket[i];

            if (todos != null && todos.length() > 0)
                System.out.println(todos);

            if (i == 3) {
                System.out.println(timesBasket[1] + " x " + timesBasket[2]);
                System.out.println(timesBasket[0] + " x " + timesBasket[3]);
            }
            System.out.println("++++++++++++++++++++++++++");

            if (i == 3) {
                String[] timesFutebol = {"Botafogo", "Corinthians", "Flamengo", "Fluminense",
                        "Palmeiras", "Santos", "São Paulo", "Vasco"};
                String todos1 = "";

                int j = 0;
                for (j = 0; (j < timesFutebol.length); j++) {
                    todos1 = timesFutebol[j];

                    if (todos1 != null && todos1.length() > 0)
                        System.out.println(todos1);

                    if (j == 7) {
                        System.out.println(timesFutebol[3] + " x " + timesFutebol[0]);
                        System.out.println(timesFutebol[6] + " x " + timesFutebol[7]);
                        System.out.println(timesFutebol[2] + " x " + timesFutebol[4]);
                        System.out.println(timesFutebol[3] + " x " + timesFutebol[1]);
                    }
                    System.out.println("++++++++++++++++++++++++++");

                    if (j == 7) {
                        String[] timesFutebolAmericano = {"Falcons", "Eagles", "Patriots", "Saints",
                                "Giants", "49ers"};
                        String todos2 = "";

                        int k = 0;
                        for (k = 0; (k < timesFutebolAmericano.length); k++) {
                            todos2 = timesFutebolAmericano[k];

                            if (todos2 != null && todos2.length() > 0)
                                System.out.println(todos2);

                            if (k == 5) {
                                System.out.println(timesFutebolAmericano[3] + " x " + timesFutebolAmericano[0]);
                                System.out.println(timesFutebolAmericano[5] + " x " + timesFutebolAmericano[1]);
                                System.out.println(timesFutebolAmericano[2] + " x " + timesFutebolAmericano[4]);
                            }
                            System.out.println("++++++++++++++++++++++++++");
                        }
                    }
                }
            }
        }
    }
}