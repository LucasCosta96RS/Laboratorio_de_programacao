package Atividade;

public class Ex03 {

    public static void main(String[] args) throws InterruptedException {
        int sorteio;
        int numeroSorteado;
        StringBuilder senha = new StringBuilder();
        System.out.println("Bem-vindo ao gerador de senhas aleatórias!");
        Thread.sleep(2000);
        sorteio = 5 + (int)(Math.random() * ((10 - 5) + 1));
        System.out.println("Sua senha terá " + sorteio + " números.");
        Thread.sleep(2000);
        System.out.println("Começando a gerar seu número!");
        Thread.sleep(2000);
        for (int i = 1; i <= sorteio; i++) {
            numeroSorteado = (int) (Math.random() * 10 - 1);
            senha.append(numeroSorteado);
        }
        System.out.println("E a senha é: " + senha);
    }
}
