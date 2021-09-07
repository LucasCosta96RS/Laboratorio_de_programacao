package Atividade;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeProduto;
        double valorProduto;
        double valorComDesconto;
        final double DESCONTO = 0.12;
        System.out.println("Bem-vindo ao sistema de cadastro de itens!");
        do {
            System.out.println("\nDigite o valor do produto: ");
            valorProduto = teclado.nextDouble();
            if (valorProduto > 0) {
                System.out.println("Digite o nome do produto: ");
                nomeProduto = teclado.next();
                valorComDesconto = valorProduto + (valorProduto * DESCONTO);
                System.out.println("O novo valor do produto " + nomeProduto.toUpperCase() + " é: " + Math.round(valorComDesconto));
            }
        } while (valorProduto != 0);
    }
}
