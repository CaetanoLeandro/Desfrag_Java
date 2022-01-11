package fundamentos.secao6.colecoes.equalsNequalsHcode;

public class EqualsObj {


    public static void main(String[] args) {

        User u1 = new User();
        u1.name = "Leandro Caetano";
        u1.email = "leandro@zmail.com";

        User u2 = new User();
        u2.name = "Leandro Caetano";
        u2.email = "leandro@zmail.com";

        System.out.println(u1 == u2); // Quando a comparação é feita com objetos,
        // o que é comparado éa posição na memória, não o conteúdo do objeto
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
