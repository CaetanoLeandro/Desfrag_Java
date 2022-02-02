package fundamentos.crescer;

import java.util.Scanner;

public class exercicio1 {


    public static void main(String[] args) {

        String senha;
        final String permitidos = "[a-zA-Z0-9]+";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha de 8 a 32 caracteres, compelo menos uma letra maíúscula, um número e " +
                "SEM pontuação");
        senha = sc.next();

        if (senha.length() >= 6 && senha.length() <= 32 && senha.matches(permitidos)) {
            System.out.println("Senha valida.");
        } else {
            System.out.println("Senha invalida.");
        }
        sc.close();
    }
}
