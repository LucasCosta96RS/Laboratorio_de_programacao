package TDE02;

import javax.swing.*;

public class Ex07 {

    public static void main(String[] args) {
        String login;
        String senha;
        int contador;
        contador = 3;
        while (contador > 0) {
            login = JOptionPane.showInputDialog("Digite seu Login");
            senha = JOptionPane.showInputDialog("Digite sua senha");
            contador -= 1;
            if (login.equals("java8") && senha.equals("java8")) {
                JOptionPane.showMessageDialog(null, "Login e senha corretos.");
                contador -= 3;
            } else if (!login.equals("java8") && !senha.equals("java8") && contador != 0) {
                JOptionPane.showMessageDialog(null, "Tente novamente, você ainda tem " + contador + " tentativas.");
            }
        }
    }
}
