package TDE02;

import javax.swing.*;

public class Ex02 {

    public static void main(String[] args) {
        double valorTransacao;
        double valorVenal;
        double percentualDesconto;
        double valorImposto;
        String digitado;
        digitado = JOptionPane.showInputDialog("Digite o valor da transação: ");
        valorTransacao = Double.parseDouble(digitado);
        digitado = JOptionPane.showInputDialog("Digite o valor venal de referência: ");
        valorVenal = Double.parseDouble(digitado);
        digitado = JOptionPane.showInputDialog("Digite o percentual de desconto: ");
        percentualDesconto = Double.parseDouble(digitado);
        if (valorTransacao > valorVenal) {
            valorImposto = valorTransacao * percentualDesconto / 100;
        }
        else {
            valorImposto = valorVenal * percentualDesconto / 100;
        }
        JOptionPane.showMessageDialog(null, "O valor do imposto será de: " + valorImposto);
    }
}
