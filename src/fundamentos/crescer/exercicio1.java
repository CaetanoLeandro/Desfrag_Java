package fundamentos.crescer;

import javax.swing.*;
import java.util.Scanner;

public class exercicio1 {


    public static void main(String[] args) {

        String senha;
        final String permitidos = "[a-zA-Z0-9]+";

        Scanner sc = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Digite uma senha de 8 a 32 caracteres, compelo menos uma letra maíúscula, um número e " +
                "SEM pontuação");
        senha = (JOptionPane.showInputDialog("Senhe: "));

        if (senha.length() >= 6 && senha.length() <= 32 && senha.matches(permitidos)) {
            JOptionPane.showMessageDialog(null, "Senha valida.");
        } else {
            JOptionPane.showMessageDialog(null, "Senha invalida.");
        }
    }
}
