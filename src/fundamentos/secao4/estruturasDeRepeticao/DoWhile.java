package fundamentos.secao4.estruturasDeRepeticao;

import javax.swing.*;

public class DoWhile {

    public static void main(String[] args) {
        String texto = "";

        do {
            JOptionPane.showMessageDialog(null, "Digite a resposta certa");
            texto = (JOptionPane.showInputDialog("Arereeeeê, o Grêmio vai jogar a série..."));
        } while (!texto.equalsIgnoreCase("B"));

        JOptionPane.showMessageDialog(null, " B B B B B B ");
        JOptionPane.showMessageDialog(null, "TODOS OS DIAS!");
    }
}
