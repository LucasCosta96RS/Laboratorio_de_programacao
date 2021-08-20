package TDE02;

import javax.swing.*;
import java.text.DecimalFormat;

public class Ex03 {

    private static final DecimalFormat dft = new DecimalFormat("#.#");

    public static void main(String[] args) {
        double notaProva1;
        double notaProva2;
        double notaTrabalho;
        double media;
        String digitado;
        digitado = JOptionPane.showInputDialog("Digite a primeira nota: ");
        notaProva1 = Double.parseDouble(digitado);
        digitado = JOptionPane.showInputDialog("Digite a segunda nota: ");
        notaProva2 = Double.parseDouble(digitado);
        digitado = JOptionPane.showInputDialog("Digite a nota do trabalho: ");
        notaTrabalho = Double.parseDouble(digitado);
        media = (notaProva1 + notaProva2 + notaTrabalho) / 3;
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Você ficou com média " + dft.format(media) + " e foi aprovado!");
        }else {
            JOptionPane.showMessageDialog(null, "Você ficou com média " + dft.format(media) + " e foi reprovado.");
        }
    }
}
