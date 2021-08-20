package TDE02;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorProduto;
        double valorComDesconto;
        String nomeProduto;
        System.out.println("Digite o nome do produto: ");
        nomeProduto = teclado.next();
        System.out.println("Digite o valor do produto em R$: ");
        valorProduto = teclado.nextDouble();
        if (valorProduto < 50 && valorProduto > 0) {
            System.out.println("O produto " + nomeProduto.toUpperCase() + " de valor R$" + valorProduto + " não se aplica a nenhum desconto.");
        } else if (valorProduto >= 50 && valorProduto < 200) {
            valorComDesconto = valorProduto - (valorProduto * 0.05);
            System.out.println("O produto " + nomeProduto.toUpperCase() + " de valor R$" + valorProduto + " com 5% de desconto ficará R$" + valorComDesconto);
        }else if (valorProduto >= 200 && valorProduto < 500) {
            valorComDesconto = valorProduto - (valorProduto * 0.06);
            System.out.println("O produto " + nomeProduto.toUpperCase() + " de valor R$" + valorProduto + " com 6% de desconto ficará R$" + valorComDesconto);
        } else if (valorProduto >= 500 && valorProduto < 1000) {
            valorComDesconto = valorProduto - (valorProduto * 0.07);
            System.out.println("O produto " + nomeProduto.toUpperCase() + " de valor R$" + valorProduto + " com 7% de desconto ficará R$" + valorComDesconto);
        } else if (valorProduto >= 1000) {
            valorComDesconto = valorProduto - (valorProduto * 0.08);
            System.out.println("O produto " + nomeProduto.toUpperCase() + " de valor R$" + valorProduto + " com 8% de desconto ficará R$" + valorComDesconto);
        } else {
            System.out.println("O valor digitado não é aceito pelo sistema.");
        }
    }
}

