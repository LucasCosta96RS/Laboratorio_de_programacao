package TDE02;

import javax.swing.*;

public class Ex07 {

    public static void main(String[] args) {
        String login;
        String senha;
        int contador;
        int contadorTentativas;
        contadorTentativas = 3;
        contador = 0;
        while (contador < 3) {
            login = JOptionPane.showInputDialog("Digite seu Login");
            senha = JOptionPane.showInputDialog("Digite sua senha");
            contador += 1;
            contadorTentativas -= 1;
            if (login.equals("java8") && senha.equals("java8")) {
                JOptionPane.showMessageDialog(null, "Login e senha corretos.");
                contador += 3;
            } else if (!login.equals("java8") && !senha.equals("java8") && contadorTentativas != 0) {
                JOptionPane.showMessageDialog(null, "Tente novamente, você ainda tem " + contadorTentativas + " tentativas.");
            }
        }
    }
}
